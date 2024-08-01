package com.andela.training.springTraining.api.model.entity;

public class RequisicaoAtualizacaoCompra {
	private String quantidade;

	public Compra converterParaActualizacaoCompra(Compra compra) {
		compra.setQuantidade(Integer.parseInt(quantidade));
		return compra;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
