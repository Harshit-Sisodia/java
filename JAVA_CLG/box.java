public class box{
    // Attributes 
    private double width;
    private double height;
    private double depth;
    
    // constructor to intilize the box of dimesion
    
     box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    void volume()
    {
        double vol=width*height*depth;
        System.out.println(vol);
    }
  
     public static void main(String[]args){
        box mybox = new box(5,10,2);
        mybox.volume();
        
        
    }
}