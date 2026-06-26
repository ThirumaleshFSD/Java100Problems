public class AreaOfRectangleRecursion {
    public static void main(String[] args) {
        int length = 5;
        int width = 3;
        int area = calculateArea(length, width);
        System.out.println("Area of rectangle: " + area);
    }   
    public static int calculateArea(int length, int width) {
        if (width == 0) {
            return 0;
        }
        return length + calculateArea(length, width - 1);
    }
}
