public class wavePrintC {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = i + j;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else if (i % 2 != 0) {
                for (int j = 3; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }

        }
    }
}
