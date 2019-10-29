package csc1302lab6;

public class ColoredRectangle extends Rectangle implements Colored{
	private String color;
	public ColoredRectangle(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	public int getWidth(){
		return super.getWidth();
	}	
	public int getHeight(){
		return super.getHeight();
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Rectangle [" + getHeight() + ", " + getWidth() + ", "+color+"]";
	}
	public boolean equals(Object o) {
        if (o instanceof ColoredRectangle) {
            ColoredRectangle other = (ColoredRectangle) o;
            return getHeight() == other.getHeight() && getWidth() == other.getWidth()&& color == ((ColoredRectangle) other).getColor();
        } else {  
            return false;
        }
    }

}
