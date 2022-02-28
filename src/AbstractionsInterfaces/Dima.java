package AbstractionsInterfaces;

public class Dima implements Administrator{
    String name;
    String worker;
    public Dima(String name,String worker){
        this.name = name;
        this.worker = worker;
    }
    @Override
    public void overdueNotification() {
        System.out.println(worker + " " + name + " находит и выдает книги и уведомляет о просрочках времени возврата.");
    }
}
