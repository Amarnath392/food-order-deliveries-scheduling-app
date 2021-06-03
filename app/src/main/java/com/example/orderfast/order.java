package com.example.orderfast;

public class  order {

    String orderName1;
    int arrivalTime1;
    int preparationTime1;
    int completionTime;
    int waitingTime;
    double ratio;
    int turnaroundtime;

    public order(String orderName1, int preparationTime1){
        this.preparationTime1=preparationTime1;
        this.orderName1 = orderName1;
    }

}
