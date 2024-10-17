class Plate {
    int length;
    int width;

    Plate(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void method1() {
        System.out.println("length=" + this.length + " width=" + this.width);
    }
}

class Boxs extends Plate {
    Boxs(int length, int width) {
        super(length, width); // Call superclass constructor
    }

    public void method2() {
        System.out.println("length=" + this.length + " width=" + this.width);
    }
}

class Woodbox extends Boxs {
    int height;
    int thick;

    Woodbox(int length, int width, int height, int thick) {
        super(length, width); // Call superclass constructor
        this.height = height;
        this.thick = thick;
    }

    public void method3() {
        System.out.println("length=" + this.length + " width=" + this.width + " thick=" + this.thick);
    }
}

public class Boxes {
    public static void main(String[] args) {
        Woodbox c = new Woodbox(1, 2, 3, 4); // Pass arguments to Woodbox constructor
        Boxs b = new Boxs(2, 3); // Pass arguments to Box constructor
        Plate a = new Plate(4, 5); // Pass arguments to Plate constructor

        c.method3();
        b.method2();
        a.method1();
    }
}
