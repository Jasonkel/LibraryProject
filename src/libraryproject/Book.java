
package libraryproject;


public class Book {
    
    private String title;
    private boolean borrowed;
    
    public Book(String title){
        this.title = title;
        borrowed = false;
    }
    
    public void borrowed(){
       borrowed = true;
    }
    
    public void returned(){
       borrowed = false;
    }
    
    public boolean isBorrowed(){
        return borrowed;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
   
        
    }

    
    
    

