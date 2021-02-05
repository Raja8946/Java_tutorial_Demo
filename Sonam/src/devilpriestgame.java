import java.util.Scanner;
public class devilpriestgame{
	public static void main(String args[]){
		int priestsidea=3,devilsidea=3,priestsideb=0,devilsideb=0;
		int inboat=0,priestinboat=0,devilinboat=0;
		Scanner sc=new Scanner(System.in);
		
		for(; priestsideb<=3 && devilsideb<=3;){
			if(priestsidea!=0){
				System.out.println("Enter the no of priest going from island 1 to island 2");
				priestinboat=sc.nextInt();
			}
			if(priestinboat!=2 && devilsidea!=0){
				System.out.println("Enter the no of devil going from island 1 to island 2");
				devilinboat=sc.nextInt();
			}
			else{
				devilinboat=0;
			}
		    	inboat=(priestinboat + devilinboat);
			if(inboat>2){
				System.out.println("The boat can carry only 2 person at a time");
				break;
			}
			priestsideb+=priestinboat;
			priestsidea-=priestinboat;
			devilsideb+=devilinboat;
			devilsidea-=devilinboat;
			if(priestsidea<priestinboat && devilsidea<devilinboat){
				System.out.println("There are only " + priestsideb + " priests and " + devilsideb + " devils on island 2");
				break;	
			}
			if((devilsidea>priestsidea || devilsideb>priestsideb) && (priestsidea!=0 && priestsideb!=0)){	
				System.out.println("Game Over!!!  The no of devil cannot be greater than the priest on either side !!");
				break;
			}
			if(priestsideb==3 && devilsideb==3){
				System.out.println("Congoo!!!!!!  You moved all priests and devil to the island 2");
				break;
			}
			if(priestsideb!=0){
				System.out.println("Enter the no of priest going from island 2 to island 1");
				priestinboat=sc.nextInt();
			}
			if(priestinboat!=2 && devilsideb!=0){
				System.out.println("Enter the no of devil going from island 2 to island 1");
				devilinboat=sc.nextInt();	
			}
			else{
				devilinboat=0;
			}
			inboat=(priestinboat + devilinboat);
			if(inboat>2){
				System.out.println("The boat can carry only 2 person at a time");
				break;
			}
			priestsidea+=priestinboat;
			priestsideb-=priestinboat;
			devilsidea+=devilinboat;
			devilsideb-=devilinboat;
			if(priestsideb<priestinboat && devilsideb<devilinboat){
				System.out.println("There are only " + priestsideb + " priests and " + devilsideb + " devils on island 2");
				break;	
			}
			if((devilsidea>priestsidea || devilsideb>priestsideb) && (priestsidea!=0 && priestsideb!=0)){	
				System.out.println("Game Over!!!  The no of devil cannot be greater than the priest on either side !!");
				break;
			}
			System.out.println("no of priests in island 1= " + priestsidea + " no of priest in island 2= " + priestsideb);
			System.out.println("no of devils in island 1= " + devilsidea + " no of devil in island 2= " + devilsideb);	
			
				
		}
	}
}
