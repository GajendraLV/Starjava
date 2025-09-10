class BankRunner{
public static void main(String [] args){
Bank bank = new Bank();
Rbi rbi= new Rbi();
rbi.money(bank);
System.out.println("this="+Bank.name);
}
}