package com.joaov7r.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaov7r.dslist.entites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}
