package com.learnngrow.springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnngrow.springboot.Beans.Television;
import com.learnngrow.springboot.Services.TelevisionService;
import com.learnngrow.springboot.repository.MyTelevisionRepo;

@RestController
public class TelevisionController {

	@Autowired
	MyTelevisionRepo repo ;
	
	@Autowired
	TelevisionService tService ;
	
	@RequestMapping("TelevisionList")
	@ResponseBody
	public List<Television> getTelevisionList(){
		
		return tService.getAllTelevision();
	}
	
//	@RequestMapping("TelevisionListFromDB")
//	@ResponseBody
//	public List<Television> getTelevisionListFromDb(){
//		
//		return tService.getAllTelevisionList();
//	}
	
	@RequestMapping("televisionListFromDB")
	@ResponseBody
	public List<Television> getTelevision(){
		
		return repo.findAll();
	}
	
		
	@GetMapping("television/{tId}")
	public Optional<Television> getTelevisionDetails(@PathVariable int tId){
		return repo.findById(tId);
	}
	
	@PostMapping(value="addTelevision")
	public Television addTelevision(@RequestBody Television tv){
		repo.save(tv);
		
		return tv;
	}
	
	@PutMapping(value="updateTelevision")
	public Television updateTelevision(@RequestBody Television tv){
		if(repo.findById(tv.productId) ==null) {
			//return false;
		}
		repo.save(tv);
		
		return tv;
	}
	
	@DeleteMapping(value="deleteTelevision/{tId}")
	public boolean updateTelevision(@PathVariable int tId){
		repo.deleteById(tId);
		return true;
		
	}
	
	
	
}
