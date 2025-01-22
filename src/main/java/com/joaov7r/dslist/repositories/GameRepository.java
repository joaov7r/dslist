package com.joaov7r.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaov7r.dslist.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
}
