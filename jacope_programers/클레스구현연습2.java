import java.util.*;

public class 클레스구현연습2 {

}

class Member{
    private String id;
    private String name;
    int point;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setPoint(int point){
        this.point = point;
    }

    int getPoint(){
       return point;
    }

    void setId(String id){
        this.id = id;
    }
    String getId(){
        return id;
    }
}