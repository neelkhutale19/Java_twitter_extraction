import search.TwitterSearch;
import twitter4j.TwitterException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TwitterSearch.getAuthentication();
			//TwitterSearch.searchTweets();
			//TwitterSearch.timelineTweets();
			//TwitterSearch.retrieveAllTweets();
			String[] twitterAccountNames = {"Enter Account Name"}
			for(String twitterAccountName: twitterAccountNames){
				TwitterSearch.retrieveAllTweetsToTable(twitterAccountName);
				System.out.print(twitterAccountName + " ");
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
