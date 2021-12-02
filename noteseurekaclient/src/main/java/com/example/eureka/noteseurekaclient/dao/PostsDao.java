package com.example.eureka.noteseurekaclient.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eureka.noteseurekaclient.model.Posts;




@Repository
@Transactional
public interface PostsDao extends JpaRepository<Posts,Integer> {

}
