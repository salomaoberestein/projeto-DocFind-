package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rg {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idrg;
	
	@Column
	private long iditemfk;
	
	@Column 
	private String numerorg;
	
	@Column
	private String cpfrg;
	
	@Column 
	private String nomerg;
	
	@Column 
	private String nomedamaerg;
	
	@Column 
	private String nomedopairg;
	
	@Column
	private String uf;
	
	@Column
	private String ogexpedicao;
	
	
	

	public long getIdrg() {
		return idrg;
	}

	public void setIdrg(long idrg) {
		this.idrg = idrg;
	}

	public long getIditemfk() {
		return iditemfk;
	}

	public void setIditemfk(long iditemfk) {
		this.iditemfk = iditemfk;
	}

	public String getNumerorg() {
		return numerorg;
	}

	public void setNumerorg(String numerorg) {
		this.numerorg = numerorg;
	}

	public String getCpfrg() {
		return cpfrg;
	}

	public void setCpfrg(String cpfrg) {
		this.cpfrg = cpfrg;
	}

	public String getNomerg() {
		return nomerg;
	}

	public void setNomerg(String nomerg) {
		this.nomerg = nomerg;
	}

	public String getNomemaerg() {
		return nomedamaerg;
	}

	public void setNomemaerg(String nomemaerg) {
		this.nomedamaerg = nomemaerg;
	}

	public String getNomepai() {
		return nomedopairg;
	}

	public void setNomepai(String nomepai) {
		this.nomedopairg = nomepai;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getOgexpedicao() {
		return ogexpedicao;
	}

	public void setOgexpedicao(String ogexpedicao) {
		this.ogexpedicao = ogexpedicao;
	}
	
	
	
	
}