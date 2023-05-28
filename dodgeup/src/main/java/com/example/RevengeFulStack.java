package com.example;

import java.util.LinkedList;

public class RevengeFulStack {

    private LinkedList<Object> myStack = new LinkedList<Object>();
    private int capacity;
    private boolean silent = false;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LinkedList<Object> getMyStack() {
        return myStack;
    }

    public void setMyStack(LinkedList<Object> myStack) {
        this.myStack = myStack;
    }

    public RevengeFulStack(int capacity) {
        this.capacity = capacity;
    }

    //push
    public void push(Object value) throws StackException{

        if (!silent) {
            if (myStack.size() == capacity) {
                throw new StackException("I will no longer bow down to you!");
            } else if (capacity/2 <= myStack.size()) {
                capacity = myStack.size();
                throw new StackException("No. I won't let you.");
            } else {
                capacity /= 2;
                myStack.add(value);
            }
        }   
    }

    //pop
    public void pop() throws StackException{
        if(!silent) {
            if (myStack.size() == capacity) {
                throw new StackException("I will not let you take away my children!");
            } else if (capacity/2 <= myStack.size()) {
                capacity = myStack.size();
                throw new StackException("No. I won't let you.");
            } else if(myStack.size() == 0) {
                capacity /= 2;
                throw new StackException("I have nothing to give you.");
            } else {
                capacity /= 2;
                myStack.removeLast();
            }
        }
    }

    //print
    public void printStack(){
        capacity /= 2;
        if (!silent) {
            if (capacity <= myStack.size()) {
                this.silent = true;
            }
            System.out.println(myStack);
        }
        
    }

}
