package Item;

public class main {
    public static void main(String[] args){
        iteam i = new PerishableItem(92, "Whey Protein", 2000, "20=12-25");
        i.displayDetails();

        i = new NonPerishableIteam(10, "Mobile", 12000, "jan-2025");
        i.displayDetails();
    }
}

class iteam{
    private int iteamID;
    private String iteamName;
    private double price;

    public iteam(int iteamID, String iteamName, double price){
        this.iteamID = iteamID;
        this.iteamName = iteamName;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("IteamName: "+ iteamName);
        System.out.println("IteamID: "+ iteamID);
        System.out.println("Price: "+ price);
    }
}

class PerishableItem extends iteam{
    private String expiryDate;

    public PerishableItem(int iteamID,String iteamName, double price, String expiryDate ){
        super(iteamID, iteamName, price);
        this.expiryDate = expiryDate;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("ExpiryDate: "+ expiryDate);
    }
}

class NonPerishableIteam extends iteam{
    private String warrantyDate;

    public NonPerishableIteam(int iteamID, String iteamName, double price, String warrantyDate){
        super(iteamID, iteamName, price);
        this.warrantyDate = warrantyDate;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("WarrantyDate: "+warrantyDate);
    }
}
