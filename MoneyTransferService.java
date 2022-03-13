package com.company;

public class MoneyTransferService {




//
//    double[] exchangeRates = new double[] {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
//
//
//
//    void setExchangeRates(double[] rates) {
//
//        exchangeRates = rates;
//
//    }
//
//    void updateExchangeRate(int countryIndex, double newVal) {
//
//        exchangeRates[countryIndex] = newVal;
//
//    }
//
//
//
//    double getExchangeRate(int countryIndex) {
//
//        return exchangeRates[countryIndex];}

//All the above methods present in another java file  has been accessed from this java file by using a single instance variable which is line 33 here..  

    Currency_converter2 cc2 = new Currency_converter2();



    double computeTransfer_Amount(int countryIndex, double amount) {

        return cc2.computeTransfer_Amount(countryIndex,amount);

    }

    double computeTransferFee(int countryIndex, double amount){
        double transferFee = 0.02 * computeTransfer_Amount(countryIndex,amount);
        return transferFee;
    }



        public static void main(String[] args) {

            MoneyTransferService transferService = new MoneyTransferService();

            double transferAmount = transferService.computeTransfer_Amount(0, 1000);

            double transferFee = transferService.computeTransferFee(0, 1000);

            System.out.println("Transfer Amount: " + transferAmount);

            System.out.println("Transfer Fee: " + transferFee);

        }

        //public static void main(String[] args)


}
