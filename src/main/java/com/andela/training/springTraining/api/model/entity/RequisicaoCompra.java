package com.andela.training.springTraining.api.model.entity;

import java.util.Optional;

import com.andela.training.springTraining.repository.ProdutoRepository;

public class RequisicaoCompra {
	private String produtoId;
	private String quantidade;

	public Compra converterParaCompra(ProdutoRepository produtoRepository) {
		Optional<Produto> opProduto = produtoRepository.findById(Long.parseLong(produtoId));
		Produto produto = opProduto.get();
		Compra compra = new Compra();
		compra.setQuantidade(Integer.parseInt(quantidade));
		compra.setProduto(produto);
		return compra;
	}

	public String getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(String produtoId) {
		this.produtoId = produtoId;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
