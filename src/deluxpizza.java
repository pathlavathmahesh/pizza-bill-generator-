public class deluxpizza extends pizza {
    public deluxpizza(boolean veg){
        super(veg);
    }
    public void addextracheese(){
        this.price+=extracheese;
    }
    public void addextratopping()
    {
        this.price+=extratopping;
    }
}
