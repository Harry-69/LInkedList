
//dette er fordi java er classe orinteret
public class nodes {

public static void main(String[] args){
//her bruges classen Node til at skabe fire objecter
  Node n1= new Node();
  Node n2= new Node();
  Node n3= new Node();
  Node n4= new Node();

//her bliver objecterne tildelt en værdi med value og bliver sat sammen med next
  n1 . value = 2;
  n1 . next = n2;
  n2 . value = 5;
  n2 . next = n3;
  n3 . value = 8;
n3 . next = n4;
n4 . value = 3;

System.out.println("Vi laver en linked-list!");
Nodelist list = new Nodelist();
list.add(2);
list.add(8);
list.udskriv();

}

}
