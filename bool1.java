
    public class bool1 {
        public static void main(String[] args) {
            boolean[][] array = { { true, false, true, },
                    { false, true, false } };
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == true) {
                        System.out.print("T");
                    } else {
                        System.out.print("F");
                    }
                }
                System.out.println();
    
            }
        }
    
}
