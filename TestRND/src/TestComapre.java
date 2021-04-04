import java.util.TreeMap;
import java.util.TreeSet;

public class TestComapre implements Comparable {

	public String name;
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String args[])
	{
		TestComapre t1= new TestComapre();
		TestComapre t2= new TestComapre();
		
		t1.name="Tea";
		t2.name="Coffe";
		TreeSet set= new TreeSet();
		set.add(t1);
		set.add(t2);
		
	}

}
