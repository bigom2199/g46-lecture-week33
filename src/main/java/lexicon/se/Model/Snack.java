package lexicon.se.Model;

public class Snack extends Product {

    public Snack(int id, double price,String snack) {
        super(id,price,snack);

    }

       public String examine(){
        return " { id:" + getId() + " , snack:" + getProductName() + "}" ;
       }




    @Override
    public String use () {
        return "You eat some " + getProductName();

    }


}
