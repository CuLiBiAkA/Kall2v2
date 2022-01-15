package com.company.KalikuliatirV228;

import java.lang.Exception;

class ObshiiException extends Exception {
    public ObshiiException() {
        System.out.println("какая то хуйня тут у тебя");
    }
}

class OneException extends ObshiiException {
    public OneException() {
        System.out.println("т.к. используются одновременно разные системы счисления");
    }
}

class TwoException extends ObshiiException {
    public TwoException() {
        System.out.println("т.к. строка не является математической операцией");
    }
}

class ThreeException extends ObshiiException {
    public ThreeException() {
        System.out.println("т.к. в римской системе нет отрицательных чисел");
    }
}

class ForException extends ObshiiException {
    public ForException() {
        System.out.println("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
    }
}