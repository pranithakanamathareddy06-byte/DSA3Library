class angle{
    int length;
    int breadth;
    void setDimensions(int l,int b){
        length = l;
        breadth = b;
    }
    int getArea(){
        return length * breadth;
    }
    int getPerimeter(){
        return 2 * (length + breadth);
    }
}
    public class RectangleDemo{
        public static void main(String[] args){
            angle rec = new angle();
            rec.setDimensions(10,5);
            System.out.println("area: " + rec.getArea());
            System.out.println("perimeter: " + rec.getPerimeter());

        }
    }
