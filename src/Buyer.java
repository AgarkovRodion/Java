public class Buyer {
    public int age;
    public double money;
    public String sex;

    public Buyer(int age, double financialAbility, String sex) {
        this.age = age;
        this.money = financialAbility;
        this.sex = sex;
    }

    public void financialAbility(double money) {
        if (money >= 15000){
        System.out.println(money + " - Может купить товар");
    }
        else
            System.out.println(money + " - Недостаточно средств");

    }
    public void gender(String sex){
        if(sex.equals("Мужской")){
            System.out.println("Пол покупателя мужской");
        }
        else
            System.out.println("Пол покупателя женский");
    }
    public void determineAge(int age){
        if(age < 7){
            System.out.println(age + " - Покупатель не имеет права покупать товар");
        }
         if ((age > 7) && (age <= 17)){
            System.out.println(age + " - Покупатель может купить товар, но он несовершеннолетний");
        }
         else
             System.out.println(age + " - Покупатель совершеннолетний");
    }
}
