
public class Nodelist {

  Node first ;

  void add(int a){
    if(first==null){
     first = new Node();
     first.value = a;
    }else{
      Node n= first;

      while (n.next != null) {
        n = n.next;
      }

      Node newNode = new Node();
      newNode.value = a;
      n.next = newNode;

  }
  }


  void udskriv() {

    if (first != null) {

      Node n= first;

      while (n != null) {
     System.out.println (n.value);
        n = n.next;
      }
    }
  }
}
