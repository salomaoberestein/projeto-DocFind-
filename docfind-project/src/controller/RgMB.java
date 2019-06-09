
package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.RgDAO;
import model.Rg;

@ManagedBean
public class RgMB {
	private Rg rg;
	private RgDAO rgDAO;
	private List<Rg> Lista;	
	
	public RgMB() {
		rgDAO = new RgDAO();
		rg = new Rg();
		
		Lista = rgDAO.listarTodos();				
	}
	
	public Rg getRg(){
		return this.rg;
	}
	
	public void setRg(Rg rg){
		this.rg = rg;
	}
	
	public List<Rg> getList() {
		return this.Lista;
	}
	
	public void salvar() {
		rgDAO.salvar(rg);
		rg = new Rg();
		Lista = rgDAO.listarTodos();

		addMessage("Salvo com sucesso!!");
		
	}
	
	public void excluir() {
		rgDAO.excluir(rg);
		rg = new Rg();
		Lista = rgDAO.listarTodos();

		addMessage("Excluido com sucesso!!");
		
	}
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
}	