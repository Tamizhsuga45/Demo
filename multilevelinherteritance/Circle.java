package multilevelinherteritance;

public class Circle extends Triangle {
	public void area(int r){
        double area = 3.14*r*r;
        System.out.println("The Circle Area is " + area);
}
}