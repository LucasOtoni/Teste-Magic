package com.magic.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.magic.model.CartasModel;

@Repository
public interface CartasRepository extends JpaRepository<CartasModel, Long>{
	
	public Optional<CartasModel> findByCartasModel(String CartasModel);
	
	public List <CartasModel> findAllByCartasContainingIgnoreCase (String cartas);
	
}
