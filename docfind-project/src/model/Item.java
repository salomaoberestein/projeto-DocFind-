package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long iditem;
	
	@Column
	private int tipodocfk;
	
	@Column 
	private String userachoufk;
	
	@Column 
	private String userperdeufk;
	
	@Column 
	private boolean itemperdido;
	
	@Column 
	private String descricao;
	
	@Column
	private boolean entregue;
	
	
	

	public long getIditem() {
		return iditem;
	}

	public void setIditem(long iditem) {
		this.iditem = iditem;
	}

	public int getTipodocfk() {
		return tipodocfk;
	}

	public void setTipodocfk(int tipodocfk) {
		this.tipodocfk = tipodocfk;
	}

	public String getUserachoufk() {
		return userachoufk;
	}

	public void setUserachoufk(String userachoufk) {
		this.userachoufk = userachoufk;
	}

	public String getUserperdeufk() {
		return userperdeufk;
	}

	public void setUserperdeufk(String userperdeufk) {
		this.userperdeufk = userperdeufk;
	}

	public boolean isItemperdido() {
		return itemperdido;
	}

	public void setItemperdido(boolean itemperdido) {
		this.itemperdido = itemperdido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEntregue() {
		return entregue;
	}

	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}
	
	
	
	
}