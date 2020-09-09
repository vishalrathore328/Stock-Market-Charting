package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Company;
import com.example.demo.entity.IpoDetails;

@Repository
public interface IpoDetailsDao extends JpaRepository<IpoDetails, Integer>{
	public List<IpoDetails> findByCompanyName(String name);
}
