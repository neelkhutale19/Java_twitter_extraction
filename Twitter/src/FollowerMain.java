import search.TwitterSearch;
import twitter4j.TwitterException;

public class FollowerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TwitterSearch.getAuthentication();
			// TwitterSearch.searchTweets();
			// TwitterSearch.timelineTweets();
			// TwitterSearch.retrieveAllTweets();
			String[] twitterAccountNames = { "Enter Account Name"}
			for (String twitterAccountName : twitterAccountNames) {
				TwitterSearch.getFollowerCount(twitterAccountName);
				System.out.println(twitterAccountName);
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
