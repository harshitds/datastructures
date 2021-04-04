import java.util.*;
import java.util.Map.Entry;

public class Solution {
    public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {
    	
    	static Map<String,ArrayList<Integer>> appsRating=new HashMap<String,ArrayList<Integer>>();
    	//static Map<String,List<Double>> appsRating=null;
    	//static Map<String,Integer> appsRating=new HashMap<String,Integer>();
    	ArrayList<Integer> apps=null;
    	volatile int  count=0;
    	
        @Override
        public synchronized void putNewRating(String app, int rating){
        	
        	if(appsRating.containsKey(app)) {
        		apps=appsRating.get(app);
			}else {
				apps=new ArrayList<Integer>();
			}
        	apps.add(rating);
			 appsRating.put(app, apps);
			 
			 //System.out.println(appsRating);
        }

        @Override
        public double getAverageRating(String app){
        	
        	ArrayList<Integer> tmp=appsRating.get(app);
			 count=tmp.size();
			Double price=0.0;
			for(Integer d:appsRating.get(app)) {
				price+=d;
			}
			return (double)price/count;
        	
        }

        @Override
        public int getRatingsCount(String app){
			return count;
            // YOUR CODE HERE
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingStatisticsCollector {
        // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
        public void putNewRating(String app, int rating);

        // Report the average rating of the app. 
        public double getAverageRating(String app);

        // Report the total number of rating for an app.
        public int getRatingsCount(String app);
    }

    public static void main(String[] args) {
    	
    	  System.out.println("Enter");
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
            final Set<String> apps = new TreeSet<>();
          
            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String app = tokens[0];
                apps.add(app);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewRating(app, runs);

            }

            for (String app : apps) {
                System.out.println(
                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            }

        }
        scanner.close();

    }
}