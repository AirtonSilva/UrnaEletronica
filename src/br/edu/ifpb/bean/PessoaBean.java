package br.edu.ifpb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.edu.ifpb.dao.PessoaDAO;
import br.edu.ifpb.entidade.Pessoa;

@RequestScoped
@ManagedBean(name = "pessoaBean")

public class PessoaBean{
	
	private Logger logger = LogManager.getLogger(PessoaBean.class);
	private Pessoa pessoa;
	private PessoaDAO pessoaDAO;
	private ArrayList<Pessoa> pessoas;
	private Pessoa listar;
	
	private String nome;
	private String endereco;
	private int cpf;
	private int rg;
	private int titulo;
	private String partido;
	private int numero;
	private String categoria;
	
	private Pessoa candidato;
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = PessoaDAO.getInstance().getAll();
		
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getId());
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getEndereco());
			System.out.println(pessoa.getCpf());
			System.out.println(pessoa.getRg());
			System.out.println(pessoa.getTitulo());
		}
		
	}
		
	public PessoaBean(){
		this.candidato = new Pessoa();
		this.pessoaDAO = new PessoaDAO();
	}
	
	public Pessoa getCandidato() {
		return candidato;
	}

	public void setCandidato(Pessoa candidato) {
		this.candidato = candidato;
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String cadastrarCandidato() {
		
		candidato.setNome(nome);
		System.out.println(candidato.getNome());
		candidato.setEndereco(endereco);
		System.out.println(candidato.getEndereco());
		candidato.setCpf(cpf);
		System.out.println(candidato.getCpf());
		candidato.setRg(rg);
		System.out.println(candidato.getRg());
		candidato.setTitulo(titulo);
		System.out.println(candidato.getTitulo());
		candidato.setPartido(partido);
		System.out.println(candidato.getPartido());
		candidato.setNumero(numero);
		System.out.println(candidato.getNumero());
		candidato.setCategoria(categoria);
		System.out.println(candidato.getNumero());
		
		return null;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	
	
}
