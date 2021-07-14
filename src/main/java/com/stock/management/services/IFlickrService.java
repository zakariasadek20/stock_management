package com.stock.management.services;

import java.io.InputStream;

public interface IFlickrService {
	public String savePhoto(InputStream inputStream,String fileName) throws Exception;

}
