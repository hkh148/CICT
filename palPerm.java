public static boolean palPerm(String str){
	//case sensitive, ignore whitespaces
	List<Character> whiteSpaces = Arrays.asList(' ','\t','\n','\r');
	Set<Character> mySet = new HashSet<>();
	for(int i = 0; i < str.length(); i++){
        if(whiteSpaces.contains(str.charAt(i))) continue;
		if(mySet.contains(str.charAt(i)){
			mySet.remove(str.charAt(i)));
			continue;
		}
		mySet.add(str.charAt(i));
	}
	return mySet.isEmpty() || mySet.size() == 1;
}