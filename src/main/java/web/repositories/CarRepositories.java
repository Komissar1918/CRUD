package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.models.Car;
@Repository
public interface CarRepositories extends JpaRepository<Car,Integer> {
}
