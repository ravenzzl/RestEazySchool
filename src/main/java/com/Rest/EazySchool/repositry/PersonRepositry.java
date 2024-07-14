package com.Rest.EazySchool.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.EazySchool.dao.Person;

@Repository
public interface PersonRepositry extends JpaRepository<Person, Integer> {

}
