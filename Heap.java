package Practice;
/*
 * Heap is a binary tree which follows the following property:
   i) Priority of parent is always more than children
   ii) It is a complete binary tree
   Priority: 
   -Smaller value has higher priority (Min Heap-parent value is less) eg: ranks of student
   -Larger value has higher priority(Max heap-parent value is more) eg : MNarks of student
   CBT: A complete binary tree is a binary tree in which every level
   except the last is completely filled and the last level is filled from left to right
   (n-1)th level must be completely filled to start filling nth level.The nth level is filled from 
   left to right
 */

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> data=new ArrayList<>();
	//O(1)
	public void add(int item) {
		data.add(item);
		upheapify(data.size()-1);
	}
	//O(n)
	private void upheapify(int ci) {
		int pi=(ci-1)/2;
		if(data.get(ci)<data.get(pi)) {
			swap(ci,pi);
			upheapify(pi);
		}
		
	}
	//Addition Complexity is O(log n)
	private void swap(int i,int j) {
		int t1=data.get(i);
		int t2=data.get(j);
		data.set(i, t2);
		data.set(j, t1);
	}
	public void display() {
		System.out.println(data);
	}
	public int size() {
		return this.data.size();
	}
	public boolean isEmpty() {
		return this.size()==0;
	}
	//O(1)
	public int remove() {
		swap(0,this.data.size()-1);
	    int rv=this.data.remove(this.data.size()-1);
	    downheapify(0);
	    return rv;
	}
	//O(h)
	//Remove: O(log n)
	private void downheapify(int pi) {
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
		if(lci<this.data.size()&&data.get(lci)<data.get(mini)) {
			mini=lci;
		}
		if(rci<this.data.size()&&data.get(rci)<data.get(mini)) {
			mini=rci;
		}
		if(mini!=pi) {
			swap(mini,pi);
			downheapify(mini);
			
			
		}
		
		
	}
	//O(1)
	public int get() {
		return this.data.get(0);
	}
	

}
