package com.alexandra.rodriguez.alfaro.service;

import com.alexandra.rodriguez.alfaro.model.Categoria;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IntServiceCategorias {
	public List<Categoria> obtenerCategorias();
	public void guardar(Categoria categoria);
	public Categoria buscarPorId(Integer idCategoria);
	public void eliminar(Integer idCategoria);
	public Integer numeroCategorias();
	public Page<Categoria> buscarTodas(Pageable page);
}


