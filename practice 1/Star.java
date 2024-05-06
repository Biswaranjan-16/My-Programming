class Star{
	public static void main(String args[]){
	   int h=11;
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < h  + 1; j++) {
                if (i == j || i + j == h  + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
  }
}