 * 		Wuerfel (1-100) unter 60: dieser Planet hat Silber Vorkommen
 * 		Wuerfel (1-100) unter 45: dieser Planet hat Gold Vorkommen
 * 		Wuerfel (1-100) unter 15: dieser Planet hat Juwelen Vorkommen
 * 	
 * 		Sollte es eine Ressource auf dem Planeten geben, so wird wieder zufaellig entschieden wieviel Rohstoff 
 * 		vorhanden ist.
 * 
 * 		Bronze: mindestens 15 --- maximal 70
 * 		Silber: mindestens 10 --- maximal 60
 * 		Bronze: mindestens 5 --- maximal 50
 * 		Bronze: mindestens 1 --- maximal 25
 */
		if(Helper.random(0, 100)<bronze.dropRate) {
			this.bronze.amount = Helper.random(15, 70);
			this.bronze.farm = this.bronze.amount;
			this.bronze.storage = this.citizen*4;
		}
		if(Helper.random(0, 100)<silver.dropRate) {
			this.silver.amount = Helper.random(10, 60);
			this.silver.farm = this.silver.amount;
			this.silver.storage = this.citizen*4;
		}
		if(Helper.random(0, 100)<gold.dropRate) { 
			this.gold.amount = Helper.random(5, 50);
			this.gold.farm = this.gold.amount;
			this.gold.storage = this.citizen*4;
		}
		if(Helper.random(0, 100)<jewel.dropRate) {
			this.jewel.amount = Helper.random(1, 25);
			this.jewel.farm = this.jewel.amount;
			this.jewel.storage = this.citizen*4;
		}
	}
	
/*
 * Hier wird nach jeder runde der Rohstoff neu generiert 
 * Die kriterien sind hier:
 * 			Bronze: alle 8 Runden
 * 			Silber:	alle 10 Runden
 * 			Gold:	alle 12 Runden
 * 			Juwel:	alle 14 Runden
 */
	public void generateResource() {
		if(this.bronze.farm<this.bronze.amount && round.getRound() % bronze.grow == 0) {
			bronze.farm +=1;					
		}
		if(this.silver.farm<this.silver.amount && round.getRound() % silver.grow == 0) {
			silver.farm +=1;					
		}
		if(this.gold.farm<this.gold.amount && round.getRound() % gold.grow == 0) {
			gold.farm +=1;					
		}
		if(this.bronze.farm<this.bronze.amount && round.getRound() % bronze.grow == 0) {
			bronze.farm +=1;					
		}
		if(this.jewel.farm<this.jewel.amount && round.getRound() % jewel.grow == 0) {
			jewel.farm +=1;					
		}
	}		
/*
 * Mit den einzelnen Methoden wird ein Rohstoff abgearbeitet und dann in dem storage "storagef" eingefuegt"
 * Es wird kontrolliert ob der jeweilige Rohstoff ueberhaupt vorhanden ist durch die "farm" variable
 * Ausserdem wird sichergestellt das man nicht mehr farmen kann als vorhanden
 */
	public void mineBronze() {
		if(this.bronze.farm > 0) {
			this.bronze.farm -= 1;
			this.bronze.storagef += 1;
		}
	}
	
	public void mineSilver() {
		if(this.silver.farm > 0) {
			this.silver.farm -= 1;
			this.silver.storagef += 1;
		}
	}
	
	public void mineGold() {
		if(this.gold.farm > 0) {
			this.gold.farm -= 1;
			this.gold.storagef += 1;
		}
	}
	
	public void mineJewel() {
		if(this.jewel.farm > 0) {
			this.jewel.farm -= 1;
			this.jewel.storagef += 1;
		}
	}
	

/*
 * Mit income() wird (sobald der Planet eingenommen wurde) angewiesen mit jeden aufruf selbst zu farmen
 * Es wird kontrolliert ob die der farm vorhanden ist und nicht unter Null ist
 * Anschliessend wird ueberprueft ob das "leeere Lager" nicht dem Maximalen Lager (das moegliche Lager = einwohner x 4) ueberschreitet
 * dann wird ein viertel  der Einwohner jeweils ein Rohstoff (wenn vorhanden) abarbeiten
/*
 * Hier wird dem Planet mit einem W100 zufaellig zugewiesen ob dieser Planet ueberhaupt Rohstoffe hat
 * 		Wuerfel (1-100) unter 85: dieser Planet hat Bronze Vorkommen
 * 		Wuerfel (1-100) unter 60: dieser Planet hat Silber Vorkommen
 * 		Wuerfel (1-100) unter 45: dieser Planet hat Gold Vorkommen
 * 		Wuerfel (1-100) unter 15: dieser Planet hat Juwelen Vorkommen
 */
		if(Helper.random(0, 100)<bronze.dropRate) {
			this.bronze.amount = Helper.random(10, 50);
			this.bronze.farm = this.bronze.amount;
			this.bronze.storage = this.citizen*4;
		}
		if(Helper.random(0, 100)<silver.dropRate) {
			this.silver.amount = Helper.random(5, 40);
			this.silver.farm = this.silver.amount;
			this.silver.storage = this.citizen*4;
		}
		if(Helper.random(0, 100)<gold.dropRate) { 
			this.gold.amount = Helper.random(3, 30);
			this.gold.farm = this.gold.amount;
			this.gold.storage = this.citizen*4;
		}
		if(Helper.random(0, 100)<jewel.dropRate) {
			this.jewel.amount = Helper.random(1, 10);
			this.jewel.farm = this.jewel.amount;
			this.jewel.storage = this.citizen*4;
		}
	}
	
/*
 * Hier wird nach jeder runde der Rohstoff neu generiert 
 * Die kriterien sind hier:
 * 			Bronze: alle 8 Runden
 * 			Silber:	alle 10 Runden
 * 			Gold:	alle 12 Runden
 * 			Juwel:	alle 14 Runden
 */
	public void generateResource() {
		if(this.bronze.farm<this.bronze.amount && round.getRound() % bronze.grow == 0) {
			bronze.farm +=1;					
		}
		if(this.silver.farm<this.silver.amount && round.getRound() % silver.grow == 0) {
			silver.farm +=1;					
		}
		if(this.gold.farm<this.gold.amount && round.getRound() % gold.grow == 0) {
			gold.farm +=1;					
		}
		if(this.bronze.farm<this.bronze.amount && round.getRound() % bronze.grow == 0) {
			bronze.farm +=1;					
		}
		if(this.jewel.farm<this.jewel.amount && round.getRound() % jewel.grow == 0) {
			jewel.farm +=1;					
		}
	}		
/*
 * Mit den einzelnen Methoden wird ein Rohstoff abgearbeitet und dann in dem storage "storagef" eingefuegt"
 * Es wird kontrolliert ob der jeweilige Rohstoff ueberhaupt vorhanden ist durch die "farm" variable
 */
	public void mineBronze() {
		if(this.bronze.farm > 0) {
			this.bronze.farm -= 1;
			this.bronze.storagef += 1;
		}
	}
	
	public void mineSilver() {
		if(this.silver.farm > 0) {
			this.silver.farm -= 1;
			this.silver.storagef += 1;
		}
	}
	
	public void mineGold() {
		if(this.gold.farm > 0) {
			this.gold.farm -= 1;
			this.gold.storagef += 1;
		}
	}
	
	public void mineJewel() {
		if(this.jewel.farm > 0) {
			this.jewel.farm -= 1;
			this.jewel.storagef += 1;
		}
	}
	

/*
 * Mit income() wird (sobald der Planet eingenommen wurde) angewiesen mit jeden aufruf selbst zu farmen
 * Es wird kontrolliert ob die der farm vorhanden ist und nicht unter Null ist
 * Anschliessend wird ueberprueft ob das "leeere Lager" nicht dem Maximalen Lager (das moegliche Lager = einwohner x 4) ueberschreitet
 * dann wird ein viertel  der Einwohner jeweils ein Rohstoff (wenn vorhanden) abarbeiten
 * doch vorsicht ist geboten!!!!!
 * je wertvoller der rohstoff desto weniger kommt ins wirkliche lager an
 */
	public void income() {
//		if(captured = true) {
			if(this.bronze.farm>0) {
				if(this.bronze.storage > this.bronze.storagef) {
					this.bronze.farm -= (int)citizen/4;
					this.bronze.storagef += (int)citizen/4;
					if(this.bronze.farm<0) {
						this.bronze.farm = 0;
					}
				}
			}
			if(this.silver.farm>0) {
				if(this.silver.storage > this.silver.storagef) {
					this.silver.farm -= (int)citizen/5;
					this.silver.storagef += (int)citizen/4;
					if(this.silver.farm<0) {
						this.silver.farm = 0;
					}
				}
			}
			if(this.gold.farm>0) {
				if(this.gold.storage > this.gold.storagef) {
					this.gold.farm -= (int)citizen/6;
					this.gold.storagef += (int)citizen/4;
					if(this.gold.farm<0) {
						this.gold.farm = 0;
					}
				}
			}
			if(this.jewel.farm>0) {
				if(this.jewel.storage > this.jewel.storagef) {
					this.jewel.farm -= (int)citizen/7;
					this.jewel.storagef += (int)citizen/4;
					if(this.jewel.farm<0) {
						this.jewel.farm = 0;
					}
				}
			}
//			
//		}
	}

	@Override
	public String getName() {
		return this.name;
	}
	public int getSize() {
		return this.size;
	}

	@Override
	public void generate(int element) {
		
	}

	@Override
	public void printChildren() {
		
	}
/*
 * Noch zu bearbeiten
 */
	public String generateName() {
		String name1 = firstname[Helper.random(0, firstname.length)];
		String name2 = firstname[Helper.random(0, firstname.length)];
				if(name1.equals(name2)) {
			name1 = firstname[Helper.random(0, firstname.length)];
		}
		String name4 = name1 + name2.toLowerCase();
		if(name4.length()<7) {
			return name4;
		}
		return name4+firstname[Helper.random(0, firstname.length)].toLowerCase();
	}
	
	
	public static void defending()
	{
		//defencePower
	}

	@Override
	public void update(int round) {
		System.out.println(this.name + " lautet die Runde " + round + " ein.");
	}

}
