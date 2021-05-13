package com.hnk.universe.algorithm;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 示例1
 * 输入
 * {1,2,3}
 * 返回值
 * {3,2,1}
 */
public class ReverseList {

    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //链表的最后一个node
        ListNode node = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;

    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pre = head;
        ListNode cur = pre.next;
        pre.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode node = ReverseList(node1);
        System.out.println(node);
//        Deque<String> deque = new ArrayDeque<>();
//        deque.add("a");
//        deque.add("b");
//        deque.add("c");
//        deque.add("d");
//        deque.forEach(r->{
//            System.out.println(deque.pop());
//
//        });


//        for (int i = 0; i < 5; i++) {
        //peek
//            System.out.println("i=" + i);
//            for (int j = 0; j < 5; j++) {
//                if (j == 3) {
//                    System.out.println("if:j=" + j);
//                    break;
//                }
//                System.out.println("j=" + j);
//            }
//        }
    }

}
