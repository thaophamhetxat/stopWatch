package com.codegym;

public class stopWatch {
    long startTime;
    long endTime;

    public stopWatch() {

    }
    public stopWatch(int startTime){

    }


public long reset(){
        startTime = System.currentTimeMillis();
        return startTime;
}


    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        long ElapsedTime = (this.endTime - this.startTime)*100;
        System.out.println("number mili second " + ElapsedTime);
        return ElapsedTime;
    }


}
