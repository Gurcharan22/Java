package com.uca.util;
public class LinkedList<E> implements List<E>
{
  private Node head,end;
  private int size;
  
  private class Node
  {
    private E data;
    private Node next;
    Node(E data)
    {
      this.data=data;
      this.next=null;
    }
  }
  public LinkedList()
  {
    head=null;
    end=null;
    size=0;
  }
  ///linkedlist 
  private Node add(E e,Node end)
  {
     if(head ==null)
     {
       head=new Node(e);
       this.end=head;
     }
     else
     {
       this.end.next=new Node(e);
       this.end=this.end.next;
     }
     this.size++;
     return head;
  }
  private E get(int index,Node head)
  {
    int i=0;
    while(i<size && i!=index)
    {
     head=head.next;
     i++;
    }
    return head.data;
  }
  
  private void remove(int index,Node head)
  {
    int i=0;
    Node prev=null,cur=head,next=head.next;
    while(i!=index)
    {
      prev=cur;
      cur=next;
      next=cur.next;
      
      i++;
    }
    
    prev=next;
    size--;
    
  }
  private void remove(E e,Node n)
  {
    int index=0;
    while(index<size)
    {
      if(n.data == e)
      {
        remove(index,head);
        break;
      }
      n=n.next;
      index++;
    }
    size--;
  }
  
  ///list
  public void add(E e,int index)
  {
   
   
   }
  public void remove(int index)
  {
    remove(index,head); //go to linkedlist function
  
  }
  public E get(int index)
  {
    return get(index,head);//go to linkedlist function
  }
  //////collection
  
   public void add(E e)
   {
     head=add(e,end);//go to linkedlist function
     
   }
  public void remove(E e)
  {
      remove(e,head);//go to linkedlist function
  }
  public int size()
  {
    return size;
  }
  public boolean isEmpty()
  {
    if(size==0)
    {return true;}
    
    return false;
  }
  public void clear()
  {
  
  }
  
  //Iterable
   public Iterator<E> iterator()
   {
      return new Iterator<E>(){
                              private Node thead=head;
                              public boolean hasNext()
                              {
                                if(thead!=null)
                                {return true;}
                                return false;
                              }
                              public E next()
                              {
                                E data= thead.data;
                                thead=thead.next;
                                return data;
                              }
                              
                            };
   }
   
 
   public boolean contains(E e)
   {
      Node temp=head;
      int i=0;
      while(i<size)
      {
        if(temp.data==e)
        {return true;}
        temp=temp.next;
        i++;
      }
      return false;
   
   }

  
}
