
package studentlist;

/**
 *
 * @author Imdad Rind
 */
public class StudentList {

    public static void main(String[] args) {
        
        nameList uotStud = new nameList();
        
        uotStud.addNames("ali");
        uotStud.addNames("noman");
        uotStud.addNames("baloch");
        uotStud.addNames("atta");
        uotStud.addNames("khan");
        uotStud.addNames("aziz");
        
        uotStud.displayNames();
        
        
        
      System.out.println( uotStud.findStud("khan"));
      
      uotStud.delete(4);
        
      uotStud.displayNames();
       
    }
    
}
