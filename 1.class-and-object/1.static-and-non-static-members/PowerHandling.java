class PowerHandling{
	public static void main(String[] args) {
		int num=5;
		int sqaure=square(num);
		int cube = cube(num);
		
	}

	public static int square(int num){
		return num*num;
	}

	public static int cube(int num){
		return num*num*num;
	}

	public static int squareroot(int num){
		int i=1;
		while(i*i<=num){
			if(i*i==num) return i;
			i++;
		}
		
		return i;
	}

	public static int cuberoot(int num){
		int i=1;
		while(i*i*i<=num){
			if(i*i*i==num) return i;
			i++;
		}
		return i;
	}
}