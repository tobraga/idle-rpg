package utilidades;

import personagem.Character;

public class Escudo extends Habilidade {
	/* Habilidade de escudo:
	 * Habilidade de criar uma proteção que diminui os danos
	 * recebidos em uma batalha enquanto ativada */
	
	public Escudo() {
		super(HabilidadeID.SHIELD);
	}
	
	@Override
	public void use(Character c) {
		System.out.println("Você usou uma Skill de Proteção");
	}

}