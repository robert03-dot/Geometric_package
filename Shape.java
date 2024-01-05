package Geometric_package;

public class Shape {
    private String text;
    private String material;

    public Shape() {
        text = "";
        material = "";
    }

    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    public int getSize() {
        return -1;
    }

    public String getMaterial() {
        return material;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "made of " + this.material + ",contains the text:" + this.text + ".";
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
        Shape shape = (Shape) obj;
        if (this.material.equals(shape.material) && this.text.equals(shape.text)) {
            return true;
        }
        return false;
    }
    //mereu cand suprascriu equals trebuie sa suprascriu si hashcode
    //daca doua obiecte sunt egale atunci vor avea obligatoriu acelasi cod hash
    @Override
    public int hashCode() {
        int prime_number = 7;
        int hash_result = 1;
        hash_result = prime_number * hash_result + ((material == null)? 0 : this.material.hashCode());
        hash_result = prime_number * hash_result + ((text == null)? 0 : this.text.hashCode());
        return hash_result;
    }
}