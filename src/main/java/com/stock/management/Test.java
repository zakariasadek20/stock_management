package com.stock.management;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.stock.management.repositories.impl.IFlickrRepositoryImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFlickrRepositoryImpl flickr = new IFlickrRepositoryImpl();
		//flickr.auth();
	
		try {
			InputStream inputStream=new FileInputStream(new File("D:\\Image2.jpg"));
			String url=flickr.savePhoto(inputStream, "image2");
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
