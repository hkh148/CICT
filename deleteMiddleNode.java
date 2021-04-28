public static void deleteMiddleNode(LinkedListNode middle){
    middle.val = middle.next.val;
    middle.next = middle.next.next;
}