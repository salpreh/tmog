package org.tfoc;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    @Test
    void shouldSortWhen2Lists() {
        // given
        ListNode list1 = createList1();
        ListNode list2 = createList2();
        int[] expected = new int[]{1,1,2,3,4,7};

        // when
        ListNode result = Solution.mergeTwoLists(list1, list2);

        // then
        assertListResult(expected, result);
    }

    @Test
    void shouldSortWhen1List() {
        // given
        ListNode list1 = createList1();
        int[] expected = new int[]{1,2,4};

        // when
        ListNode result = Solution.mergeTwoLists(list1, null);

        // then
        assertListResult(expected, result);
    }

    @Test
    void shouldSortWhenEmptyLists() {
        // when
        ListNode result = Solution.mergeTwoLists(null, null);

        // then
        assertNull(result);
    }

    private ListNode createList1() {
        ListNode rootNode = new ListNode(1);
        rootNode.next = new ListNode(2);
        rootNode.next.next = new ListNode(4);

        return rootNode;
    }

    private ListNode createList2() {
        ListNode rootNode = new ListNode(1);
        rootNode.next = new ListNode(3);
        rootNode.next.next = new ListNode(7);

        return rootNode;
    }

    private static void assertListResult(int[] expected, ListNode result) {
        ListNode resultNode = result;
        for (int j : expected) {
            Assertions.assertEquals(j, resultNode.val);
            resultNode = resultNode.next;
        }
    }

}