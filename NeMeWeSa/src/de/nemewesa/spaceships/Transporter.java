package de.nemewesa.spaceships;

import de.nemewesa.buildings.Storage;
import de.nemewesa.character.Enemy;
import de.nemewesa.level.Planet;
import de.nemewesa.level.Resource;
import de.nemewesa.level.SpaceStation;

public class Transporter extends Spaceship{

	//private static Object resourceName;
	public Storage storage;


	public Transporter(String shipName, String shipType, int maxCapacity, int shipHealth, int shipStrange, int shipFuel, Storage storage, Planet currentPlanet) {
		super(shipName, shipType, shipHealth, maxCapacity, shipStrange, shipFuel, currentPlanet);
		this.storage = storage;
	}


	public void die()
	{
		System.out.println(this.shipName + " ist zerstört!!!");
	}

	// nehme ich gleich raus
	public int shipAttack(Enemy target)
	{
		return target.enemyHealth = target.enemyHealth - this.shipStrange;
	}
	
	// Lösche ich gleich	
	public void fly(Planet planet)
	{
		this.currentPlanet = planet;
	}


	//Hier wird der Rohsrtoff vom gewählten PLANETEN AUFGENOMMEN


	// http://stackoverflow.com/questions/19602601/create-an-arraylist-with-multiple-object-types
	//Also erstmal muss ich jede unterschiedliche Ressource als eigenes Objekt deklarieren
	// Dann muss ich zu jedem einzelnen Objekt dazupacken oder abziehen
	public void pickUpBronze()
	{	
		// Es geht nicht weil ich ein Inhalt von einer ArrayList von ner anderen abziehen will und die zwei werte haben
		// 
		if(this.currentPlanet.resource.get(0).storagef > 0) // Hier will ich erst gucken ob der Planet rohstoffe zum abholen hat
		{
			int actualAmount = this.currentPlanet.resource.get(0).storagef;

			this.currentPlanet.resource.get(0).storagef -= actualAmount;
			//this.storage.addAll
			//(actualAmount);
			// ---------Neue Aufgabe--------
			/* Muss aussuchen können welche menge bzw. ist eine obergrenze.
			 * Muss erst obergrenze festlegen z.B maximal 100 einheiten
			 * oder ich mach vier verschiedene Methoden für pickup(dann das jeweilige Element)
			 */
		}
		else 
		{	
			//System.out.println("Hier gibt es kein " + this.currentPlanet.resource.get(0).resourceName +  "die man abholen kann! ");	
		}
	}

		public void pickUpSilver()
		{		
			if(this.currentPlanet.resource.get(1).storagef > 0) // Hier will ich erst gucken ob der Planet rohstoffe zum abholen hat
			{
				int actualAmount = this.currentPlanet.resource.get(1).storagef;

				this.currentPlanet.resource.get(1).storagef -= actualAmount;
				//this.storage.add(actualAmount);
				// ---------Neue Aufgabe--------
				/* Muss aussuchen können welche menge bzw. ist eine obergrenze.
				 * Muss erst obergrenze festlegen z.B maximal 100 einheiten
				 * oder ich mach vier verschiedene Methoden für pickup(dann das jeweilige Element)
				 */
			}
			else 
			{	
				System.out.println("Hier gibt es kein " + this.currentPlanet.resource.get(1).resourceName +  "die man abholen kann! ");	
			}
		};

		public void pickUpGold()
		{			
			if(this.currentPlanet.resource.get(2).storagef > 0) // Hier will ich erst gucken ob der Planet rohstoffe zum abholen hat
			{
				int actualAmount = this.currentPlanet.resource.get(2).storagef;

				this.currentPlanet.resource.get(2).storagef -= actualAmount;

				if(this.maxCapacity > actualAmount)
				{

				}
				this.storage.resources.add(actualAmount, this.currentPlanet.resource.get(2));

				// Vielleicht muss ich die aktuelle Kapazität berechnen nicht nur maxCapacity
			}


		else 
		{	
			System.out.println("Hier gibt es kein " + this.currentPlanet.resource.get(2).resourceName +  "die man abholen kann! ");	
		}
	}


	public void pickUpJewel()
	{

		if(this.currentPlanet.resource.get(3).storagef > 0) // Hier will ich erst gucken ob der Planet rohstoffe zum abholen hat
		{
			int actualAmount = this.currentPlanet.resource.get(3).storagef;

			this.currentPlanet.resource.get(3).storagef -= actualAmount;
//			if(this.resource.storage > actualAmount)
//			{
//				this.storage.resources.add(actualAmount);
//			}	
			// ---------Neue Aufgabe--------
			/* Muss aussuchen können welche menge bzw. ist eine obergrenze.
			 * Muss erst obergrenze festlegen z.B maximal 100 einheiten
			 * oder ich mach vier verschiedene Methoden für pickup(dann das jeweilige Element)
			 */
		}
		else 
		{	
			System.out.println("Hier gibt es kein " + this.currentPlanet.resource.get(3).resourceName +  "die man abholen kann! ");	
		}
	};
	//		
	//		 
	//	 
	//	}

	public void dropDownResource()
	{
//		int actualAmount = this.storage.resources;
//		this.storage.resources		
	}

	// Hier wird der Rohstoff in der jeweiligen Raumstation abgelegt
	//	public int dropDown(SpaceStation goal)
	//	{
	//		return goal.warehouse = goal.warehouse + capacity;
	//	}

}
