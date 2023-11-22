package _03_array;
import java.util.Arrays;
//표준 배열

//배열
//-배열에 저장할 자료형 선언 -> 배열이름, 크기 선언
//-배열 원소는 모두 같은 타입
//-처음 선언한 배열의 크기는 변경 불가능

public class ArrayEx {
    public static void main(String[] args) {
        //배열 변수 선언
        //-두가지 방법이 있으나 관례적으로 첫번째 방법을 많이 쓰긴 함
//      1. 타입[] 변수;
        int[] arr1;
//      2. 타입 변수[];
        int arr2[];

        //-배열 젼수 '참조'방식 => null로 초기화가 가능하다.
        //primitive type은 null 값을 가질 수 없었던,,,,
        //=> 배열 변수가 null 값을 가진 상태에서 인덱싱 한다면 NullPointerException!!!이 발생한다 => 예외처리 다음장에서...
        String[] temp=null;
        System.out.println(temp); //null
        //System.out.println(temp[2]); //error
        int[] intArray={16,22,34,41,59};
        System.out.println("intArray[0]; "+intArray[0]);
        System.out.println("intArray[1]; "+intArray[1]);
        System.out.println("intArray[2]; "+intArray[2]);
        System.out.println(intArray);

        intArray[1]=77;//인덱스 1번 원수 갑을 변경
        System.out.println("intArray[1]"+intArray[1]);

       //*배열 변수 선언과 대입 시접이 다르다면, "new 타입[]"을 중괄호 앞에 붙여야 함
        char[] charArray;
//        charArray={'A','B','C'};
        charArray=new char[]{'A','B','C'};

        //-new 연산자로 배열 선언/생성
        //:배열 원소 값은 기본 값으로 초기화 됨
        double[] doubleArr=new double[3];
        System.out.println("new 연산자로 초기화 된 값"+doubleArr[0]);
doubleArr[0]=0.1;
doubleArr[1]=1.2;
doubleArr[2]=4.2;
        System.out.println("doubleArr[0]:"+doubleArr[0]);
        System.out.println("doubleArr[1]:"+doubleArr[1]);
        System.out.println("doubleArr[2]:"+doubleArr[2]);

        ////////////////////////
        //배열 길이
        //-배열 변수.length
        System.out.println("doubleArr 배열 길이: "+doubleArr.length);

        //ex. 총합, 평균
        int sum=0;
        for (int i =0 ; i<intArray.length;i++){
            sum+=intArray[i];
        }
        System.out.println("총합"+sum);
        double avg=(double)sum/intArray.length;
        System.out.println("평균:"+avg);
//        System.out.println(doubleArr[doubleArr.length]);//배열의 크기를 벗어나서 조회하고 있어 에러가 뜸

        /////////////////////////////////
        //배열 출력
        //-toString(): 배열 내용을 문자열로 변환해서 출력
        //-배열 주소(참조)값이 아니라 배열 내부의 값을 보고 싶을 때!(근데 import java.util.Arrays; 해와야함...)
        System.out.println("intArray"+Arrays.toString(intArray));
        System.out.println("charArray"+Arrays.toString(charArray));
        System.out.println("doubleArr"+Arrays.toString(doubleArr));

        ////////////////////////////////
        //다차원 배열
        //-배열 안에 또 다른 배열이 존재하는 배열

        //2*3배열 생성/초기화
        int[][] matrix={{1,2,3},{4,5,6}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        //3*2 배열 생성/초기화
        int[][] matrix2=new int[3][2];
        matrix2[0][0]=1;
        matrix2[0][1]=2;
        matrix2[1][0]=3;
        matrix2[1][1]=4;
        matrix2[2][0]=5;
        matrix2[2][1]=6;
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }
        int[][][] matrix3={{{1,2},{3,4}},{{5,6},{7,8}}};
        for(int i=0;i<matrix3.length;i++){
            for(int j=0;j<matrix3[i].length;j++){
                for(int k=0;k<matrix3[i][j].length;k++){
                    System.out.print(matrix3[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
