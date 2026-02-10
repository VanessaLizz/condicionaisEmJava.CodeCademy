package aulas;

public class Newsfeed {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    public int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public Newsfeed(){
        String favoriteArticles = new String[10];
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle){
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public String[] getTopics(){
        return topics;
    }

    public int getNumTopics(){
        return topics.length;
    }

    public String getFirstTopic(){
        return topics[0];
    }

    public void viewTopic(int topicIndex){
        views[topicIndex]++;
    }

}
