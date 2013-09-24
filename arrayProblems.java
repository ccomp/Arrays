public class arrayProblems {
	

	public static void main(String[] args) {
		int[] array;
		array = new int[10];
		for (int i =0; i<10; i++) {
			mainArray[i] = (int)(Math.random()* 10);
			System.out.println(Arrays.toString(mainArray));
		};

		rectangularize(array, 1, 2);

	}

	public static int[] rectangularize(int[] a, int x, int y){
		int count = 0;
		int response = [y][x];
		for (int i = 0; i<y; i++) {
			for (int j = 0; j < x; j++) {
				response[i][j] = a[count];
				count++;
			};
		};
		return response;
	}

	public static int[][] snakeDraft(int q, int w){
		int[][] draft = new int[q][w];
		for (int c = 0; c < r; c++) {
			for (int r = 0; r < draft[c].length; r++ ) {
				if (!(c%2==0)) {
					draft[c][r] = draft[c].length * (c + 1) - r;
				} else {
					draft[c][r] = (r+ 1) * (c + 1) + draft[c].length*c ;
				};
			};
		};
		return draft;
	}

	public static int determinantyxy(int[][] a){
		return (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
	}

}