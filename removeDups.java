public static List<Integer> removeDups(LinkedList<Integer> list){
    Set<Integer> mySet = new HashSet<>();
    int i = 0;
    while(i < list.size()){
		int val = list.get(i);
		if(mySet.contains(val)){
			list.remove(i);
			continue;
		}
		i++;
        mySet.add(val);
    }
    return list;
}8