package com.JWT_SpringBoot.Repository;

import com.JWT_SpringBoot.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface USerRepository extends JpaRepository<User, Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username=(:username)")
    public  User findByUserName(@Param("username") String username);

    boolean existsByUsername(String username);
}
