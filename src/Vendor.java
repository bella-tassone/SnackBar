/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor {

    private int price;
    private int stock;
    private int deposit;
    private int change;
    private static double totalSales = 0;

    public Vendor(int p, int s) {
        price = p;
        stock = s;
    }

    public void setStock(int qty) {
        stock = qty;
    }

    public int getStock() {
        return stock;
    }

    public void addMoney(int centsAdded) {
        deposit+=centsAdded;
    }

    public int getDeposit() {
        return deposit;
    }

     public boolean makeSale() {
         if(stock!=0 && deposit>=price) {
             stock--;
             change = deposit - price;
             totalSales+=(price*0.01);
             return true;
         }
         else {
             change = deposit;
             return false;
         }
    }

    public int getChange() {
        int tempChange = change;
        change = 0;
        deposit = 0;
        return tempChange;
    }

    public static double getTotalSales() {
        double holder = totalSales;
        totalSales = 0.0;
        return holder;
    }
}