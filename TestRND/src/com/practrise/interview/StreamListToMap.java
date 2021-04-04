package com.practrise.interview;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamListToMap {
	
	
	private int Id;
    private String name;
    private String websites;
    
    public StreamListToMap(int Id,String name,String websites)
    {
    	this.Id=Id;
    	this.name=name;
    	this.websites=websites;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamListToMap s1=new StreamListToMap(1,"Netflix","www.netfil.com");
				StreamListToMap s2=new StreamListToMap(3,"apple","www.apple.com");
				
						StreamListToMap s3=new StreamListToMap(4,"Prime","www.amazon.com");
		
		List<StreamListToMap> streammap=new ArrayList<StreamListToMap>();
		streammap.add(s1);
		streammap.add(s2);
		streammap.add(s3);
		//s2.setId(3); this does not change the state of object
		
		Map<Integer,String> listtomap=new HashMap<Integer,String>();
		//listtomap=streammap.stream().collect(Collectors.toMap(StreamListToMap::getId, StreamListToMap::getName));
		listtomap=streammap.stream().collect(Collectors.toMap(StreamListToMap::getId, StreamListToMap::getName));
		
		//System.out.println(listtomap); //or usee lamda to print 
		
		listtomap.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		
		for(Map.Entry<Integer, String> entry:listtomap.entrySet())
		{
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		
		
		//List<Integer> l1=streammap.stream().filter(e-> e.getId() >1).collect(Collectors.toList());
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsites() {
		return websites;
	}

	public void setWebsites(String websites) {
		this.websites = websites;
	}

}
