package com.example.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

		public List<Produto> findAllByNomeJogoContainingIgnoreCase(@Param("nomeJogo") String nomeJogo);
}
