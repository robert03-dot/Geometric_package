package Geometric_package;

public class Triangle extends Shape{
    private int base;
    private int height;
    public Triangle(int base,int height,String text,String material){
        super(text,material);
        this.base = base;
        this.height = height;
    }
    public String displayTriangleHeight(){
        return "Triangle height is:" + height;
    }

    @Override
    public int getSize() {
        double arie = (base*height)/2;
        return (int)arie;
    }

    @Override
    public String toString() {
        return "Triangle height is:" + this.height + "," + "base is:" + this.base + "," + "made of:" + getMaterial() + ",contains th text:" + getText() ;
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
        Triangle triangle = (Triangle) obj;
        if(super.equals(triangle) && this.base == triangle.base && this.height == triangle.height){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        int prime_number = 31;
        int hash_result = super.hashCode();
        hash_result = prime_number * hash_result + base;
        hash_result = prime_number * hash_result + height;
        return hash_result;
    }
}
