import java.util.ArrayList;
public abstract class AbstractQueue<E> implements Queue<E>
{
  protected ArrayList<E> arr;
  
  public AbstractQueue()
  {
    arr=new ArrayList<E>();
  }
  
  public void add(E element)
  { 
    arr.add(element);
  }
  
  public boolean isEmpty()
  {
    if(arr.size()==0)
    return true;
    else
    return false;
    
  }
  
  public int size()
  {
    return arr.size();
  }
  public Iterator<E> iterator()
  {
    return new Iterator<E>(){
                             private int i=0;
                             public boolean hasNext()
                             {
                               if(i<arr.size())
                               {
               
                                return true;
                               }
                               else
                               return false;
                             }
                             
                             public E next()
                             { 
                               int j=i;
                               i++;
                               return arr.get(j); 
                             }
    
     
                            };
  }
 

}
