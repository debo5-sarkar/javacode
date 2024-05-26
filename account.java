public class Account {
	String owner;
	int accno;
	public Account()
	{
		this("Unknown",0);//clean coding delication model
	}
	public Account(String own)
	{
		this(own,0);
	}
	public Account (String own,int a)
	{
		owner=own;
		accno=a;
		
	}
    public static void main(String[] args) {
		Account a1=new Account();//if this call happens then own=unknown,a=0---ref=a1,a2....
		a1=new Account();
		Account a2=new Account("Subhasis Sir");//own=what we have passed(subhasis sir),a-default 0
		Account a3=new Account("Sbhasis Sir",12345);
		

	}

}