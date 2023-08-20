package lexicon.se.Model;
import lexicon.se.Model.Product;

public interface VendingMachine {
    void addCurrency(int amount);
    int getBalance();
    Product request(int id);


    int endSession() ;
    String getDescription(int id);
    String [] getProducts();
}

