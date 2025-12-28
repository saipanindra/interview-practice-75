public class MyLinkedListHelper {
    public static void main(String[] args) {
        
        MyLinkedList l = new MyLinkedList();
        l.addAtHead(1);
        l.addAtTail(3);
        l.addAtIndex(1, 2);
        l.addAtIndex(3,4);


        l.deleteAtIndex(1);
        l.printLinkedList();
    }

   
    
}
