package all.encapsulationStudy;

public class PriceCalc {
    private int age;
    private Double priceCalc;

    private Double storePrice;

    public void setStorePrice(Double storePrice) {
        this.storePrice = storePrice;
    }

    public Double getStorePrice() {
        return this.storePrice;
    }
    public Double getPrice(){
        if(priceCal()==-1) {
            System.out.println("Age Group not supported");
        }
        else if(priceCal()==-2) {
            System.out.println("Invalid Entry");
        }
        else System.out.println("The price for the student "+priceCal());
        return priceCal();
    }
    public void setAge(int age) {

        this.age = age;
    }

    private Double priceCal() {
        Double d=this.age>6? -1 : this.age==6 ? priceCalc=this.age*120.0 : this.age==5?priceCalc=this.age*110.0:this.age==4? priceCalc=this.age*100.0 : this.age<=3&&this.age>=0 ? priceCalc=3*90.0 : -2;
        return d;
    }


}
