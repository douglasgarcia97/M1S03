package Banco_Floripa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Endereco endereco;
	private LocalDate dataNascimento;
	
	
	
	
	public Pessoa() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		this.nome = entrada.nextLine();
		System.out.println("Informe seu cpf:");
		this.cpf = entrada.nextLine();
		System.out.println("Informe sua data de nascimento:");
		this.dataNascimento = LocalDate.parse(entrada.nextLine(), DateTimeFormatter.ofPattern("yyy/MM/dd"));
		this.endereco = new Endereco();
		
	}
		
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento
				+ "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


}
