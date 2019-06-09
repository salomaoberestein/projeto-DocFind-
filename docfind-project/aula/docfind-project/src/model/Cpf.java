package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cpf {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idcpf;
	
	@Column
	private long iditemfk;
	
	@Column 
	private String nomecpf;
	
	@Column 
	private String numerocpf;
	
	
	

	public long getIdcpf() {
		return idcpf;
	}

	public void setIdcpf(long idcpf) {
		this.idcpf = idcpf;
	}

	public long getIditemfk() {
		return iditemfk;
	}

	public void setIditemfk(long iditemfk) {
		this.iditemfk = iditemfk;
	}

	public String getNomecpf() {
		return nomecpf;
	}

	public void setNomecpf(String nomecpf) {
		this.nomecpf = nomecpf;
	}

	public String getNumerocpf() {
		return numerocpf;
	}

	public void setNumerocpf(String numerocpf) {
		this.numerocpf = numerocpf;
	}


}