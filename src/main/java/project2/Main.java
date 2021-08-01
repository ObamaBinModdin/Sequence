/**
 * Project: Project2     
 * Completion time: 3 hours
 * 
 * Honor Code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */
package project2;

/**
 *
 * @author oscar
 */
public class Main 
{

    public static void main(String[] args) 
    {
        Sequence test1=new Sequence();
        Sequence test2=new Sequence(0);
        
        test1.set(0, "Hello");
        test1.set(1, "World");
        test1.set(2, 4.34343);
        test1.set(4, 4);
        test1.append("APPEND");
        
        System.out.println(test1.get(0));
        System.out.println(test1.get(1));
        System.out.println(test1.get(2));
        System.out.println(test1.get(3));
        System.out.println(test1.get(4));
        
        System.out.println(test1.size());
        System.out.println(test2.size());
        
        test2.append("APPEND AGAIN");
        
        System.out.println(test2.size());
        System.out.println(test2.get(0));
    }
    
}
