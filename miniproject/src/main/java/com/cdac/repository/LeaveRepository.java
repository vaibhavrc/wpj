package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdac.entity.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer>{
//	@Query(value = "select max(l.id) from Leave l")
//	public int getMaxId();
}
