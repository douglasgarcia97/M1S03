package Banco_Floripa;

import java.util.Scanner;

public class Endereco {
	
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String tipo;
	private Integer numero;
	
	
	
	
	public Endereco() {
		Scanner entrada = new Scanner (System.in);
	System.out.println("Informe seu cep:");
	this.cep = entrada.nextLine();
	System.out.println("Informe seu logradouro:");
	this.logradouro = entrada.nextLine();
	System.out.println("Informe seu bairro:");
	this.bairro = entrada.nextLine();
	System.out.println("Informe seu cidade:");
	this.cidade = entrada.nextLine();
	System.out.println("Informe seu estado:");
	this.estado = entrada.nextLine();
	System.out.println("complemento residência:");
	this.tipo = entrada.nextLine();
	System.out.println("Informe seu numero:");
	this.numero = entrada.nextInt();
	
	}
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + ", tipo=" + tipo + ", numero=" + numero + "]";
	}


}
