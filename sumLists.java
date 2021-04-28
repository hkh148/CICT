public static LinkedListNode sumLists(LinkedListNode lhs, LinkedListNode rhs){
    int carry = 0;
    LinkedListNode toReturn = new LinkedListNode();
    LinkedListNode runner = toReturn;
    while(lhs != null && rhs != null){
        runner.val = (carry + lhs.val + rhs.val)%10;
        carry = (carry + lhs.val + rhs.val) / 10;
        if(lhs.next != null && rhs.next != null){
            runner.next = new LinkedListNode();
            runner = runner.next;
        }
        lhs = lhs.next;
        rhs = rhs.next;
    }
    while(rhs != null){
        runner.next = new LinkedListNode();
        runner = runner.next;
        runner.val = (carry + rhs.val) % 10;
        carry = (carry + rhs.val) / 10;
        rhs = rhs.next;
    }

    while(lhs != null){
        runner.next = new LinkedListNode();
        runner = runner.next;
        runner.val = (carry + lhs.val) % 10;
        carry = (carry + lhs.val) / 10;
        lhs = lhs.next;
    }

    if(carry != 0){
        runner.next = new LinkedListNode();
        runner.next.val = carry;
    }
    return toReturn;
}