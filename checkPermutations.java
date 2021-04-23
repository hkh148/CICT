public static boolean checkPermutations(String str1, String str2){
	if(str1.length() != str2.length()){
		return false;
	}
	Map<Character,Integer> myMap = new HashMap<>();
	for(int i = 0; i < str1.length(); i++){
		myMap.put(str1.charAt(i),myMap.getOrDefault(str1.charAt(i),0)++);
	}
	for(int i = 0; i < str2.length(); i++){
		int val = myMap.getOrDefault(str2.charAt(i),-1);
		if(val == -1){
			return false;
		}
		if(val == 1){
			myMap.delete(str2.charAt(i));
			continue;
		}
		myMap.put(str2.charAt(i),val-1);
	}
	if(myMap.isEmpty()){
		return true;
	}
	return false;
}