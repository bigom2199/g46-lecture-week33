package lexicon.se.Model;



import lexicon.se.Model.Product;




public class VendingMachineManager implements  VendingMachine {
    public static final int[] VALID_DENOMINATIONS = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    private final Product[] products;
    public int depositPool;

    public VendingMachineManager(Product[] Products) {
        this.products = Products;

    }

    @Override
    public void addCurrency(int amount) {
        for (int validDenomination : VALID_DENOMINATIONS) {

            if (validDenomination == amount) {
                depositPool += amount;
            }
        }

    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    public Product request(int id) {
        for (Product product : products) {
            if (product.getPrice() == id) {
                if (product.getPrice() <= depositPool) {
                    depositPool = (int) (depositPool - product.getPrice());
                    return product;
                } else {
                    throw new RuntimeException("Product" + product.getPrice() + " is too expensive");

                }
            }

        }
        throw new RuntimeException("Could not find product with id " + id);
    }

    @Override
    public int endSession() {
        int temp = depositPool;

        depositPool = 0;
        return temp;
    }

    @Override
    public String getDescription(int id) {
        String notFound = "Could not find product with id" + id;
        for (Product Product : products) {
            if (Product.getId() == id) {
                return products.examine().concat(" price:" + Product.getPrice());
            }
        }
                return notFound;
        }
        @Override
        public String [] getProducts(){
         String [] ProductsAsString = new String [products.length] ;
         for (int i = 0 ; i < products.length;i++) {
             ProductsAsString[i] = products[i].examine().concat(" price:" + products[i].getPrice());
         }
         return ProductsAsString;
        }
    }

