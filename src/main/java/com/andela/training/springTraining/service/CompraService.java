package com.andela.training.springTraining.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andela.training.springTraining.api.model.entity.Compra;
import com.andela.training.springTraining.api.model.entity.RequisicaoAtualizacaoCompra;
import com.andela.training.springTraining.api.model.entity.RequisicaoCompra;
import com.andela.training.springTraining.repository.CompraRepository;
import com.andela.training.springTraining.repository.ProdutoRepository;

@Service
public class CompraService {

	@Autowired
	private CompraRepository compraRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Compra> listarCompras() {
		return compraRepository.findAll();
	}

	public Compra inserirCompra(RequisicaoCompra requisicaoCompra) {
		Compra converterParaCompra = requisicaoCompra.converterParaCompra(produtoRepository);

		return compraRepository.save(converterParaCompra);
	};

	public Compra actualizarCompra(Long compraId, RequisicaoAtualizacaoCompra requisicaoAtualizacaoCompra) {

		Optional<Compra> compraOp = compraRepository.findById(compraId);

		if (compraOp.isPresent()) {
			Compra compra = compraOp.get();
			Compra converterParaActualizarCompra = requisicaoAtualizacaoCompra.converterParaActualizacaoCompra(compra);

			return compraRepository.save(converterParaActualizarCompra);
		} else {
			return null;
		}
	};

	public void apagarCompra(Long id) {
		compraRepository.deleteById(id);
	}

}
