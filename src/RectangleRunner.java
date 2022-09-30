public class RectangleRunner {
    public static void main(String[] args){

       Rectangle plot1 = new Rectangle(150, 200);
       Rectangle plot2 = new Rectangle(125);
       Rectangle plot3 = new Rectangle();

       plot1.setWidth(75);
       plot2.setWidth(75);
       plot2.setLength(75);
       plot3.setWidth(75);

       int plot1Seed = plot1.calculateArea();
       int plot2Seed = plot2.calculateArea();
       int plot3Seed = plot3.calculateArea();
       int Seed = plot1Seed + plot2Seed + plot3Seed;
       System.out.println("These three plots require " + Seed  + " square feet of seed");
    }
}
