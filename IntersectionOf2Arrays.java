public static ArrayList<Integer> getIntersection(int one[],int two[]){
		HashMap<Integer,Boolean> map=new HashMap<>();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<one.length;i++) {
			map.put(one[i], false);
		}
		for(int j=0;j<two.length;j++) {
			if(map.containsKey(two[j])) {
				map.put(two[j], true);
			}
		}
		Set<Map.Entry<Integer, Boolean>> entries=map.entrySet();
		for(Map.Entry<Integer, Boolean> entry:entries) {
			if(entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
