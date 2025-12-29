public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode iterator = list1;

        int i = 0;
        while (i < a - 1) {
            iterator = iterator.next;
            i++;
        }
        ListNode nodePriorToAth = iterator;
        while (i < b)  {
            iterator = iterator.next;
            i++;
        }
        ListNode nodeAtBth = iterator;


        iterator = list2;
        while (iterator.next != null) {
            iterator = iterator.next;
        }

        ListNode lastNodeOfList2 = iterator;

        nodePriorToAth.next = list2;
        lastNodeOfList2.next = nodeAtBth.next;


        return list1;
        
    }
    
}

class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
