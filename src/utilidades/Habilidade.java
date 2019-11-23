package utilidades;

import personagem.Character;

public abstract class Habilidade {

	protected String name;
	protected int level;
	protected HabilidadeID identifier;
	protected Habilidade next;
	
	public Habilidade (HabilidadeID id) {
		next = null;
		identifier = id;
		level = 1;
	}
	
	public String getName() {return this.name;}
	public int getLevel() {return this.level;}
	
	public void setNext(Habilidade skill) {
		if (next == null) {
			next = skill;
		} else {
			next.setNext(skill);
		}
	}
	
	public void use(Character c, HabilidadeID id) throws Exception {
		if (identifier == id) {
			use(c);
		} else {
			if (next == null)
				throw new Exception("Skill não encontrada");
			next.use(c, id);
		}
	}
	
	
	public abstract void use(Character c);
	
}