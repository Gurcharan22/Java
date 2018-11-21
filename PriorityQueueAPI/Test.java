import java.util.Comparator;


public class Test {

  public static void main(String[] args) {
    
      
   PriorityQueue<Student> q=new PriorityQueue<Student>(12,new Comparator<Student>(){
     																	
     																		public int compare(Student a,Student b)
                                                                            {
                                                                              return b.id-a.id;
                                                                              
                                                                            }
     
    																		
   																		  });
    q.add(new Student(2,"john"));
    q.add(new Student(1,"ram"));
    q.add(new Student(0,"don"));
    q.add(new Student(4,"dd"));
    q.add(new Student(-1,"kk"));
    q.add(new Student(5,"bdda"));
    q.print();
    System.out.println("polling"+q.poll());
    System.out.println(q.peek());
    
    Iterator<Student> i=q.iterator();
    while(i.hasNext())
    {
      System.out.println(i.next());
    }
    

  }
}
