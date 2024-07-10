class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][c - 1 - j];
                image[i][c - 1 - j] = temp;

            }
            for (int k = 0; k < c; k++) {
                if (image[i][k] == 0) {
                    image[i][k] = 1;
                } else {
                    image[i][k] = 0;
                }
            }
        }
        return image;
    }
}