import java.util.Scanner;

public class Project {
		
		public static void main(String[] args) {
			int days = 5;
			int [] actL = {60, 65 , 120, 90, 45};
			int numberAct;
			int choosenActL;

		
	        Scanner input = new Scanner(System.in);
	        System.out.println("Please enter number of a day from Monday to Friday : ");
	        int choosenDay = input.nextInt();
	        
			{
			if (choosenDay == 1){
				numberAct = 5;
				choosenActL = 3;
			
		     for (int i = 1; i < actL.length; i++) { 

		    	    int temp = actL[i]; 

		    	    int j; 

		    	    for (j = i - 1; j >= 0 && temp < actL[j] ; j--) 

		    	    actL[j + 1] = actL[j]; 

		    	    actL[j + 1] = temp; 
		     }
		    	    
		    	    for (int g = 1; g < actL.length; g++){
		    	    }
		    	    System.out.print(actL[2]);
		     }
		    	    
		 
			if (choosenDay == 2){
				numberAct = 3;
				choosenActL = 1;
			
		     for (int i = 1; i < actL.length; i++) { 

		    	    int temp = actL[i]; 

		    	    int j; 

		    	    for (j = i - 1; j >= 0 && temp < actL[j] ; j--) 

		    	    actL[j + 1] = actL[j]; 

		    	    actL[j + 1] = temp; 
		     }
		    	    
		    	    for (int g = 1; g < actL.length; g++){
		    	    }
		    	    System.out.print(actL[0]);
		     }
			if (choosenDay == 3){
				numberAct = 2;
				choosenActL = 2;
			
		     for (int i = 1; i < actL.length; i++) { 

		    	    int temp = actL[i]; 

		    	    int j; 

		    	    for (j = i - 1; j >= 0 && temp < actL[j] ; j--) 

		    	    actL[j + 1] = actL[j]; 

		    	    actL[j + 1] = temp; 
		     }
		    	    
		    	    for (int g = 1; g < actL.length; g++){
		    	    }
		    	    System.out.print(actL[1]);
		     }
			if (choosenDay == 4){
				numberAct = 4;
				choosenActL = 4;
			
		     for (int i = 1; i < actL.length; i++) { 

		    	    int temp = actL[i]; 

		    	    int j; 

		    	    for (j = i - 1; j >= 0 && temp < actL[j] ; j--) 

		    	    actL[j + 1] = actL[j]; 

		    	    actL[j + 1] = temp; 
		     }
		    	    
		    	    for (int g = 1; g < actL.length; g++){
		    	    }
		    	    System.out.print(actL[3]);
		     }
			if (choosenDay == 5){
				numberAct = 5;
				choosenActL = 5;
			
		     for (int i = 1; i < actL.length; i++) { 

		    	    int temp = actL[i]; 

		    	    int j; 

		    	    for (j = i - 1; j >= 0 && temp < actL[j] ; j--) 

		    	    actL[j + 1] = actL[j]; 

		    	    actL[j + 1] = temp; 
		     }
		    	    
		    	    for (int g = 1; g < actL.length; g++){
		    	    }
		    	    System.out.print(actL[4]);
		     }
			
			if ( choosenDay > days){
		    	System.out.println("Not a day from Monday to Friday!!!");
		    	    
	 }}}}
