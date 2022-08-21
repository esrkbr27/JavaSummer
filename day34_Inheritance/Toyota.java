package day34_Inheritance;

public class Toyota {
    //en genel özellikleri yazdık
 protected String marka="Toyota";
 protected String model="Model belirtilmedical";
 protected String yakit="Yakit belirtilmedi.";


 protected void motor(){
     System.out.println("Toyota cevreci motorlar kullanır.");
 }

 protected void akü(){
     System.out.println("Toyota modele göre akü kullanır.");
 }


}
