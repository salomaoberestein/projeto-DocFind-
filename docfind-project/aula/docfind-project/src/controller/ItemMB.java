
package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.ItemDAO;
import model.Item;

@ManagedBean
public class ItemMB {
	private Item item;
	private ItemDAO itemDAO;
	private List<Item> Lista;	
	
	public ItemMB() {
		itemDAO = new ItemDAO();
		item = new Item();
		
		Lista = itemDAO.listarTodos();				
	}
	
	public Item getItem(){
		return this.item;
	}
	
	public void setItem(Item item){
		this.item = item;
	}
	
	public List<Item> getList() {
		return this.Lista;
	}
	
	public void salvar() {
		itemDAO.salvar(item);
		item = new Item();
		Lista = itemDAO.listarTodos();

		addMessage("Salvo com sucesso!!");
		
	}
	
	public void excluir() {
		itemDAO.excluir(item);
		item = new Item();
		Lista = itemDAO.listarTodos();

		addMessage("Excluido com sucesso!!");
		
	}
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
}	