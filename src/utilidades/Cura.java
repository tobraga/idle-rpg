package utilidades;

import out.Console;
import personagem.Character;

public class Cura extends Habilidade {
	/* Habilidade de Cura:
	 * Habilidade de recuperar a vida no meio da batalha */
	
	private float coef;
	
	public Cura() {
		super(HabilidadeID.CURE);
		coef = 1.5f;
	}
	
	@Override
	public void use(Character c) {
		int n = (int) (c.getHp() * coef);
		Console.print("Usando Skill de Cura\tHP = ("+ c.getHp() +") => ("+ n +")");
		c.setHp(n);
	}
	
}