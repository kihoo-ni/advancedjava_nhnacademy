package Module04;

import java.util.Scanner;

public class bubblesort{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int[]bubblelist=new int[5];

        for(int i=0; i<=4; i++){
            System.out.println("숫자값을 입력하세요");
            bubblelist[i]=scanner.nextInt();
        }
        System.out.print("현재배열: ");
        for(int i=0; i<=4; i++){
            System.out.print(bubblelist[i]);
        }

        for(int i=0; i<bubblelist.length-1; i++){
            for(int j=0; j<bubblelist.length-i-1; j++){
                if(bubblelist[j]>bubblelist[j+1]){
                    int temp=bubblelist[j];
                    bubblelist[j]=bubblelist[j+1];
                    bubblelist[j+1]=temp;

                }
            }
        }

        System.out.print("정렬 결과: ");
        for(int i=0; i<=4; i++){
            System.out.print(bubblelist[i]);
        }
        scanner.close();
        }
    }
        