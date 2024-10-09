package MergeTwoSortedLists;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode resultList = new ListNode();
        ListNode resultListOperation = resultList;
        while (list1 != null && list2 != null ){
            if (list1.val < list2.val) {
                resultListOperation.next = list1;
                list1 = list1.next;
            } else {
                resultListOperation.next = list2;
                list2 = list2.next;
            }
            resultListOperation = resultListOperation.next;
        }
        resultListOperation = (list1 != null) ? list1 : list2;
        return resultList;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(l1, l2);
        mergedList.printList();
    }
}
