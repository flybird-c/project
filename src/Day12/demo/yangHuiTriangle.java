package Day12.demo;

import java.sql.Array;
import java.util.Arrays;

public class yangHuiTriangle {
    public static void main(String[] args) {//2.杨辉三角

    }
    public int[][] triangle(int x){
        int[][] triangle=new int[x][x];
        for (int i = 1; i < triangle.length+1; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                if (i==1){
                    triangle[i][i1]=1;
                }
                triangle[i][i1]=triangle[i-1][i-1]+triangle[i-1][i];
            }
        }
        return triangle;
    }
}
