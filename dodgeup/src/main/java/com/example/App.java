package com.example;
public class App 
{
    public static void main( String[] args )
    {
        RevengeFulStack stack = new RevengeFulStack(30);
        try {
            stack.push(5);
            stack.push(10);
            stack.printStack();
            stack.push(16);
            stack.push(50);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
