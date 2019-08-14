package com.learnngrow.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.learnngrow.springboot.Beans.Television;

public interface MyTelevisionRepo extends JpaRepository<Television, Integer>{

}
