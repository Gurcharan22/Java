import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class PriorityQueue<E> extends AbstractQueue<E>
{
  private Comparator<E> comp;
  private int lastindx;
  
  public PriorityQueue(int capacity,Comparator<E> c)
  {
    arr=new ArrayList<E>(capacity);
    arr.add(0,null);
    lastindx=1;
    comp= c;
  }
  
  private void swap (int x,int y)
  {
   E temp=arr.get(y);
   arr.add(y,arr.get(x));
   arr.add(x,temp); 
  }
  
  private void sink(int index)
  {
   int lchild=index*2;
   int rchild=index*2+1;
   if(lchild >lastindx && rchild >lastindx)
    return ;
   int toswapindx =index;
   if(lchild<lastindx && comp.compare(arr.get(index) ,arr.get(lchild))>0)
    toswapindx=lchild;
   else
    toswapindx=index;
   
    if(rchild<lastindx && comp.compare(arr.get(toswapindx),arr.get(rchild))>0)
      toswapindx=rchild;
    
    if(toswapindx!=index)
    {
      Collections.swap(arr,toswapindx,index);
      sink(toswapindx);
    } 
    
  }
  private void heapifyup(int index)
  {
    int parent =index/2;
    if(parent==0)
    return ;
    
    if(comp.compare(arr.get(parent),arr.get(index))>0)
    { 
      Collections.swap(arr,parent,index);
      heapifyup(parent);
    }
    
  }
  
  public void print()
  {
    int i=0;
    System.out.println("printing");
    while(i<lastindx)
    {
      System.out.println(arr.get(i));
      i++;
    }
    System.out.println("endprinting");
  }
  
   @Override
  public void add(E element)
  {
    arr.add(lastindx,element);
    heapifyup(lastindx);
    lastindx=lastindx+1;  
  }
  
  
  public E poll()
  {
    E temp=arr.get(1);
    Collections.swap(arr,1,lastindx-1);
    lastindx=lastindx-1;
    sink(1);
    return temp;
  }
  
  public E peek()
  {
    return arr.get(1);
  }
 
  
}
