package utilidades;

import personagem.Character;

public class Velocidade extends Habilidade {
	/* Habilidade de velocidade:
	 * Habilidade de aumentar a velocidade, ou seja, o intervalo
	 * entre um ataque e outro na batalha */

	public Velocidade() {
		super(HabilidadeID.SPEED);
	}
	
	@Override
	public void use(Character c) {
		System.out.println("Você usou uma Skill de Velocidade");
	}
}