

import java.util.ArrayList;


public class BootCampAdministration {
	
	

	//Create a private ArrayList with object of BootCampCandidates with name anArrayListOfBootCamps
    private  ArrayList<BootCampCandidates>anArrayListOfBootCamps;
	
	//Create a constructor which receives an array with BootCampCandidate objects and 
	//initializes the anArrayListOfBootCamps ArrayList by adding all BootCampCandidate array's
	//elements in the the nArrayListOfBootCamps
    BootCampAdministration(){}
    BootCampAdministration(BootCampCandidates[] anArrayListOfBootCamps){
    	this.anArrayListOfBootCamps = new ArrayList<>();
    	for (int i=0; i<anArrayListOfBootCamps.length; ++i)
            this.anArrayListOfBootCamps.add(anArrayListOfBootCamps[i]);
    	    
    }
    	
    	
    
   

   

	
	//Create setters and getters for BootCampAdministration

     public ArrayList<BootCampCandidates> getAnArrayListOfBootCamps() {
          return this.anArrayListOfBootCamps;
       }
     
     public void setAnArrayListOfBootCamps(ArrayList<BootCampCandidates> newArrayListBootCamp) {
         this.anArrayListOfBootCamps = newArrayListBootCamp;
     }

	//create an int method that returns the size of anArrayListOfBootCamps
     public int getSizeOfAnArrayListOfBootCamps(){
 		return this.anArrayListOfBootCamps.size();
 	}
	
	//Create a method that adds a new BootCampCandidate inside the ArrayList
     public void addBootCampCandidate(BootCampCandidates B) {
         this.anArrayListOfBootCamps.add(B);    
 }
	
	//Create a method that removes a candidate by name and returns true if found or false if not
	//HINT: you have to use get() to get the object and equals to compare it
     public void removeBootCampCandidate(String name) {
         for (int i=0; i<anArrayListOfBootCamps.size(); ++i) {
             if (this.anArrayListOfBootCamps.get(i).getName().equals(name)) {
                 this.anArrayListOfBootCamps.remove(i);
                 return;
             }
         }            
     }
	
	//Create a method to search for a boot camp member by surname and returns a string with its information
	// if it's found and null if it's not found
     public BootCampCandidates getBootCampCandidate(String surname){
 		for (int i=0; i<this.anArrayListOfBootCamps.size();i++)
 			if (this.anArrayListOfBootCamps.get(i).getSurname().equals(surname))
 				return this.anArrayListOfBootCamps.get(i);
 		System.out.println("Candidate "+surname+"not found in the author");
 		return null;	
 	}

     public void print(){
    	 System.out.println(anArrayListOfBootCamps.toString());
     }
	
	//Create a method that can change a bootcampers age by having as input its name and surname

	
}
