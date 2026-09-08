//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      System.out.println("Задача №1");
      for (int i = 0; i < 10; i = i + 1){
          System.out.println("Итерация цикла " + i);
      }
System.out.println("Задача №2");
      for (int i = 10; i >= 1; i = i - 1){
          System.out.println("Итерация цикла " +i);
      }
System.out.println("Задача №3");
      for (int i = 0; i < 17; i=i+2){
          System.out.println("Итерация цикла " +i);
      }
      System.out.println("Задача №4");
      for (int i = 10; i > -10; i=i-1){
          System.out.println("Итерация цикла " +i);
      }
      System.out.println("Задача №5");
      for (int i = 1904; i < 2096; i=i+4){
          System.out.println("Високосным годом является " +i);
      }
      System.out.println("Задача №6");
      for (int i = 7; i < 105; i=i+7) {
          System.out.println("Итерация цикла " + i);
      }
      System.out.println("Задача №7");
      for(int i = 1; i < 1024; i=i *2) {
          System.out.println("Итерация цикла " + i);
      }
      System.out.println("Задача №8");
      int money = 29000;
      int total = 0;
      for (int i = 1; i <= 12; i++){
          total = total + money;
          System.out.println("Месяц " + i + " сумма накоплений равна " + total + " руб");
      }
      System.out.println("Задача №9");
      total = 0;
      for (int i = 1; i <=12; i++){
          total = total + total/100;
          total = total + money;
          System.out.println("Месяц " + i + " сумма накоплений равна " + total + " руб");
      }
      System.out.println("Задача №10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2" + "*" + i + "=" + i * 2);
        }
    }
}