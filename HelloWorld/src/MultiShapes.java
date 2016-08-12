import java.util.ArrayList;

public class MultiShapes {
	
	//(2a)
	//public interface Shape {
    public static class Shape {
	        private int w, h, radius, sides;
	        private double area;
	        private int diameter;
	        
	        //construct
	        Shape(int w, int h, int sides, double area) {
	        }
	        Shape(int w, int h, int sides) {
	        }
	        Shape(int w, int h) {
	        }
	        Shape(int r, double area) {        	
	        }
	        Shape(int r) {        	
	        }
	        
	        //accessors
	        //sets
	        public void setNumSides(int sides) {
	            this.sides = sides;
	        }
	        public void setRadius(int radius) {
	            this.radius = radius;
	        }
	        public void setHeight(int height) {
	            this.h = height;
	        }
	        public void setWidth(int width) {
	            this.w = width;
	        }
	        //set and area of x (area)
	        public void setArea(double area) {
	            this.area = area;
	        }
	        public void setDiameter(int diameter) {
				this.diameter = diameter;
			}
	        public void setDiameterR(int radius) {
				this.diameter = radius*radius;
			}
	        //ellipses
	        public void setArea(int radius) {
	        	this.area = 3.14*radius*radius;
	        }
	        //rectangles
	        public void setArea(int w, int h) {
	        	this.area = w*h;
	        }
	        
	        //gets
	        public Shape getShape() {
	            return getShape();
	        }
	        public int getNumSides() {
	            return sides;
	        }       
	        public int getRadius() {
	            return radius;
	        }        
	        public int getHeight() {
	            return h;
	        }
	        public int getWidth() {
	            return w;
	        }
	        public double getArea() {
	            return area;
	        }
	    	public int getDiameter() {
				return diameter;
			}
	    
	    
	    //"specific shapes"
	    public static class Ellipse extends Shape {
	    	//construct
	        Ellipse(int r) {
				super(r);
				
				this.setRadius(r);
				this.setNumSides(0);
				//circle area
				this.setArea(r);
				this.setDiameter(r*r);
			}
	    }
	    public static class Rectangles extends Shape {
	    	//construct
	        Rectangles(int w, int h) {
				super(w, h);
			
				this.setWidth(w);
				this.setHeight(h);
				this.setNumSides(4);
				//rect area
				this.setArea(w, h);
			}
	    }
	    public static class Polygon extends Shape {
	        Polygon(int w, int h, int sides, double area) {
				super(w, h, sides, area);
				
				this.setWidth(w);
				this.setHeight(h);
				this.setNumSides(sides);
				//set area
				this.setArea(area);
			}
	    }
	}
  
    //main
    public static void main(String[] args) {
    	System.out.println("2b:");
        //(2b)
        //MultiShapes.Shape.get/set
        ArrayList<MultiShapes.Shape> shapes = new ArrayList<MultiShapes.Shape>();
        
        System.out.println("2c:");
        //(2c)
        Shape.Ellipse uno = new Shape.Ellipse(8);
        Shape.Rectangles dos = new Shape.Rectangles(5, 7);
        Shape tres = new Shape(0, 0, 18);
        Shape.Polygon quatro = new Shape.Polygon(8, 4, 6, 6.07);
        
        //add to list
        shapes.add(uno);
        shapes.add(dos);
        shapes.add(tres);
        shapes.add(quatro);
        
        System.out.println("2d:");
        //(2d)
        //sort
        //selection style
        for(int i=0; i<shapes.size(); i++) {
        	int lowerVal = i;
        	for(int j=i; j<=shapes.size()-1; j++) {
        		if(shapes.get(lowerVal).getArea()>shapes.get(j).getArea()) {
        			lowerVal = j;
        		}
        	}
        	//swap
        	double temp = shapes.get(lowerVal).getArea();
        	shapes.get(lowerVal).setArea(shapes.get(i).getArea());
        	shapes.get(i).setArea(temp);
        }
        
        //print
        for(int i=0; i<shapes.size();i++) {
        	System.out.println(shapes.get(i).getArea() + ":");
        }
    }
}
