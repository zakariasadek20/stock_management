package com.stock.management.services.impl;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.stock.management.repositories.IFlickrRepository;

public class IFlickrServiceImpl implements IFlickrRepository {

	@Autowired
	IFlickrRepository flickrRepository;
	
	@Override
	public String savePhoto(InputStream inputStream, String fileName) throws Exception {
		return flickrRepository.savePhoto(inputStream, fileName);
	}

}
