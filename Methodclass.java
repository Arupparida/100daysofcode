package com.company;
//
//This class is for instance methods only.
public class Methodclass {

    double[] exchangeRates;//  {63.0,3.0,3.0,595.5,18.0,107.0,2.0};

    void setExchangeRates(double[] rates){
        exchangeRates= rates;
    }
    void updateExchangeRates(int arrayindex,double newVal){
        exchangeRates[arrayindex]=newVal;
    }

    double getExchangeRate(int arrayindex){
        return exchangeRates[arrayindex];
    }
    double computeTransferAmount(int arrayindex,double amount){
        return amount*getExchangeRate(arrayindex);
    }
    void printmoney(){
        System.out.println("\nrupee:" + exchangeRates[0]);
        System.out.println("dirham:" + exchangeRates[1] );
        System.out.println("real:" + exchangeRates[2]);
        System.out.println("chilean_peso:" + exchangeRates[3]);
        System.out.println("mexican_peso:" + exchangeRates[4]);
        System.out.println("yen:" + exchangeRates[5]);
        //System.out.println("$australian:" + exchangeRates[6]);//this same line can also be wriiten in the below manner.
        System.out.println("$australian:" + exchangeRates[exchangeRates.length-1]);
        //System.out.println("last value:" + exchangeRates.length);
//

    }



    public static void main(String[] args){
        Methodclass cc = new Methodclass();

        double[] rates={63.0,3.0,3.0,595.5,18.0,107.0,2.0};
        cc.setExchangeRates(rates);
        cc.printmoney();

        rates = new double[]{65.0,5.0,3.0,595.5,18.0,107.0,2.0};
        cc.setExchangeRates(rates);
        cc.printmoney();

        cc.updateExchangeRates(0,66.0);
        cc.printmoney();

        double amount = cc.computeTransferAmount(0,1000);
        System.out.println("\nTransfered amount:" + amount);



    }
}
