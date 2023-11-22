package _03_array;
import java.util.Arrays;
import java.util.Scanner;
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
        //////////////////////
//객체를 참조하는 배열
//-기본타입 배열 각 원소에 "값"이 저장
//-참조타입 배열 각 원소에 "참조(주소)"가 저장
        String[] lengs= new String[3];
        lengs[0]="JAVA";
        lengs[1]="JAVA";
        lengs[2]=new String("JAVA");

        // 0,1:문자열 리터럴 저장. 문자열 리터럴; JAVA 컴파일러가 문자열 풀(string pool) 공유된 영역에 저장
        // 2: new 연산자로 문자열 객체를 생성(참조값도 새로 받음)
        System.out.println(lengs[0]==lengs[1]);//true: 같은 객체 참조
        System.out.println(lengs[1]==lengs[2]);//false: 다른 객체 참조
        System.out.println(lengs[0].equals(lengs[2]));//true: 같은 문자열

        //////////////////////////
        //배열 관련 메소드
        //배열 복사
        //-표준 배열은 크기가 고정 -> 더 많은 저장공간이 필요하다면, 더 큰 길이의 배열을 새로 만들어 기존 배열을 복사

        //ver1. 반복문 요소를 하나씩 복사
        int[] originArray={1,2,3};
        int[] newArray=new int[5];
        System.out.println("originArray: "+Arrays.toString(originArray));//originArray: [1, 2, 3]
        for(int i=0;i<originArray.length;i++){
                newArray[i]=originArray[i];}
        System.out.println("newArray: "+Arrays.toString(newArray));//newArray: [1, 2, 3, 0, 0]
        //ver2. arraycopy() 메소드
        //arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        //-Object src:원본 배열
        //-int srcPos:원본 배열 복사 시작 인덱스
        //-Object dest:새로운 배열
        //-int destPos:새로운 배열 붙여넣기 시작인덱스
        //-int length:복사할 원소 개수
        String[] originFruits={"apple","banana","kiwi"};
        String[] newFruits =new String[5];

        System.arraycopy(originFruits,0,newFruits,0,originFruits.length);
//        System.arraycopy(originFruits,1,newFruits,0,originFruits.length-1);
//        System.arraycopy(originFruits,0,newFruits,0,originFruits.length-1);
        System.out.println("originFruits: "+Arrays.toString(originFruits));
        System.out.println("newFruits: "+Arrays.toString(newFruits));

        //Arrays 메소드
        //copyOf(arr, copyArrLength)
        int[] originArr={1,2,3,4,5};
        System.out.println("originArr: "+Arrays.toString(originArr));
        int[] copiedArr=Arrays.copyOf(originArr,3);
        System.out.println("copiedArr: "+Arrays.toString(copiedArr));

        //copyOfRange(arr,sIdx, eIdx)
        int[] rangeArr=Arrays.copyOfRange(originArr, 1,4);
        System.out.println("rangeArr: "+Arrays.toString(rangeArr));

        //fill(arr,n)
        int[] filledArr= new int[5];
        Arrays.fill(filledArr, 7);
        System.out.println(Arrays.toString(filledArr));

        //sort()
        int[] unsortedArr={8,2,6,9,1};
        Arrays.sort(unsortedArr);//오름차순으로 정렬
        System.out.println(Arrays.toString(unsortedArr));//정렬한 것을 출력

        //equals(arr1,arr2)
        int[] array1={1,2,3};
        int[] array2={1,2,3};
        int[] array3={4,2,3};
        int[] array4=new int[]{1,2,3};
        System.out.println(Arrays.equals(array1,array2));//true
        System.out.println(Arrays.equals(array1,array3));//false
        System.out.println(Arrays.equals(array1,array4));//true
        System.out.println(array1==array2);//false
        System.out.println(array1==array3);//false
        System.out.println(array1==array4);//false

        //deepEquals(arr1,arr2)
        int[][] deepArray1={{1,2},{3,4}};
        int[][] deepArray2={{1,2},{3,4}};
        int[][] deepArray3={{1,2},{3,5}};
        System.out.println(Arrays.deepEquals(deepArray1,deepArray2));//true
        System.out.println(Arrays.deepEquals(deepArray1,deepArray3));//false

        //binarySearch(arr,val):단 배열이 정렬된 상태여야 함.
        int[] sortedArray={10,20,30,40,60,90};
        int idx=Arrays.binarySearch(sortedArray,60);
        System.out.println(idx);//4 정렬이 안되어 있으면 -6 이딴식으로 나오네

    Scanner sc=new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요.\n");
        int[] numArr=new int[5];
        int sum1=0;
        for(int i=0;i<numArr.length;i++){

            numArr[i]=sc.nextInt();
            sum1+=numArr[i];
        }
        System.out.println((double)sum1/numArr.length);





    }
}
