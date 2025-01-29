package org.example.yhs3237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoPointer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //수열의 크기

        int[] arrForNum = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrForNum.length; i++) {
            arrForNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrForNum); //배열 오름차순 정렬

        int x = Integer.parseInt(br.readLine()); //목표 숫자

        int count = 0; //쌍의 수

        //투포인터 이용하기
        int start = 0;
        int end = arrForNum.length - 1;

        while (start < end) {
            int sum = arrForNum[start] + arrForNum[end]; //두 수의 합
            if (sum == x) {
                count++;
                start++;
                end--;
            } else if (sum > x) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(count);
    }
}
