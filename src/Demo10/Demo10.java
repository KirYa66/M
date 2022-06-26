package Demo10;

// Импорт класса Date:
import java.util.Date;
// Класс MyThread наследует класс Thread:
class MyThread extends Thread{
    // Время задержки и количество итераций:
    private int time;
    private int count;
    // Конструктор:
    MyThread(String name,int time,int count){
        super(name);
        this.time=time;
        this.count=count;
        System.out.print("Создан поток: "+getName()+". ");
// Дата и время:
        System.out.println("Время: "+new Date());
// Запуск потока:
        start();
    }
    // Код для выполнения в потоке:
    public void run(){
        try{
            for(int k=1;k<=count;k++){
                System.out.print(
                        "["+k+"/"+count+"] "+getName()+". "
                );
// Дата и время:
                System.out.println("Время: "+new Date());
                // Задержка в выполнении потока:
                Thread.sleep(time);
            }
// Обработка исключения (нет команд):
        }catch(InterruptedException e){}
        System.out.print("Завершен поток "+getName()+". ");
// Дата и время:
        System.out.println("Время: "+new Date());
    }
}
// Главный класс:
class Demo10{
    // Исключение InterruptedException в методе main()
// не обрабатывается:
    public static void main(String args[]) throws InterruptedException{
        System.out.print("Главный поток. ");
// Дата и время:
        System.out.println("Время: "+new Date());
// Создание трех дочерних потоков:
        MyThread A=new MyThread("Alpha",5000,5);
        MyThread B=new MyThread("Bravo",6000,4);
        MyThread C=new MyThread("Charlie",7000,3);
// Ожидание завершения дочерних потоков:
        if(A.isAlive()) A.join();
        if(B.isAlive()) B.join();
        if(C.isAlive()) C.join();
        System.out.print("Главный поток. ");
// Дата и время:
        System.out.println("Время: "+new Date());
    }
}