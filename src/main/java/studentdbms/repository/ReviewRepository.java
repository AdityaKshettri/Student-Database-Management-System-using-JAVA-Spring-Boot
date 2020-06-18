package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>
{

}
