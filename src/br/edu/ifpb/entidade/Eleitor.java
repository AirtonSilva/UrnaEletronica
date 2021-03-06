package br.edu.ifpb.entidade;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_eleitor")
@NamedQuery(name = "Eleiotr.getAll", query = "from Eleitor")
@DiscriminatorValue(value = "2") 	//Identificador para tabela Eleitor
public class Eleitor extends Pessoa {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_eleitor")
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
