package SubClasses;

public class App {
    public static void main(String[] args){

        Chef normalChef = new Chef();
        normalChef.makeSpecialDish();

        ItalianChef italianChef = new ItalianChef();
        italianChef.makeSpecialDish();

        ChineseChef chineseChef = new ChineseChef();
        chineseChef.makeSpecialDish();

    }
}
