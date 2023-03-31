public abstract class TangibleAsset{
  private String name;
  private int price;
  private String color;
  
  public TangibleAsset(String name, int price, String color){
    this.name = name;
    this.price = price;
    this.color = color;
  }
  
  public String getname(){return this.name};
  public int getprice(){return this.price};
  public String getcolor(){return this.color};
}
