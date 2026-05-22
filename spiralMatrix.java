public class spiralMatrix {

    public static void spiral(int arr[][]) {

        int row = arr.length;
        int col = arr[0].length;

        int top = 0;
        int bottom = row - 1;
        int right = col - 1;
        int left = 0;

        while (top <= bottom && left <= right) {

            // top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 4, 4},
                {6, 9, 6, 6},
                {9, 9, 8, 4}
        };

        spiral(arr);
    }
}