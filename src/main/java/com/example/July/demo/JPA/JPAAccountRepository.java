package com.example.July.demo.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPAAccountRepository extends JpaRepository<bankAccount, Long> {

}
