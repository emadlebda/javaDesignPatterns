package MVC;

public class View1 implements View{
    @Override
    public void show(String name, String major, double grade){
        System.out.println("Model: Name: "+name
                + " -- Major: "+major
                + " -- Grade: "+grade);
    }
}
