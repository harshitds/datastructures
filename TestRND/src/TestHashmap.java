import java.util.HashMap;

public class TestHashmap {
	
	public static void main(String args[])
	{
		HashMap<Integer,String> map=new HashMap();
		Integer i=1,j=2;
		map.put(i,"one");
		map.put(j,"two");
		i =null;
		System.out.println(map.get(i));
	}
	

}
