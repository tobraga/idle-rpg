package utilidades;

import gui.PlayFrame;
import item.Item;
import out.Console;
import personagem.*;
import utilidades.Batalha1v1;
import java.lang.Math;

import mapa.Mapa;
import utilidades.Creador;

public class Explorar extends java.lang.Thread {
	
	private Heroi HERO;
	private Inimigo ENEMY;
	private Batalha1v1 battle;
	private Mapa map;
	private Item items;
	private boolean exit; 
	
	public Explorar (Heroi h) {
		this.HERO = h;
		this.exit = false;
	}
	
	@Override
	public void run() {
		
		int i=0;
		
		while(!this.exit) {
			map = Creador.creatorMap(HERO.getLevel()); // Inicializa a fase conforme o nivel do personagem
			//Console.printMap(map); // Printa a fase em questao e seu nivel
			
			Console.print("Fase: " + map.getFase() + " - Nivel: " + map.getLevel() + "  Aguarde....");
			
			if (++i % 5 == 0) {
				
				ENEMY = Creador.generateEnemy(HERO.getLevel() + (int)Math.random()*2); // cria inimigo do nível do herói
				Console.print(HERO.getName() + " encontrou um inimigo "+ ENEMY.getName() + " level "+ ENEMY.getLevel());
				
				battle = new Batalha1v1(HERO, ENEMY);
				battle.start();
				
				if (battle.winner() == HERO) {
					int n = ENEMY.getLevel(); // calcula experiencia
					int xp = 100*n + (int)1.5*n*n + 630 * (int)(Math.pow(n, 4));
                                        int gold = 20+n;
					/* Encontrado em:
					 * https://www.wakfu.com/pt/forum/16-discussoes-gerais-interesse-geral/7098-
					 * como-feito-o-calculo-experiencia-necessaria-passar-nivel */

					Console.printEndOfBattle(HERO);
					Console.printIncreaseXP(xp);
                                        utilidades.Console.printGold(gold);
					HERO.increaseExperience(xp); // ganha/incrementa XP
					HERO.increaseGold(gold); //ganha/incrementa gold
					items = Creador.generateEquipment(map.getLevel(), HERO.getJOB());
					
					Console.print("Item: " + items.getName()
							+ " \nlevel: " + items.getLevel() 
							+ "\nAtack: " + items.getAtack()
							+ "\nDefense: " + items.getDefense() 
							+ "\nHp: " + items.getHp());
					
					HERO.heal(); // recupera HP
					PlayFrame.idle.updateCharacterInfo();// atualiza aba de info do person.
					
				} else { // se o inimigo vencer
					
					Console.printEndOfBattle(ENEMY);
					Console.printGameOver();
					Console.printAllCharacterInfo(HERO);
					
					break;
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}
	
	
	public void reRun() {
		run();
	}
	
	
	public boolean getExit() {
		return this.exit;
	}
	
	public void setExit(boolean b) {
		this.exit = b;
	}
}