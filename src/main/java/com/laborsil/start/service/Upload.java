package com.laborsil.start.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Upload {

	public void uploadfile(MultipartFile file) throws IllegalStateException, IOException {
		file.transferTo(new File("C:\\Users\\ti\\Desktop\\TesteImagem\\"+file.getOriginalFilename()));
	}
}
