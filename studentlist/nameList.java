
package studentlist;

/**
 *
 * @author Imdad Rind
 */
public class nameList {
    
    String[] studNames = new String[6];
    int indexs = 0;
    
    void addNames(String names){
        
        
       studNames[indexs++]=names;
        
        
    }
    
    void displayNames(){
        
        for (int x = 0; x < studNames.length; x++) {
            
            System.out.println(studNames[x]);
            
            
        }
        
        
    }
    
    String findStud(String name){
        String ifFound = -1 + " index not found" ;
        
        for (int x = 0; x < studNames.length; x++) {
            
            if (studNames[x]== name) {
                
                ifFound= x + " is the index of student " + name ;
                
            }
        }
        
        return ifFound;
    }
    
    void delete( int index){
        
     studNames[index]= "";
     
        for (int y = index; y < studNames.length; y++) {
            
            if(y < studNames.length-1){
            
                studNames[y] = studNames[y+1];
                
            }    
        }
        studNames[studNames.length-1] = "";
        index--;
        
    }
    
}
