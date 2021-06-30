import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class TestaCadastro {

	static List<Informacao> listaAeronaves = new ArrayList<>();
	static Scanner leitura = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;
		int menuCadastro;

		do {
			System.out.println("-          MENU INICIAL       -\n");
			System.out.println("-----------------------------------------------\n");
			System.out.println("1  - Cadastrar uma Aeronave\n");
			System.out.println("2  - Exibir Dados de Aeronaves Cadastradas\n");
			System.out.println("3  - Remover uma Aeronave Cadastrada\n");
			System.out.println("4  - Alterar dados de uma Aeronave Cadastrada\n");
			System.out.println("5  - Pesqu1isar uma Aeronave\n");
			System.out.println("6  - Sair\n");

			System.out.print("Informe a opção: ");
			opcao = leitura.nextInt();
			System.out.println("-----------------------------------------------");
			if (opcao == 1) {
				System.out.println("Escolha o tipo de Aeronave ");
				System.out.println("1 - Hercules | 2 - Caravan | 3 - Tucano");

				System.out.print("Informe a opção: ");
				menuCadastro = leitura.nextInt();

				if (menuCadastro == 1) {
					menuHercules();
				}
				if (menuCadastro == 2) {
					menuCaravan();
				}
				if (menuCadastro == 3) {
					menuTucano();
				}
			}
			if (opcao == 2) {
				System.out.println("      Aeronaves Cadastradas no sistema          \n");
				exibirAeronave();
			}
			if (opcao == 3) {
				System.out.println("      Aeronaves Cadastradas no sistema          \n");
				remover();

			}
			if (opcao == 4) {
				alterar();
			}
			if (opcao == 5) {
				pesquisa();
			}

		} while (opcao != 6);
		System.out.println("-        Encerrando Aplicação!       -");
		leitura.close();

	}

	public static void menuHercules() {
		System.out.print("Menu de Cadastro Hercules\n");
		Hercules h1 = new Hercules();
		System.out.print("Nome: ");
		h1.setNome(leitura.next());
		System.out.print("Modelo: ");
		h1.setModelo(leitura.next());
		h1.setFabricacao(new Date());
		System.out.print("Capacidade de Carga: ");
		h1.setCapacidadeCarga(leitura.next());
		listaAeronaves.add(h1);
		System.out.println("Cadastro Finalizado\n");
	}

	public static void menuCaravan() {
		System.out.print("Menu de Cadastro Caravan\n");
		Caravan c1 = new Caravan();
		System.out.print("Nome: ");
		c1.setNome(leitura.next());
		System.out.print("Modelo: ");
		c1.setModelo(leitura.next());
		c1.setFabricacao(new Date());
		System.out.print("Modelo motor: ");
		c1.setModeloMotor(leitura.next());
		listaAeronaves.add(c1);
		System.out.println("Cadastro Finalizado\n");
	}

	public static void menuTucano() {
		System.out.print("Menu de Cadastro Tucano\n");
		Tucano t1 = new Tucano();
		System.out.print("Nome: ");
		t1.setNome(leitura.next());
		System.out.print("Modelo: ");
		t1.setModelo(leitura.next());
		t1.setFabricacao(new Date());
		System.out.print("Velocidade Maxima: ");
		t1.setVelocidadeMaxima(leitura.next());
		listaAeronaves.add(t1);
		System.out.println("Cadastro Finalizado\n");
	}
	
	public static void posicao() {
		int posicao = 0;
		if (listaAeronaves.isEmpty()) {
			System.out.println("- Nao existem Aeronaves a serem removidas! \n");
		}
		for (int i = 0; i < listaAeronaves.size(); i++) {
			System.out.println(posicao++ + " - " + listaAeronaves.get(i));
		}
	}

	public static void exibirAeronave() {
		if (listaAeronaves.isEmpty()) {
			System.out.println("- Nao existem Aeronaves Cadastradas no momento \n");
		}
		for (Informacao painel : listaAeronaves) {
			painel.exibirDados();
			System.out.println(" ------------------------------------------------- \n");
		}

	}

	public static void remover() {
		posicao();
		if (listaAeronaves.isEmpty() == false) {
			System.out.print("Informe o numero da aeronave a ser removida: ");
			listaAeronaves.remove(leitura.nextInt());
			System.out.println("Aeronave Removida com sucesso!! \n");
			return;
		}

	}

	public static void alterar() {
		posicao();
		System.out.print("Informe o NUMERO da Aeronave que deseja alterar: ");
		Informacao aero = listaAeronaves.get(leitura.nextInt());

		if (aero instanceof Hercules ) {
			Hercules h1 = (Hercules) aero;
			System.out.print("Digite o nome: ");
			h1.setNome(leitura.next());
			System.out.print("Digite o modelo: ");
			h1.setModelo(leitura.next());
			System.out.print("Digite a Capacidade de Carga: ");
			h1.setCapacidadeCarga(leitura.next());

		}
		if (aero instanceof Caravan) {
			Caravan c1 = (Caravan) aero;
			System.out.print("Nome: ");
			c1.setNome(leitura.next());
			System.out.print("Modelo: ");
			c1.setModelo(leitura.next());
			System.out.print("Modelo motor: ");
			c1.setModeloMotor(leitura.next());

		}
		if (aero instanceof Tucano) {
			Tucano t1 = (Tucano) aero;
			System.out.print("Nome: ");
			t1.setNome(leitura.next());
			System.out.print("Modelo: ");
			t1.setModelo(leitura.next());
			System.out.print("Velocidade Maxima: ");
			t1.setVelocidadeMaxima(leitura.next());
		}
	}

	public static void pesquisa() {
		String valorProcurado;
		System.out.println("Digite o Nome ou Modelo da Aeronave que deseja procurar: ");
		valorProcurado = leitura.next();
		;
		for (Informacao pesquisa : listaAeronaves) {
			if (pesquisa.getNome().toLowerCase().contains(valorProcurado)
					|| pesquisa.getModelo().toLowerCase().contains(valorProcurado)) {
				pesquisa.exibirDados();
			} else 
				System.out.println("Aeronave nao encontrada!!");
				return;
			
		}
	}

}
