package com.api.souls.repository;

import com.api.souls.entity.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WpnRepository extends JpaRepository<Weapon, Integer> {
    List<Weapon> findByGame (String game);
    Weapon findByName (String name);
}
