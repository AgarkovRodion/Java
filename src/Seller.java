public class Seller extends Store {

    public String schedule;
    public double cash;
    public String experience;

    public Seller(String workSchedule, double cash, String workExperience) {
        super.assortment = "Товар есть";
        this.schedule = workSchedule;
        this.cash = cash;
        this.experience = workExperience;

    }

    public void checkAssortment(String assortment) {
        if (assortment.equals("Товар есть")) {
            System.out.println(super.assortment + "Можно работать");
        }
        else
            System.out.println("Нужно проверить товар");
    }
    public void workSchedule(String schedule){
        if (schedule.equals("10am-10pm")) {
            System.out.println(schedule + " - Дневная смена");
        }
        else
            System.out.println(schedule + " - Ночная смена");
    }
    public void workExperience(String experience){
        if(experience.equals("0")){
            System.out.println(experience + " - Продавец без опыта работы");
        }
        if(experience.equals("6 месяцев - год")){
            System.out.println(experience + " - У продавца средний опыт работы");
        }
        else
            System.out.println(experience + " - у продавца большой опыт работы");
    }
    public void cash(double cash){
        if(cash >= 2000){
            System.out.println(cash + " - Есть сдача");
        }
        else
            System.out.println(cash + " - Нечем дать сдачу");
    }

}