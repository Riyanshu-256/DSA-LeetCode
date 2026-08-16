import java.util.*;

class Twitter {

    // userId -> tweets
    HashMap<Integer, List<Integer>> tweets = new HashMap<>();

    // userId -> followees
    HashMap<Integer, HashSet<Integer>> following = new HashMap<>();

    // tweetId -> time
    HashMap<Integer, Integer> timeMap = new HashMap<>();

    int time = 0;

    public Twitter() {
    }

    public void postTweet(int userId, int tweetId) {

        tweets.putIfAbsent(userId, new ArrayList<>());

        tweets.get(userId).add(tweetId);

        timeMap.put(tweetId, time);

        time++;
    }

    public List<Integer> getNewsFeed(int userId) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> timeMap.get(b) - timeMap.get(a)
        );

        // Own tweets
        if (tweets.containsKey(userId)) {
            pq.addAll(tweets.get(userId));
        }

        // Followed users' tweets
        if (following.containsKey(userId)) {

            for (int person : following.get(userId)) {

                if (tweets.containsKey(person)) {
                    pq.addAll(tweets.get(person));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty() && ans.size() < 10) {
            ans.add(pq.poll());
        }

        return ans;
    }

    public void follow(int followerId, int followeeId) {

        if (followerId == followeeId) {
            return;
        }

        following.putIfAbsent(followerId, new HashSet<>());

        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}