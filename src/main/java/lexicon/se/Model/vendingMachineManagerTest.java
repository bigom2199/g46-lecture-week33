package lexicon.se.Model;

import lexicon.se.Model.VendingMachineManager;
import lexicon.se.Model.Product;

import lexicon.se.Model.Beverage;

import java.beans.Transient;


public class vendingMachineManagerTest {
    private Product[] products;
    private VendingMachineManager vendingMachine;

    void SetUp() {
        products = new Product[] {
                new Snack( 1,1.5,"Chips"),
                new Fruit(2,"Apple","Red",0.75),
                new Beverage(3,"Soda " , false,40,2.0)
        };
        vendingMachine = new VendingMachineManager(products) ;


    }


         public  void testAddCurrency(){
        vendingMachine.addCurrency(10);
        assertEquals  (10,vendingMachine.getBalance()) ;

      }

      void testGetBalance(){
        vendingMachine.addCurrency(5);
        vendingMachine.addCurrency(20);
        assertEquals(25,vendingMachine.getBalance());

      }
      void testRequestSuccessful(){
        vendingMachine.addCurrency(5);
        Product requestedProduct = vendingMachine.request(2);
        assertNotNull(requestedProduct);
      }


    }


