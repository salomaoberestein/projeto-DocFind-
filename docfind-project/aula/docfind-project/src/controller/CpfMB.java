
package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.CpfDAO;
import model.Cpf;

@ManagedBean
public class CpfMB {
	private Cpf cpf;
	private CpfDAO cpfDAO;
	private List<Cpf> Lista;	
	
	public CpfMB() {
		cpfDAO = new CpfDAO();
		cpf = new Cpf();
		
		Lista = cpfDAO.listarTodos();				
	}
	
	public Cpf getCpf(){
		return this.cpf;
	}
	
	public void setCpf(Cpf cpf){
		this.cpf = cpf;
	}
	
	public List<Cpf> getList() {
		return this.Lista;
	}
	
	public void salvar() {
		cpfDAO.salvar(cpf);
		cpf = new Cpf();
		Lista = cpfDAO.listarTodos();

		addMessage("Salvo com sucesso!!");
		
	}
	
	public void excluir() {
		cpfDAO.excluir(cpf);
		cpf = new Cpf();
		Lista = cpfDAO.listarTodos();

		addMessage("Excluido com sucesso!!");
		
	}
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
}	