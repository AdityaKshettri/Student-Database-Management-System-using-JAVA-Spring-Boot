package studentdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentdbms.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer>
{

}
