package com.learnngrow.springboot.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.learnngrow.springboot.Beans.Television;
import com.learnngrow.springboot.repository.MyTelevisionRepo;

@Component
public class TelevisionService {

	List<Television> tvList ;
	MyTelevisionRepo tvRepo;
	
	public List<Television> getAllTelevision(){
		ArrayList<Television> tList = new ArrayList<Television>();
//		tList.add(new Television("Samsung", "OLED", 22999f , "Smart"));
//		tList.add(new Television("LG", "LCD", 2200f , "Old "));
		return tList;
	} 
	
//	public List<Television> getAllTelevisionList(){
//
//		return tvRepo.findAll();
//	} 
	
	public Optional<Television> getTelevision(){

		return tvRepo.findById(101);
	}
	
	
}
