import java.util.*;

public class 클레스구현연습4 {

}

interface Soundable{
    public String Sound();
}

class Cat implements Soundable {

    public String Sound() {
        return "냐옹";
    }
}

class Dog implements Soundable {

    public String Sound() {
        return "멍멍";
    }
}