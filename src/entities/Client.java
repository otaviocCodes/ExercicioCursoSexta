package entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Client {
	
	private List<String> clients;
	
	public Client() {
		clients = new ArrayList<>();
	}
	
	public void addClient(String name) {
		clients.add(name);
	}
	
	public void removeClient(String name) {
		clients.remove(name);
	}
	
	public void numeroDeClientes() {
		JOptionPane.showMessageDialog(null, clients.size());
	}
	
	public void mostrarClientes() {
		if(clients.isEmpty()){
			JOptionPane.showMessageDialog(null, "Lista de clientes vazia");
		}
		else {
			String lista = "";
			for(String client : clients) {
				lista += client + "\n";
			}
			JOptionPane.showMessageDialog(null, "Lista de clientes:\n" + lista);
		}
	}
	
}
