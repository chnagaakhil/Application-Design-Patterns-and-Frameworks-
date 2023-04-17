package examples;

public class AppDemo {

	public static void main(String[] args) {
		MyTask task = new MyTask();
        task.print1();
        task.print2();      
    }
}

class MyTask{
    
    void print1(){
        System.out.println("Start printer 1");
        for(int doc=1; doc<=10; doc++){
            System.out.println("Printing document# "+doc +" from Printer1");
        }
         System.out.println("End printer 1");
        System.out.println("======================");
    }
    
    void print2(){
        System.out.println("Start printer 2");
        for(int doc=1; doc<=10; doc++){
            System.out.println("Printing document# "+doc +" from Printer2");
        }
         System.out.println("End printer 2");
         System.out.println("======================");
    }
}
