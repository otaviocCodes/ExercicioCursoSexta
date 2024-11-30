package application;

import javax.swing.JOptionPane;

import entities.Client;

public class ProgramClient {

	public static void main(String[] args) {

		Client client = new Client();

		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n" + "1. Adicionar cliente na lista\n"
					+ "2. Remover cliente da lista\n" + "3. Mostrar número de clientes na lista\n"
					+ "4. Mostrar clientes da lista\n" + "5. Sair\n"));

			switch (opcao) {

			case 1:
				String name = JOptionPane.showInputDialog("Insira o nome do cliente a ser adicionado");
				client.addClient(name);
				break;

			case 2:
				name = JOptionPane.showInputDialog("Insira o nome do cliente a ser removido");
				client.removeClient(name);
				break;

			case 3:
				client.numeroDeClientes();
				break;

			case 4:
				client.mostrarClientes();
				break;

			case 5:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, tente de novo");

			}

		} while (opcao != 5);

	}
}
