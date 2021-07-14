package com.stock.management.repositories;

import java.io.InputStream;

public interface IFlickrRepository {

	public String savePhoto(InputStream inputStream,String fileName) throws Exception;
}
