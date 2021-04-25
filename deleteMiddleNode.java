public static void deleteMiddleNode(LinkedListNode middle){
	LinkedListNode runner = middle;
    while(runner.next.next != null){
		runner.val = runner.next.val;
		runner = runner.next;
        }
        runner.val = runner.next.val;
        runner.next = null;
}