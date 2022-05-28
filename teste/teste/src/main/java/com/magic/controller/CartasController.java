package com.magic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.magic.model.CartasModel;
import com.magic.repository.CartasRepository;


@RestController
@RequestMapping("/cartas")

public class CartasController {
	
	@Autowired
	private CartasRepository CartasRepository;
	
	@GetMapping
	public ResponseEntity<List<CartasModel>> getAll() {
		return ResponseEntity.ok(CartasRepository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<CartasModel>> getByName(@PathVariable String nome) {
		return ResponseEntity.ok(CartasRepository.findAllByCartasContainingIgnoreCase(nome));
	}
	
	@PostMapping("/vender")
	public ResponseEntity<CartasModel> vender(
	@RequestBody CartasModel cartasModel) {
	return ResponseEntity.status(HttpStatus.CREATED).body(CartasRepository.save(cartasModel));
	}


}
