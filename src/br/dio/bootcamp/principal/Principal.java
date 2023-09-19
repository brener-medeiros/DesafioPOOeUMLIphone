/**
 * 
 */
package br.dio.bootcamp.principal;

import br.dio.bootcamp.smartphone.Iphone;

/**
 * 
 */
public class Principal {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		//usando características de telefone
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		
		//usando caracteristicas do navegador web
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		//usando como repodutor musical
		iphone.selecionarMusica("Mágica - Calcinha Preta");
		iphone.tocarMusica();
		iphone.pausarMusica();
		
		
	
	}
}