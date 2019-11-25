package utilidades;

import personagem.Character;
/*
contrato com a classe batalha1v1
*/
public interface Batalha {
	
	public void start();
	
	public void finish();
	
	public Character winner();

}