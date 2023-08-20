package lexicon.se.Model;

public abstract class Product{
    private final int id;
    private double price ;
    private String ProductName;
    public Product(int id,double price, String productName){
        this.id = id;
        this.price = price;
        this.ProductName= productName ;

    }
    public abstract String examine();

     public abstract String use() ;
    public int getId(){
        return id ;

    }
      public double getPrice() {
        return price;

      }
      public String getProductName(){
        return ProductName;
      }
}

