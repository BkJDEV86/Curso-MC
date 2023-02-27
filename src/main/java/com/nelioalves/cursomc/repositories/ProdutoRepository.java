package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Produto;

@Repository// Aqui vai o id , por isso é do tipo Integer
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
