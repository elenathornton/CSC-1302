package csc1302lab6;

public class Rectangle {
    private int height;
    private int width;
    public Rectangle() {
        this(0, 0);
    }
    public Rectangle(int x, int y) {
        this.height=x;
        this.width = y;
    }
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle other = (Rectangle) o;
            return height == other.height && width == other.width;
        } else {  
            return false;
        }
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public String toString() {
        return "Rectangle [" + height + ", " + width + "]";
    }

}
