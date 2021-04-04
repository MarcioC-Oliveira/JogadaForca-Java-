package entities;

/**
 *
 * @author Marcio
 */
public class Forca {
    
    public Forca(){
        
    }
    
    public void geba(){
        
    }

    public String forcas(int i) {
        

        switch (i) {
            case 0:

                return    "\n------------"
                        + "\n|          |"
                        + "\n|           "
                        + "\n|           "
                        + "\n|           "
                        + "\n|           "
                        + "\n|           ";
            case 1: 
                
                return    "\n------------"
                        + "\n|          |"
                        + "\n|          O"
                        + "\n|           "
                        + "\n|           "
                        + "\n|           "
                        + "\n|           ";
                
            case 2:       
                
                return    "\n------------"
                        + "\n|          |"
                        + "\n|          O"
                        + "\n|          |"
                        + "\n|           "
                        + "\n|           "
                        + "\n|           ";
            
            
            case 3:
                
                return    "\n------------"
                        + "\n|          |"
                        + "\n|          O"
                        + "\n|         /|"
                        + "\n|           "
                        + "\n|           "
                        + "\n|           ";
            case 4 :
                
                return    "\n------------"
                        + "\n|          |"
                        + "\n|          O"
                        + "\n|         /|\\"
                        + "\n|           "
                        + "\n|           "
                        + "\n|           ";
            
            case 5 :
                
                return    "\n------------"
                        + "\n|          |"
                        + "\n|          O"
                        + "\n|         /|\\"
                        + "\n|         /"
                        + "\n|           "
                        + "\n|           ";
                
            case 6 : 
                
                return    "\n------------"
                        + "\n|          |"
                        + "\n|          O"
                        + "\n|         /|\\"
                        + "\n|         / \\"
                        + "\n|           "
                        + "\n|           ";
        
            default : return "Erro";
        }
                                    
        }

    
    }


