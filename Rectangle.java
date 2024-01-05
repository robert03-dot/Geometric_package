package Geometric_package;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(String text,String material){
        this.width = width;
        this.height = height;
    }
    public String displayRectangleHeigth(){
        return "Rectangle height is:" + height;
    }

    @Override
    public int getSize() {
        int arie = width*height;
        return arie;
    }

    @Override
    public String toString() {
        return "Rectangle height is:" + this.height + "," + "width is:" + this.width + "," + "made of:" + getMaterial() + ",contains th text:" + getText();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        if(super.equals(rectangle) && this.height == rectangle.height && this.width == rectangle.width){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int prime_number = 17;
        int hash_result = super.hashCode();
        hash_result = prime_number * hash_result + width;
        hash_result = prime_number * hash_result + height;
        return hash_result;
    }
}
