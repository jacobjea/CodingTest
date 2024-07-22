public class 클레스구현연습3 {

}

abstract class Bird{
    private String name;

    public String getterName(){
        return name;
    }

    public void setterName(String name){
        this.name = name;
    }
    public abstract void sing();
    public abstract void fly();
    public abstract void showName();
}

class Duck extends Bird {
    String name = "꽥꽥이";

    public void sing(){
        System.out.printf("오리 (%s)가 소리내어 웁니다.", name);
    }
    public void fly(){
        System.out.printf("오리 (%s)가 날지 않습니다.", name);
    }
    public String getName() {
        return name;
    }

    public void showName() {
        System.out.printf("오리의 이름은 %s 입니다.", name);
    }
}

class Sparrow extends Bird{
    String name = "짹짹이";
    public void sing(){
        System.out.printf("참새(%s)가 소리내어 웁니다.", name);
    }
    public void fly(){
        System.out.printf("참새(%s)가 날아 다닙니다.", name);
    }

    public String getName() {
        return name;
    }

    public void showName() {
        System.out.printf("참새의 이름은 %s 입니다.", name);
    }
}
