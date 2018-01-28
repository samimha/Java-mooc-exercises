
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public int size(){
        return squareMeters;
    }
    
    public int price(){
        return pricePerSquareMeter * squareMeters;
    }
    
    public boolean larger(Apartment otherApartment){
        if(squareMeters > otherApartment.size())
            return true;
        else
            return false;
    }
    
    public int priceDifference(Apartment otherApartment){
        if (price() - otherApartment.price() < 0)
            return otherApartment.price() - price();
        else
            return price() - otherApartment.price();
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        if(price() > otherApartment.price())
            return true;
        else
            return false;
        
    }
    
}
