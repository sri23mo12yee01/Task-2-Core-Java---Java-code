import java.util.ArrayList;
import java.util.ListIterator;
 
public class code9 {
 
    
    public static void main(String[] args)
    {
 
        
        ArrayList<String> friends = new ArrayList<String>();
 
       
        friends.add("Hilay");
        friends.add("Yuvraj");
        friends.add("Vaishali");
        friends.add("Manav");
        friends.add("Rasesh");
        friends.add("Syna");
 
        
        ListIterator<String> listIterator
            = friends.listIterator();
 
        System.out.println("List Before remove() method = "
                           + friends);
 
        for (int i = 0; i < 3; i++) {
            listIterator.next();
        }
 
       
        listIterator.remove();
 
        System.out.println("List After remove() method =  "
                           + friends);
    }
}
