package entities;

public class Champion {
	
	private String name;
	private int life, atack, armor;
	
	
	
	
	public Champion(String name, int life, int atack, int armor) {
		this.name = name;
		this.life = life;
		this.atack = atack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public int getAtack() {
		return atack;
	}
	
	public void setAtack(int atack) {
		this.atack = atack;
	}
	

	public int getArmor() {
		return armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other){ 
		if (this.armor >= other.atack) {              
			this.life -=1;							
		}
		else {
			this.life -= (other.atack - this.armor);         
		}
		
	}
	
	
	public String status() {
		String result;
		
		if(life > 0) {
			result = name + ": " + life + " de vida";
		}
		else {
			result = name + ": " + life +" vida ";
			
		}
		
		return result;
		
		
	}
	

}
