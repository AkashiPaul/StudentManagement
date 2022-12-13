package net.javaguides.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Semester_1Repository extends JpaRepository<Semester_1,String>{
	public Semester_1 findByName(String name);
}
