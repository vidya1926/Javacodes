package seleniumSample1;

public class Removeduplicatewords {

	public static void main(String[] args) {
		
		  String text="We learn java basics as a part of java session in java week1";
		  String [] words=text.split(" ");
		  
		  for(int i=0;i<words.length;i++) {
		  
		  
		  for(int j=i+1;j<words.length; j++) {
		  
		  if(words[i].equals(words[j])) {
		  
		  words[j]= " "; 
		  }
		  		  
		  }
		  } 
		  for (int d=0;d<words.length;d++) 
		  {
		  System.out.println(words[d] +" ");
		  }
		  
		
		 }
		    
	
	}	
		