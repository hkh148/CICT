public static boolean oneReplace(String str1, String str2){
	int howMany = 0;
	for(int i = 0; i < str1.length(); i++){
		if(str1.charAt(i) != str2.charAt(i) && howMany == 1){
			return false;
		}
		if(str1.charAt(i) != str2.charAt(i) && howMany == 0){
			howMany = 1;
		}
	}
	return true;
}

public static boolean oneInsert(String str1 /* longer */, String str2){
	int i = 0, j = 0;
	int howMany = 0;
	while(i < str1.length() && j < str2.length()){
		if(str1.charAt(i) == str2.charAt(j)){
			i++; j++;
			continue;
		}
		if(str1.charAt(i) != str2.charAt(j) && howMany == 0){
			howMany = 1;
			i++;
			continue;
		}
		if(str1.charAt(i) != str2.charAt(j) && howMany != 0){
			return false;
		}
	}
	return true;
}


public static boolean oneAway(String str1, String str2){
	if(str1.length() == str2.length()){
		return oneReplace(str1,str2);
	}
	if(str1.length() == str2.length() + 1){
		return oneInsert(str1,str2);
	}
	if(str2.length() == str1.length() + 1){
		return oneInsert(str2,str1);
	}
	return false;
}