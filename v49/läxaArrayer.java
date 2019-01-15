


	import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

	public class läxaArrayer {
		static int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};


		// 100 namn
		static String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
		 
		public static void main(String[] args) {
			// kör alla mitoder 1-10
			System.out.println(amunt());
			System.out.println(tom());
			System.out.println(itNumber());
			System.out.println(Drusilla());
			System.out.println(equol());
			System.out.println(letterL());
			System.out.println(letterFive());
			howMenny();
			System.out.println(unik());
			System.out.println(alleNams());
		}
		// 100 tal i intervallet [0-9]
		//mitod nr1
		public static int amunt () {
			//akpar aktuela variabler. 
			int tims = numbers.length;
				int svar = 0;
				//identiifera alla numer av värder 7.
				for(int i = 0 ; i < tims; i++ ) {
					
					if (numbers[i] == 7) {
						svar++;
					}
				}
				return svar;
			 }
	//metod 2
		public static int tom () {
			//skapa aktuella variabeler.
			int svar = 0;
			int tims = names.length;
			//identiferar altuela namn i listan och läger till ett vid träff
			for(int i = 0 ; i < tims; i++ ) {
				if (names[i].equals("Tom")||names[i].equals("tom")) {
					svar++;
			}
			
		}
				return svar;
		}
	// metod 3
		public static int itNumber() {
			// skapar variabler 
			int  outnum2 = 0;
			int svar =0;
			int tims = numbers.length;
			int conter = 0;
			
			// skaper arrey
			int [] index = new int [10];
			// tästa nummer mellan 1-9
				for(int i = 0 ; i < 10; i++ ) {
					conter = 0;
					//ser om nummer är lika.
					for(int e = 0; e<tims; e++) {
						if (numbers[e] == i) {
							conter++;
						}
					//lägger till antal
						index[i]=conter;
					}
				}
			// hitta det minsta värdet
			        for (int i = 0; i < index.length - 1; i++) {
			          
			            if ( outnum2 > index[i+1]) {
			              outnum2 = i+1;
			            }
			        }
		  //retunera svar
			        svar = numbers[outnum2];
			return svar;
			
			}
		//metod4
		public static int Drusilla() {
			//skapa aktuella variabler.
			int svar = 0;
			int tims = names.length;
			//söker aktuelt namn och retunerarn platsen i listan 
			for(int i = 0 ; i < tims; i++ ) {
				if (names[i].equals("Drusilla")){
					svar= i;
				}
			}
			return svar;
		}
		//metod 5
		public static int equol() {
			//skaper aktuela variaber
			int svar = 0;
			int tims = numbers.length;
			//söker efeer och adderar aktuella värden 
			for(int i = 0 ; i < tims; i++ ) {
				if(numbers[i]==2||numbers[i]==4||numbers[i]==6||numbers[i]==8) {
					svar= svar+ numbers[i];
					
				}
			}
			
			return svar;
		}
	//metod6	
		public static int letterL() {
			//skaper aktuella variabler
			int svar = 0;
			int tims = names.length;
			char oneLetter;
			//söker för en angiven bokstav på första platsen i stringen. ifall träff addera med ett i int
			for(int i = 0 ; i < tims; i++ ) { 
				oneLetter = names[i].charAt(0);
				
				if(oneLetter=='L') {
					svar++;
				}
				
			}
			return svar;
		}
	//mwetod7	
		public static int letterFive() {
			//skapa aktuella variabeler  
			String str;
			 int svar =0;
			 int tims = names.length;
			 //kollar hela listan efter ord som inehåller fem bokstäver;
			for(int i = 0 ; i < tims; i++ ) { 
				str = names[i];
				
					if (str.length() == 5) {
						svar++;
					}
			}
			return svar;
		}
	//method 8
		public static void howMenny () {
			//skaper aktuella variabeler + lista med 10 platser 
			int tims = numbers.length;
			int conter = 0;
			int [] indexx = new int [10];
			//lägger till väden i listat indexx
			for(int i = 0 ; i < 10; i++ ) {
				conter = 0;
				//söker efeter dubbleter av en sifra och räknar dem.
				for(int e = 1; e<tims; e++) {
					if (numbers[e] == i) {
						conter++;
					}
					//lägger till resultatet från söknigen 
					indexx[i]=conter;
				}
			}
			//skriver ut listan med tillhörande sifra. 
			for (int i = 0; i<10; i++) {
				System.out.println(indexx[i]+"of nr"+i);
			}
		}
	//metod 9 
		public static int unik() {
			//skapar aktuella variabler 
			int svar = 0 ;
			int tims = names.length;
			String bas;
			// analyserar om det fin dubletter 
			for(int i = 0 ; i < tims; i++ ) {
				bas = names[i];
				for (int e = 0; e<tims; e++) {
					//stop för att inte gämföra med sin egen plats.
					if (i!=e) {
						//bryt lopp och tästa nästa om den hittar dubletter anars lägg till värde 
						if(bas.equals(names[e])) {
							break;	
						}
						if(e==tims-1) {
							svar++;
					}	
				}

					
				}
			}
			return svar;
			}
	//mehod 10
		 public static String alleNams() {    //10
			//skapar aktuella variabler 
			 	String  svar = "" ;
				int tims = names.length;
				String bas;
				int outnum2 = 0;
				int apa = 0 ;
				// skapat lista med 100 platser. 
				//med tanke att varge int plats i listan ska ha en motsvarighet i namnlistan.
				
				int [] how = new int [100];
				// avgör hur många namn det fin av ett namn och gar en motsvarande sifra i how
				for(int i = 0 ; i < tims; i++ ) {
					bas = names[i];
					apa= 0;
					//avgör och lägger till motsvarande sifra.
					for (int e = 0; e<tims; e++) {
						
							if(bas.equals(names[e])) {
							apa++;
							}
					}
					how[i] = apa;
					}
					// ser vilket som är det sstörsta värdet i listan. 
					// jag inser att det kommer att finas flera nomnet med det största antalet.
					//så den kommer att velja den sitat i raden om kommer att var nomnet på motsvarande plat i namn listan. 
					//
					for (int z = 0; z < how.length; z++) {
						for(int e =0; e<how.length;e++) {
			            if ( how[z] > how[e]) {
			            	outnum2 = z;
						            }
						}
						        }
						
		        
		    
				
				svar=names[outnum2];
				return svar;
		 }
	}

