package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode mergedRoot = new ListNode();
        ListNode currentMerged = mergedRoot;
        ListNode currentNode1 = list1;
        ListNode currentNode2 = list2;
        while (currentNode1 != null && currentNode2 != null) {
            if (currentNode1.val > currentNode2.val){
                currentMerged.next = new ListNode(currentNode2.val);
                currentNode2 = currentNode2.next;
            } else {
                currentMerged.next = new ListNode(currentNode1.val);
                currentNode1 = currentNode1.next;
            }

            currentMerged = currentMerged.next;
        }

        while (currentNode1 != null) {
            currentMerged.next = new ListNode(currentNode1.val);
            currentMerged = currentMerged.next;
            currentNode1 = currentNode1.next;
        }

        while (currentNode2 != null) {
            currentMerged.next = new ListNode(currentNode2.val);
            currentMerged = currentMerged.next;
            currentNode2 = currentNode2.next;
        }

        return mergedRoot.next;
    }

}
