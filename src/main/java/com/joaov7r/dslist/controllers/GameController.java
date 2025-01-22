package com.joaov7r.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaov7r.dslist.entites.DTO.GameMinDTO;
import com.joaov7r.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gamerService;

	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gamerService.findAll();
		return result;
	}
}
