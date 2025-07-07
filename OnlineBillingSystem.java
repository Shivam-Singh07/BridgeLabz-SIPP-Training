class Product
{
    protected int price;
    protected String name;

    Product(int price, String name)
    {
        this.price = price;
        this.name = name;
    }
}

class Electronics extends Product
{
    Electronics(int price, String name)
    {
        super(price, name);
    }
}




public class OnlineBillingSystem 
{
        
}
