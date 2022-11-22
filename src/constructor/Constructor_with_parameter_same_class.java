package constructor;

public class Constructor_with_parameter_same_class {
	public Constructor_with_parameter_same_class(int a, int b){
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args){
		Constructor_with_parameter_same_class s=new Constructor_with_parameter_same_class(56, 53);
	}

}
