package quotes;

import java.util.ArrayList;

public class Quots_info {
     int id ;
      boolean dialogue;
     boolean  privatee =false;
    private ArrayList<String> tags;
    private String  url;
    private int favorites_count;
    private int  upvotes_count;
    private int  downvotes_count;
    private String author;
    private  String author_permalink;
    private  String body;

    @Override
    public String toString() {
        return "Quots_info{" +
                "id='" + id + '\'' +
                ", dialogue=" + dialogue +
                ", privatee=" + privatee +
                ", tags=" + tags +
                ", url='" + url + '\'' +
                ", favorites_count=" + favorites_count +
                ", upvotes_count=" + upvotes_count +
                ", downvotes_count=" + downvotes_count +
                ", author='" + author + '\'' +
                ", author_permalink='" + author_permalink + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
