public class MergeInBetweenLinkedListsTester {
    public static void main(String[] args) {
        ListNode list1 =new ListNode(10);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(13);
        list1.next.next.next = new ListNode(6);
        list1.next.next.next.next = new ListNode(9);
        list1.next.next.next.next.next = new ListNode(5);


        ListNode list2 = new ListNode(1000000);
        list2.next = new ListNode(1000001);
        list2.next.next = new ListNode(1000002);


        MergeInBetweenLinkedLists m = new MergeInBetweenLinkedLists();
        ListNode mergedList = m.mergeInBetween(list1, 3, 4, list2);
        System.out.println(mergedList);
        
    }
}
