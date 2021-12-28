package com.cyyaw;

public class 稀疏数组 {


    public static void main(String[] args) {

        int row = 11;
        int col = 13;

        int[][] arr = new int[row][col];
        arr[1][2] = 1;
        arr[1][3] = 5;
        arr[6][3] = 5;
        //
        for (int[] rows : arr) {
            for (int data : rows) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        System.out.println("==========转稀疏数组========");
        // 转稀疏数组
        int sum = 0;// 有效数据
        for (int[] rows : arr) {
            for (int data : rows) {
                if (data != 0) {
                    sum++;
                }
            }
        }

        int[][] sarr = new int[sum + 1][3];
        sarr[0][0] = row;
        sarr[0][1] = col;
        sarr[0][2] = sum;
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            int[] arrdata = arr[i];
            for (int j = 0; j < arrdata.length; j++) {
                if (arrdata[j] != 0) {
                    sarr[index][0] = i;
                    sarr[index][1] = j;
                    sarr[index][2] = arrdata[j];
                    index++;
                }
            }
        }

        for (int i = 0; i < sarr.length; i++) {
            int[] satt = sarr[i];
            for (int j = 0; j < satt.length; j++) {
                System.out.printf("%d\t", satt[j]);
            }
            System.out.println();
        }
        System.out.println("==========稀疏数组转原数组========");

        int[][] newarr = new int[sarr[0][0]][sarr[0][1]];
        for (int i = 1; i < sarr.length; i++) {
            newarr[sarr[i][0]][sarr[i][1]] = sarr[i][2]  ;
        }

        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                System.out.printf("%d\t", newarr[i][j]);
            }
            System.out.println();
        }
    }
}
