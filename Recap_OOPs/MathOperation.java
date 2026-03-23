class  MathOperation{
	int a;
	int b;
	int c;
	void add(int a ,int b){
			System.out.println("Sum of a and b = "+(a+b));
		}

	void add (int a ,int b,int c){
		System.out.println(" Sum of a,b and c = " +(a+b+c));
	}

public static void main(String args[]){

	MathOperation  sum = new MathOperation();
	sum.add(10,20);
	sum.add(10,20,30);
}

}