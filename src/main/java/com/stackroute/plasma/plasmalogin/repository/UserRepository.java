package com.stackroute.plasma.plasmalogin.repository;

import com.stackroute.plasma.plasmalogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,String> {
    public User findByUserIdAndPassword(String userId, String password);
}
