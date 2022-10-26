package org.example.functional_interface.note0002;

/**
 * 입력받은 값이 동일한 경우 반드시 결과값이 같아야함
 */


public class Main {

    public static void main(String[] args) {

        // 입력받은 값이 동일한 경우 반드시 결과값이 같아야함 => 순수함수
        // 보장할 수 없으면 함수형 프로그래밍이 아님
        Sample sample = new Sample(){

            @Override
            public int doSomething(int number) {
                return number +10;
            }
        };

        int result = sample.doSomething(10);
        System.out.println(result);

/**
 * 경우 1 : 외부의 있는 값을 쓸 경우
 *         int data1= 10;  // 이걸 final 생략했다고 가정하고 참조는 가능
 *         Sample sample = new Sample(){
 *             int data2= 20;
 *
 *               @Override
 *             public int doSomething(int number) {
 *                 return number +10+ data1;
 *             }
 *         };
 */

/**
 * 경우 2 : 외부의 있는 값을  변경하려는 경우 -> 문법적으로 막혀있음
 *         int data1= 10;
 *         Sample sample = new Sample(){
 *             int data2= 20;
 *
 *               @Override
 *             public int doSomething(int number) {
 *                 data1++;
 *                 data2++;
 *                 return number +10+ data1;
 *             }
 *         };
 */


        Sample sample2 = (number)->number+10;
        int result2 = sample2.doSomething(10);
        System.out.println(result);

    }
}
