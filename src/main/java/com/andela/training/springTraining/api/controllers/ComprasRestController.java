package com.andela.training.springTraining.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andela.training.springTraining.api.model.entity.Compra;
import com.andela.training.springTraining.api.model.entity.RequisicaoAtualizacaoCompra;
import com.andela.training.springTraining.api.model.entity.RequisicaoCompra;
import com.andela.training.springTraining.service.CompraService;

@RestController
@RequestMapping("/api/compras")
public class ComprasRestController {

	@Autowired
	public CompraService compraService;

	@GetMapping
	public List<Compra> list() {
		List<Compra> compras = compraService.listarCompras();
		return compras;
	}

	@PostMapping
	@Transactional
	public Compra create(@RequestBody RequisicaoCompra requisicaoCompra) {
		Compra saved = compraService.inserirCompra(requisicaoCompra);

		return saved;
	}

	@PutMapping("/{id}")
	public Compra update(@PathVariable Long id, @RequestBody RequisicaoAtualizacaoCompra compra) {

		return compraService.actualizarCompra(id, compra);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		compraService.apagarCompra(id);
	}

}
