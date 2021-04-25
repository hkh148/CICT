public static int kthToLast(LinkedListNode node, int k){
    LinkedListNode head = node;
    while(k > 0 && node.next != null){
        node = node.next;
        k--;
    }
    while(node.next != null){
        node = node.next;
        head = head.next;
    }
    return head.val;
}