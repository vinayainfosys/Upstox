package method;

public class Non_static_with_parameter_same_class {
	public void addition(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args){
		Non_static_with_parameter_same_class s=new Non_static_with_parameter_same_class();
		s.addition(23, 45);
	}

}
