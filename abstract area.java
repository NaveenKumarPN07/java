abstract class shape {
   int dimension1;
   int dimension2;

   public shape(int dimension1, int dimension2) {
       this.dimension1 = dimension1;
       this.dimension2 = dimension2;
   }

   abstract void printArea();
}

class rectangle extends shape {
   public rectangle(int width, int height) {
       super(width, height);
   }

   void printArea() {
       int area = dimension1 * dimension2;
       System.out.println("Area of rectangle: " + area);
   }
}

class triangle extends shape {
   public triangle(int width, int height) {
       super(width, height);
   }

   void printArea() {
       double area = 0.5 * dimension1 * dimension2;
       System.out.println("Area of triangle: " + area);
   }
}

class circle extends shape {
   public circle(int radius) {
       super(radius, 0);
   void printArea() {
       double area = Math.PI * dimension1 * dimension1;
       System.out.println("Area of circle: " + area);
   }
}

 class h {
   public static void main(String[] args) {
       shape rectangle = new rectangle(5, 10);
       rectangle.printArea();

       shape triangle = new triangle(5, 10);
       triangle.printArea();

       shape circle = new circle(7);
       circle.printArea();
   }
}
