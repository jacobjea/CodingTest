import java.util.Arrays;

class World {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        // 6-1 Circle을 구현하라.(5)
        Circle circle = new Circle(3);
        System.out.println(circle + "의 넓이는 " + circle.getArea() + " 입니다.");

        // 6-2 Box을 구현하라.(5)
        Box box = new Box(7, 8, 9);
        System.out.println(box + "의 부피는 " + box.getVolume() + " 입니다.");

        shapes[0] = circle;
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Ball(6);
        shapes[3] = box;

        // 6-3 도형 종류를 출력하라(10)
        System.out.println(Arrays.toString(shapes));

        // 6-4 2차원 도형만 출력하라(20)
        System.out.print("2차원 도형은 ");
        for (Shape shape : shapes) {
            if (shape instanceof Shape2D){
                System.out.print(shape + " ");
            }
        }
        System.out.print("이며, 넓이는 ");
        for (Shape shape : shapes) {
            if (shape instanceof Shape2D){
                Shape2D shape2D = (Shape2D) shape;
                System.out.print(shape2D.getArea() + " ");
            }
        }
        System.out.println("입니다.");

        // 6-5 3차원 도형만 출력하라(30)
        // 주석 처리된 부분에만 코드를 추가한다.
        // Java Stream을 이용해 구현한다.

        Object[] shape3ds = Arrays.stream(shapes).filter(x-> x instanceof Shape3D).toArray();
        System.out.println("3차원 도형은 " + Arrays.toString(shape3ds) + " " +
                "이며, 부피는" + Arrays.toString(Arrays.stream(shape3ds).map(x -> ((Shape3D) x).getVolume()).toArray()) +
                "입니다.");
    }
}

abstract class Shape {
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}

interface Shape2D {
    double getArea();
    void draw();
}


interface Shape3D {
    double getVolume();
    void build();
}

class Circle extends Shape implements Shape2D {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public void draw() {

    }
}

class Rectangle extends Shape implements Shape2D {
    double x;
    double y;

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return x * y;
    }

    public void draw() {

    }
}


class Ball extends Shape implements Shape3D {
    double r;

    Ball(double r) {
        this.r = r;
    }

    public double getVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(r, 3);
    }

    public void build() {

    }
}

class Box extends Shape implements Shape3D {
    double x;
    double y;
    double z;

    Box(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getVolume() {
        return x * y * z;
    }

    public void build() {

    }
}
