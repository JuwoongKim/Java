package org.example.functional_interface.note0001;

import org.example.functional_interface.note0001.Sample;

public class Main {

    public static void main (String [] args){

        //1. 일시적으로 사용할 객체인 경우  익명 클래스를 사용하기도 한다.
        Sample sample1 = new Sample() {
            @Override
            public void doSomting() {
                System.out.println("annoymous Innter Class 사용");
            }
        };

        sample1.doSomting();
        Sample.printName();
        sample1.printAge();

        //2. 추상메서드가 하나인 인터페이스인 경우 = 함수형 인터페이스 =  람다식 표현가능
        Sample sample2 = ()-> System.out.println("Lamda Expression 사용");

        sample2.doSomting();
        Sample.printName();
        sample2.printAge();

    }
}
