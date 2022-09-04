package lk.bolton.repo;

import lk.bolton.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sahan Nimesha on 2022 - Sep
 * In IntelliJ IDEA
 */

public interface CustomerRepo extends JpaRepository<Customer,String> {

}
