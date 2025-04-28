package org.codingwallah.handsOn.repository;


import org.codingwallah.handsOn.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    //custom Method if we want to create any we can
    //List<EmployeeEntity> findByName(String name);
    //save, delete, finbyId , findall
}
