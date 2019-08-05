package com.bit.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	String uploadDir="C:\\java\\upload\\";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/"
			, method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value = "/upload"
			,method = RequestMethod.POST)
	public String upload(Model model,MultipartFile file1,String sub){
		logger.debug(sub);
		logger.debug(file1.getOriginalFilename());
		long time=System.currentTimeMillis();
		String origin=file1.getOriginalFilename();
		String newName=time+origin;
		
		File file=new File(uploadDir+newName);

		try {
			file1.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		InputStream is=null;
//		OutputStream os=null;
//		try {
//			is=file1.getInputStream();
//			os=new FileOutputStream(file);
//			int temp=0;
//			while((temp=is.read())!=-1) {
//				os.write(temp);
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(os!=null)os.close();
//				if(is!=null)is.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		model.addAttribute("filename", newName);
		model.addAttribute("origin", origin);
		return "down";
	}
	
	@RequestMapping("/download/{filename:.+}")
	public void download(String origin,HttpServletResponse resp,@PathVariable String filename) {
		logger.debug("down:"+filename);
		logger.debug("down:"+origin);
		// target="_blank"
		// 파일을 브라우저가 직접 처리하지 못하도록 모르는 형식으로 전달
		//resp.setContentType("application/octet-stream;charset=\"utf-8\"");
		//
		
		// 파일의 오리지날 이름으로 돌려놓기
		//resp.setHeader("Content-Disposition"
		//		, "attachment; filename=\""+origin+"\"");
		//
		
		File file=new File(uploadDir+filename);
		OutputStream os=null;
		InputStream is=null;
		
		try {
			os=resp.getOutputStream();
			is=new FileInputStream(file);
			int temp=0;
			while((temp=is.read())!=-1) {
				os.write(temp);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}




































