public static void sortStack(Stack<Integer> stack){
    Stack<Integer> temp = new Stack<>();
    int currMin = Integer.MAX_VALUE, remaining = stack.size(); // can be implemented if not provided.
    while(remaining > 0){
        boolean started = false;
        for(int i = 0; i < remaining; i++){
            int currVal = stack.pop();
            if(currVal <= currMin && !started){
                currMin = currVal;
                started = true;
                continue;
            }
            if(currVal <= currMin){
                temp.push(currMin);
                currMin = currVal;
                continue;
            }
            temp.push(currVal);
        }
        stack.push(currMin);
        currMin = Integer.MAX_VALUE;
        remaining--;
        for(int i = 0; i < remaining; i++){
            stack.push(temp.pop());
        }
    }
}