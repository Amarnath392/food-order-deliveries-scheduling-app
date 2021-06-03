package com.example.orderfast;



public class OrderDelivary
{


    public static int[] calculate() {




        int a, b, i,j,k,l;
        int arrival=0;
        int no_Orders=Location.n,total_Preparation_Time=0;
        int count=0,count1=0;
        int []receive = new int[no_Orders];
        double large,small;



        for(j=0;j<no_Orders;j++)
        {
            total_Preparation_Time+=Location.orders.get(j).preparationTime1;
        }
        for(b=0;b<no_Orders;b++)
        {
            Location.orders.get(b).arrivalTime1=arrival;
            arrival=arrival+2;

        }

        while(count<total_Preparation_Time)
        {
            b=0;
            for(a=0;a<no_Orders;a++)
            {
                if(Location.orders.get(a).arrivalTime1 > count )
                {
                    b++;

                }
            }

            if(b==no_Orders)
            {
                count++;
                continue;
            }

            for(k=0;k<no_Orders;k++)
            {

                if(Location.orders.get(k).arrivalTime1 > count || Location.orders.get(k).preparationTime1<=0)
                {
                    Location.orders.get(k).ratio=0;

                }
                else
                {

                    Location.orders.get(k).waitingTime=(count) - (Location.orders.get(k).arrivalTime1);
                    Location.orders.get(k).ratio=(Location.orders.get(k).preparationTime1+Location.orders.get(k).waitingTime)/(Location.orders.get(k).preparationTime1);
                }
            }
            large=0;
            for(l=0;l<no_Orders;l++)
            {
                if(Location.orders.get(l).ratio>large)
                {
                    large=Location.orders.get(l).ratio;
                }
            }
            for(int m=0;m<no_Orders;m++)
            {
                if(large==Location.orders.get(m).ratio)
                {

                    Location.orders.get(m).waitingTime=count-(Location.orders.get(m).arrivalTime1);
                    count=count+Location.orders.get(m).preparationTime1;
                    Location.orders.get(m).turnaroundtime=Location.orders.get(m).waitingTime+Location.orders.get(m).preparationTime1;
                    Location.orders.get(m).completionTime=Location.orders.get(m).waitingTime+Location.orders.get(m).preparationTime1+Location.orders.get(m).arrivalTime1;
                    Location.orders.get(m).preparationTime1=0;

                }
            }

        }


        int no_Delivaries,total_Delivary_Time=0;
        //double large1;
        no_Delivaries=no_Orders;


        for(i=0;i<no_Delivaries;i++)
        {
            Location.delivaries.get(i).arrivalTime2=Location.orders.get(i).turnaroundtime;
        }

        for(j=0;j<no_Delivaries;j++)
        {
            total_Delivary_Time+=Location.delivaries.get(j).delivaryTime2;
        }

        small=1000;
        for(l=0;l<no_Orders;l++)
        {
            if(Location.orders.get(l).turnaroundtime<small)
            {
                small=Location.orders.get(l).turnaroundtime;
            }
        }
        for(int m=0;m<no_Orders;m++)
        {
            if(small==Location.orders.get(m).turnaroundtime)
            {
                count1=Location.orders.get(m).turnaroundtime;
            }
        }
        int count2;
        count2=total_Delivary_Time+count1;
        int count3=0,count4=0,count5=0,count6=0;
        int dum;

        while(count1<count2)
        {
            b=0;
            for(a=0;a<no_Delivaries;a++)
            {
                if(Location.delivaries.get(a).arrivalTime2> count1 )
                {
                    b++;

                }
            }

            if(b==no_Delivaries)
            {
                count1++;
                continue;
            }
            for(i=0;i<no_Delivaries;i++)
            {
                if(Location.delivaries.get(i).arrivalTime2>count1)
                {
                    count3=count3+1;
                }
            }
            count5=count3+count4;
            if(count5==no_Delivaries)
            {
                count6=count6+1;
                count1=count1+1;
                continue;
            }
            count3=0;
            count2=count2+count6;

            for(k=0;k<no_Delivaries;k++)
            {

                if(Location.delivaries.get(k).arrivalTime2> count1 || Location.delivaries.get(k).delivaryTime2<=0)
                {
                    Location.delivaries.get(k).ratio=0;

                }
                else
                {

                    Location.delivaries.get(k).waitingTime2=(count1) - (Location.delivaries.get(k).arrivalTime2)+count6;
                    Location.delivaries.get(k).ratio= (Location.delivaries.get(k).delivaryTime2+Location.delivaries.get(k).waitingTime2)/(Location.delivaries.get(k).delivaryTime2);
                }
            }
            large=0;
            for(l=0;l<no_Delivaries;l++)
            {
                if(Location.delivaries.get(l).ratio>large)
                {
                    large=Location.delivaries.get(l).ratio;
                }
            }
            for(int m=0;m<no_Delivaries;m++)
            {
                if(large==Location.delivaries.get(m).ratio)
                {
                    Location.delivaries.get(m).delivaryName=Location.orders.get(m).orderName1;
                    Location.delivaries.get(m).waitingTime2=count1-(Location.delivaries.get(m).arrivalTime2)+count6;
                    count1=count1+Location.delivaries.get(m).delivaryTime2;
                    Location.delivaries.get(m).turnaroundtime2=Location.delivaries.get(m).waitingTime2+Location.delivaries.get(m).delivaryTime2;
                    Location.delivaries.get(m).dum=(Location.delivaries.get(m).delivaryTime2)/2;
                    Location.delivaries.get(m).completionTime=Location.delivaries.get(m).waitingTime2+Location.delivaries.get(m).delivaryTime2+Location.delivaries.get(m).arrivalTime2;
                   Location.delivaries.get(m).delivaryTime2=0;
                    count4=count4+1;
                }
            }

        }


        for(i=0;i<no_Delivaries;i++)
        {

           receive[i]=Location.delivaries.get(i).completionTime-(Location.delivaries.get(i).dum);

        }
        return receive;


    }


}






