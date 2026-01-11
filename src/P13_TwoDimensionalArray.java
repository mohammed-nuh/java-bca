public class P13_TwoDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 4}, {4, 5, 7}};

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){  
                System.out.println("element[" + i + j + "]: " + arr[i][j]);
            }
        }
    }
}