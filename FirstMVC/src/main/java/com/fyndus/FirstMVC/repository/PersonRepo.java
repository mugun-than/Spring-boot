package com.fyndus.FirstMVC.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.fyndus.FirstMVC.entity.Person;


@Repository
public interface PersonRepo extends JpaRepository <Person, Integer>{

	@Query(value="select name from Person where id = ?1", nativeQuery = true)
	public String findName(int id);
}
