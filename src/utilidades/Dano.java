package utilidades;

import personagem.Character;

public class Dano extends Habilidade {
	/* Habilidade de Dano:
	 * Habilidade de aumentar o dano do golpe em uma batalha */
	
	public Dano() {
		super(HabilidadeID.DAMAGE);
	}

	@Override
	public void use(Character c) {
		
	}
}