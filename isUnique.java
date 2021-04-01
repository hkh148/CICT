public static boolean isUnique(String s){
    Set<Character> mySet = new HashSet<>();
    for(char c : s.toCharArray()){
        if(mySet.contains(c)) return false;
        mySet.add(c);
    }
    return true;
}

// could've created an array of fixed size (128 = ASCII size)
// could've used bit vector instead of an array to reduce space by 8