package com.stock.management.repositories.impl;

import java.io.InputStream;

import javax.swing.JOptionPane;


import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.stock.management.repositories.IFlickrRepository;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuth1Token;

public class IFlickrRepositoryImpl implements IFlickrRepository {

	private Flickr flickr;
	
	private UploadMetaData uploadMetaData = new UploadMetaData();
	
	private String apiKey = "632e2375e9457552b1d131eda105a968";
	
	private String sharedSecret = "0c9ffeb8f8c58c17";
	
	/*Authentication success
	Token: 72157719552083637-0aa9893a20fc7b5d
	Secret: 466c0e8eed384afd
	nsid: 193535205@N08
	Realname: aspire one
	Username: zakariasadek20
	Permission: delete*/
	
	private void connect() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		Auth auth = new Auth();
		auth.setPermission(Permission.READ);
		auth.setToken("72157719552083637-0aa9893a20fc7b5d");
		auth.setTokenSecret("466c0e8eed384afd");
		RequestContext requestContext = RequestContext.getRequestContext();
		requestContext.setAuth(auth);
		flickr.setAuth(auth);
	}
	

	@Override
	public String savePhoto(InputStream strem, String fileName) throws Exception {
		connect();
		uploadMetaData.setTitle(fileName);
		String photoId = flickr.getUploader().upload(strem, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	
	public void auth() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		 Flickr.debugStream = false;
		AuthInterface authInterface = flickr.getAuthInterface();

        OAuth1RequestToken requestToken = authInterface.getRequestToken();
        System.out.println("token: " + requestToken);
		
        String url = authInterface.getAuthorizationUrl(requestToken, Permission.DELETE);
        System.out.println("Follow this URL to authorise yourself on Flickr");
		System.out.println(url);
		System.out.println("paste in the token it gives you");
		System.out.println(">>");
		
		String tokenKey = JOptionPane.showInputDialog(null) ;

        OAuth1Token accessToken = authInterface.getAccessToken(requestToken, tokenKey);
        System.out.println("Authentication success");
			
		Auth auth =null;
		try {
			 auth = authInterface.checkToken(accessToken);
		}catch(FlickrException e) {
			e.printStackTrace();
		}
		
		// this token can be used until the user revoker it.
		System.out.println("Token: "+ accessToken.getToken());
		System.out.println("Secret: "+ accessToken.getTokenSecret());
		System.out.println("nsid: "+ auth.getUser().getId());
		System.out.println("Realname: "+ auth.getUser().getRealName());
		System.out.println("Username: "+ auth.getUser().getUsername());
		System.out.println("Permission: "+ auth.getPermission());
			
	}

}

