package net.javaguides.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Semester_2Repository extends JpaRepository<Semester_2,String>{
	public Semester_2 findByName(String name);
}
