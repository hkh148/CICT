public static boolean isUnique(String s){
    Set<Character> mySet = new HashSet<>();
    for(char c : s.toCharArray()){
        if(mySet.contains(c)) return false;
        mySet.add(c);
    }
    return true;
}

public static boolean isUniqueEconomical(String s){
    BitSet mySet = new BitSet(128); // assuming we have an ASCII only string
    for(char c : s.toCharArray()){
        if(mySet.get((int) c)) return false;
        mySet.flip((int )c);
    }
    return true;
}
