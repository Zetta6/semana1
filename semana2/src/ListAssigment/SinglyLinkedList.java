package ListAssigment;

public class SinglyLinkedList {

	public Node head;
	public int tamaño = 0;

    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.

    public void add(int value) {

        Node newNode = new Node(value);
        
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
        tamaño++;
    }
    
    
    public void remove(){
        Node remove = head;
        for (int i = 0; i < tamaño-2; i++) {
            remove = remove.getNext();
        }
        Node next = remove.getNext();
        remove.setNext(next.getNext());
        tamaño--;
    }
        
    
    
    
        
    public void printValues(){
        System.out.print("\n\n");
    	Node aux = head;
        while(aux != null){
        	System.out.print("[" + aux.getValue() + "]" + ", ");
        	aux = aux.getNext();
       }    
    }
}
