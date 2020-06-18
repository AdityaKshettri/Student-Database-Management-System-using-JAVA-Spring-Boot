package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{
	
}
