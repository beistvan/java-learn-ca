public class Newsfeed {
  public Newsfeed(){
      
  }
      
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
}

// import the Arrays package here
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Newsfeed sampleFeed = new Newsfeed();
 :wq   String[] topics = sampleFeed.getTopics();
    System.out.println(Arrays.toString(topics));
  }
}
