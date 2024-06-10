package application;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	@Override
	public void ligar(String numero) {
		System.out.println("Realizando ligação para o número "+numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz");
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando música");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: "+musica);
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando "+url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}
	
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar("12 93456-7890");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println("\n");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Boulevard of Broken Dreams");
		System.out.println("\n");
		iphone.exibirPagina("www.google.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
	}
	
}
