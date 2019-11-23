package gui;

import personagem.*;
import utilidades.Creador;
import utilidades.Explorar;

public class Controlador {
	
	public Explorar exploration;
	public Heroi HERO;
	public int pointsToDistrib;
	
	public Controlador() {
		pointsToDistrib = 50;
	}
	
	/*
	 * Faz prints no console principal da GUI, na aba Jogo 
	 * */
	public void print(String s) {
		System.out.println(s);
		PlayFrame.console.append(s + "\n");
		PlayFrame.console.setCaretPosition(PlayFrame.console.getText().length()); // rolagem automática
	}
	
	
	/*
	 * Faz prints na area de texto da aba Mochila 
	 * */
	public void printBag(String s) {
		PlayFrame.bagInfo.append(s + "\n");
	}
	
	/*
	 * Atualiza as informações da Mochila
	 * */
	public void updateBagInfo() {
		
	}
	
	/*
	 * Atualiza as informações do Personagem
	 * */
	public void updateCharacterInfo() {
		PlayFrame.updateCharacterInfo();
	}
	
	
	public void createHero(String cls, String name) {
		try {
			HERO = Creador.createHero(cls, name);
			exploration = new Explorar(HERO);
		} catch(NullPointerException e) {
			System.out.println("CreateHero(): "+ e.toString());
		}
	}
	

	/*
	 * Lança janela de pergunta
	 */
	public void launchAsk() {
		PlayFrame.ask = new Perguntar();
		PlayFrame.ask.setVisible(true);
	}
}