public class Main {
    public static void main(String[] args) {

        Store store = new Store("Шестёрочка", "Молочная продукция", 567, 6082, 17680274,
                "7am");

        store.showStoreSystem();
        store.showName();
        store.showIncome();
        store.showOpeningHours();
        store.showStaffMember();
        store.showAssortment();

        Buyer buyer = new Buyer(37, 175000, "Мужской");


        buyer.gender(buyer.sex);
        buyer.determineAge(buyer.age);
        buyer.financialAbility(buyer.money);

        Seller seller = new Seller("6pm-1pm", 12352, "5 лет");

        seller.cash(seller.cash);
        seller.workExperience(seller.experience);
        seller.workSchedule(seller.schedule);
        seller.checkAssortment(store.assortment);

    }
}
