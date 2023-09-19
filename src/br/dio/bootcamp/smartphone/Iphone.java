package br.dio.bootcamp.smartphone;
import br.dio.bootcamp.interfaces.AparelhoTelefonico;
import br.dio.bootcamp.interfaces.NavegadorInternet;
import br.dio.bootcamp.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirPagina() {
		
		System.out.println("Exibindo página web...");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musíca: " + musica + " selecionada.");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando musíca.");

	}

	@Override
	public void pausarMusica() {
		System.out.println("Musíca pausada");

	}

	@Override
	public void ligar() {
		System.out.println("Ligando...");

	}

	@Override
	public void atender() {
		System.out.println("Chamada Atendida.");

	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz iniciado.");

	}

}
