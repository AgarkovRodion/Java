

public class Store {
    public String name;
    public String assortment;
    public int storeSystem;
    public int staffMember;
    public int income;
    public String openingHours;

    public Store() {

    }

    public Store(String name, String assortment, int storeSystem, int staffMember, int income, String openingHours) {
        this.name = name;
        this.assortment = assortment;
        this.storeSystem = storeSystem;
        this.staffMember = staffMember;
        this.income = income;
        this.openingHours = openingHours;
    }

    public void showName(){System.out.println("Название магазина - " + name);}
    public void showIncome(){System.out.println("Доход магазина - " + income);}
    public void showStaffMember(){System.out.println("Количество сотрудников в магазине - "  +staffMember);}
    public void showAssortment(){System.out.println(assortment);}
    public void showStoreSystem(){System.out.println("Количество магазинов по городу - " + storeSystem);}

    public void showOpeningHours(){
        if(openingHours.equals("7am")){
            System.out.println("Магазин открыт - " + openingHours);
        }
        else
            System.out.println("Магазин закрыт");
    }
}
