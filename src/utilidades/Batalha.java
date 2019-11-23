package utilidades;

import personagem.Character;

public interface Batalha {
	
	public void start();
	
	public void finish();
	
	public Character winner();

}