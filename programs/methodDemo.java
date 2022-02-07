package programs;
public class methodDemo {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		methodDemo b = new methodDemo ();
		int ans = b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}

	}


