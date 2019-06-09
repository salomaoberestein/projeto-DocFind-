
package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.UsuarioDAO;
import model.Usuario;

@ManagedBean
public class UsuarioMB {
	private Usuario usuario;
	private UsuarioDAO usuarioDAO;
	private List<Usuario> Lista;	
	
	public UsuarioMB() {
		usuarioDAO = new UsuarioDAO();
		usuario = new Usuario();
		
		Lista = usuarioDAO.listarTodos();				
	}
	
	public Usuario getUsuario(){
		return this.usuario;
	}
	
	public void setUsuario(Usuario usuario){
		this.usuario = usuario;
	}
	
	public List<Usuario> getList() {
		return this.Lista;
	}
	
	public void salvar() {
		usuarioDAO.salvar(usuario);
		usuario = new Usuario();
		Lista = usuarioDAO.listarTodos();

		addMessage("Salvo com sucesso!!");
		
	}
	
	public void excluir() {
		usuarioDAO.excluir(usuario);
		usuario = new Usuario();
		Lista = usuarioDAO.listarTodos();

		addMessage("Excluido com sucesso!!");
		
	}
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
}	