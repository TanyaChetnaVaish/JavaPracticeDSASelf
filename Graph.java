package Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
private class Vertex{
	HashMap<String,Integer> nbrs=new HashMap<>();
	
}
HashMap<String,Vertex> vtces;
public Graph() {
	vtces=new HashMap<>();
}
public int numVertex() {
	return this.vtces.size();
}
public boolean containsVertex(String vname) {
	return this.vtces.containsKey(vname);
	
}
public void addVertex(String vname) {
	
	Vertex vtx=new Vertex();
	vtces.put(vname, vtx);
}
public void removeVertex(String vname) {
	Vertex vtx=vtces.get(vname);
	ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
	for(String key:keys) {
		Vertex nbrVtx=vtces.get(key);
		nbrVtx.nbrs.remove(vname);
	}
	vtces.remove(vname);
	
}
public void removeEdge(String vname1,String vname2) {
	Vertex v1=vtces.get(vname1);
	Vertex v2=vtces.get(vname2);
	if(v1==null||v2==null||v1.nbrs.containsKey(vname2)) {
		return;
	}
	v1.nbrs.remove(vname2);
	v2.nbrs.remove(vname1);
}
public int numEdges() {
	int count=0;
	ArrayList<String> keys=new ArrayList<>(vtces.keySet());
	for(String key:keys) {
		Vertex vtx=vtces.get(key);
		count=count+vtx.nbrs.size();
	}
	return count/2;
	
}
public boolean containsEdge(String vname1,String vname2) {
	Vertex v1=vtces.get(vname1);
	Vertex v2=vtces.get(vname2);
	if(v1==null||v2==null||!v1.nbrs.containsKey(vname2)) {
		return false;
	}
	return true;
	
	
	
}
public void addEdge(String vname1,String vname2,int cost) {
	Vertex v1=vtces.get(vname1);
	Vertex v2=vtces.get(vname2);
	if(v1==null||v2==null||v1.nbrs.containsKey(vname2)) {
		return;
	}
	v1.nbrs.put(vname2, cost);
	v2.nbrs.put(vname1, cost);
	
}
public void display() {
	System.out.println("---------");
	ArrayList<String> keys=new ArrayList<>(vtces.keySet());
	for(String key:keys) {
		Vertex vtx=vtces.get(key);
		System.out.println(key+":"+vtx.nbrs);
	}
	System.out.println("---------");
}
}

