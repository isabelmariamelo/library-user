public class Patron{
   private String name;
   private String email;
   private int idNumber;
   private double balance;
   
   Patron(String name, String email, int idNumber, double balance){
      this.name = name;
      this.email = email;
      this.idNumber = idNumber;
      this.balance = balance;
   }
   public double adjustBalance(double amount){
      this.balance = this.balance + amount;
      return this.balance;
   }
   public boolean equals(Object other){
      boolean a;
      if (other instanceof Patron){
         Patron p = (Patron) other;
         a = (p.equals(idNumber)? true:false);
         return a;
      }
      else if (other instanceof Integer){
         Integer p = (Integer) other;
         a = (p.equals(idNumber)? true:false);
         return a;
      }
      else {
         return false;
      }
   }
   public String toString(){
      String patronString;
      patronString = "Name: " + this.name + ", Email: " + this.email + ", ID: " + this.idNumber + ", Balance: $" + this.balance;
      return patronString;
   }
   
}