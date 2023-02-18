package com.Java;

public class Cat extends Pet{        
	private String petName; //Pet name   
	private String petType; //Pet species   
	private int petAge;   	// Pet age     
	private int catSpaceNumber;    	// catSpaceNumber are rooms available 
	private double amountDue;    	// Amount due for pets bill  
	// Pet Constructor    
	private Pet(String petType, String petName, int petAge, int daysStay, int CatSpaceNumber) {        
		this.petType = petType;        
		this.petName = petName;        
		this.petAge = petAge;        
		this.daysStay = daysStay;    
		}    
	public String getPetName() {    //Accessors and Mutators    
		return petName;    
		}    
	public void setPetName(String petName) {        
		this.petName = petName;    
		}    
	public String getPetType() {        
		return petType;    
		}    
	public void setPetType(String petType) {        
		this.petType = petType;    
		}    
	public int getPetAge() {        
		return petAge;
	}
	public int getCatSpaceNumber() {        
	    return catSpaceNumber;    
    } 

    public void setCatSpaceNumber(int catSpaceNumber) {        
        this.catSpaceNumber = catSpaceNumber;   
    }
    public int amountDue() {        
		return amountDue;
	}
	public int daysStay() {        
		return daysStay;
	}
}
