/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

import java.util.Scanner;

/**
 *
 * @author Anusha K
 */
public class StackImpl {

    Object[] array;
    int top =-1, capacity;

    void capacity() {
        Scanner s = new Scanner(System.in);
        capacity = s.nextInt();
        array = new Object[capacity];
    }

    void push(Object element) throws Exception {
        if (top + 1 == capacity) {
            throw new Exception("Stack is full");
        } else {
            top++;
            array[top] = element;
        }
    }

    Object pop() throws Exception {
        Object temp;
        if (top == -1) {
            throw new Exception("Stack is empty");
        } else {
            temp = array[top];
            array[top] = null;
            top--;
        }
        return temp;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top + 1 == array.length;
    }
}
