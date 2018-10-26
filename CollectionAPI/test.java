import com.uca.util.*;
public class testclass 
{
  public static void main(String[] args) 
  {
    LinkedList<Integer> mylist=new LinkedList<Integer>();
    mylist.add(1);
    mylist.add(2);
    mylist.add(5);
    Iterator<Integer> itr=mylist.iterator();
    
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
    
    System.out.println(mylist.get(2));
    assert mylist.size()==3;
    
    System.out.println("all passed");
  }
}
