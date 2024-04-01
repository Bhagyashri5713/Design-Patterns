package LiskovSubstitutionPrinciple;

public class BaverageItem extends MenuItem {
    public BaverageItem(int price, String name, String description)
    {
        super(price, name, description);
    }

    @Override
    public double getPrice() {
       return this.price-getDiscount();
    }

    private double getDiscount()
    {
        int discountPercent = 10;
        return discountPercent*.01*this.price;
    }

   static void printItemPrice(MenuItem item)
    {
        if(item instanceof BaverageItem)
        {
            System.out.println("Baverage Item price:");
            //System.out.println(((BaverageItem)item).getPriceWithDiscount(10)); /// this will brack the LSP
        }
        else{
            System.out.println("Menu Item price:");
            //System.out.println(item.getPrice());
        }
        System.out.println(item.getPrice());
    }
}
