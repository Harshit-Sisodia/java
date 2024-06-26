import java.awt.*;

public class AWTEx extends Frame {
      Frame f;
      Label l;
      TextField t1;
      TextArea ta;
      Button b;
      Checkbox c1,c2;
      CheckboxGroup g1;
      Choice C;
      List l1;
      Scrollbar S;
      Menu m;
      MenuItem m1;
      MenuBar mb;



    public AWTEx(){
        f = new Frame("AWT Example");
       f.setSize(500,500);
       f.setTitle("AWT Components");
       f.setVisible(true);
       f.setLayout(new FlowLayout());
       l=new Label("working with AWT Components");
       f.add(l);
       t1=new TextField(20);
       f.add(t1);
       ta = new TextArea("textArea",5,20);
       f.add(ta);
       b = new Button("click here");
        f.add(b);
        c1 =new Checkbox("male");
        f.add(c1);
        c2 = new Checkbox("Female",false,g1);
        f.add(c2);
        C = new Choice();
        C.add("Mango");
        C.add("Apple");
        C.add("Banana");
        f.add(C);
        l1 = new List(5);
        l1.add("java");
        l1.add("python");
        l1.add("C++");
        l1.add("javascript");
        l1.add("ruby");
        f.add(l1);
        S= new Scrollbar(Scrollbar.HORIZONTAL);
        f.add(S);
        mb= new MenuBar();
        m = new Menu("Menu");
        m1 = new MenuItem("Exit");
        

        
        
        






       

    }
    public static void main(String[]args){
        new AWTEx();
    }
    
}