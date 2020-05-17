
package estore;

import java.util.*;


public class EStore {

    public static void main(String[] args) {
       Customer simone = new Customer("simon", "arts", "cottage70..");
       item potatoe = new item("potatoe", 3.99, "food");
         

   
      
    }
    
}

class Customer{
    private String First;
    private String last;
    private final String username;
    public int passwordIndex;
    private String[] password = new String[6];
   
    public static List<item> itemsviewed = new ArrayList<>();
   
    public static item itemN = new item("000000", 0.00, "0000");
    
  
    public  Customer(String First, String last, String password) {
        this.First = First;
        this.last = last;
        passwordIndex = 0;
        
     if(password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains(".")){    
             if(password.matches(".*[a-zA-Z]+.*") && password.matches(".*\\d.*")){ 
             
           this.password[passwordIndex] = password;
             }
     
     }
     
     else{
         System.out.println("ERROR password must contain one special character, one number and one letter");
     }
     
        username = First + "_" + last;
       
    }

    public String getFirst() {
        return First;
    }

    public String getLast() {
        return last;
    }

    public String getUsername() {
        return username;
    }

    public String[] getPassword() {
        return password;
    }

    public List getItemsviewed() {
        
        return itemsviewed;
    }
    

    

    public void setFirst(String First) {
        this.First = First;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setPassword(String password) {
        passwordIndex += 1;
        
         if(password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains(".")){    
             if(password.matches(".*[a-zA-Z]+.*") && password.matches(".*\\d.*")){ 
                 for(int k = 0; k<6; k++){
                       if (getPassword()[k] == password){
                           System.out.println("ERROR cannot reuse passwords");}
                       else{
                         this.password[passwordIndex] = password;}
                 }
                 
                 }
                    
             }
             
     
     
     else{
         System.out.println("ERROR password must contain one special character, one number and one letter");
     }
    
    }
 
public void printoverview(){
    System.out.println("Username: " + getUsername() + "\n");
    
    System.out.println("The current passworrd is: " + getPassword()[passwordIndex] + "\n" + "\n" + "all passwords");
    
   
    for (int l=0; l<password.length;l++){
        
    System.out.println( l + ". " + getPassword()[l]);
    }
    System.out.println("\n");
    
    System.out.println(getItemsviewed());
    
    
}



}

class item {
 String itemName;
 double price;
 String catagory;
 String[] relatedItems;

    public item(String itemname, double pricee, String catagorie) {
      
       
        this.itemName = itemname;
        this.price = pricee;
        this.catagory = catagorie;
        Customer.itemN = new item(itemName,price,catagory);
       Customer.itemsviewed.add(Customer.itemN);
    
    }
    
    
}
        


   

    
    

    


        
        
        

        