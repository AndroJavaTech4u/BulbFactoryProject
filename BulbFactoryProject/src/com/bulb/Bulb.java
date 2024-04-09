package com.bulb;

public class Bulb 
{
	
	int watt;
	double price;
	String color;
	boolean state;
	
	static int quantity;
	static String brandName;
	
	static
	{
		quantity=0;
		brandName="SURYA";
		System.out.println("[!!****************Bulb Factory Project For-- "+brandName+"-- Bulb*****************!!]");
		System.out.println("");
	}
	
	{
		quantity++;
	}

	Bulb()
	{
		watt=100;
		price=34.5;
		color="red";
		state=true;
	}
	
	Bulb(int w,double p,String c,boolean s)
	{
		watt=w;
		price=p;
		color=c;
		state=s;
	}
	
	void showDetails()
	{
		System.out.println("Watt of Bulb="+watt);
		System.out.println("Color of Bulb="+color);
		System.out.println("Price of Bulb="+price);
		System.out.println("State of Bulb="+state);
		System.out.println("Brand of Bulb="+brandName);
		System.out.println("-----------------------------------------------");
	}

	void changeState()
	{
		if(state==true)
			state=false;
		else
			state=true;
	}

	static void countBulb()
	{
		System.out.println("[!!*****Total Nuber of bulb="+quantity+"*******!!]");
	}

	
	void changeCompanayName(String cname)
	{
	brandName=cname;	
	}

	
	
	public static void main(String[] args) 
	{
		
		Bulb.countBulb();
		
		System.out.println("[!!**********Creating Same Type of Bub***********!!]");
		System.out.println("");
		Bulb bulb1=new Bulb();
	    Bulb bulb2=new Bulb();
		Bulb bulb3=new Bulb();
		System.out.println("***********Details of Bulb1***************");
		bulb1.showDetails();
		System.out.println("***********Details of Bulb2***************");
		bulb2.showDetails();
		System.out.println("***********Details of Bulb3***************");
		bulb3.showDetails();
		Bulb.countBulb();
		
		System.out.println("[!!**********Creating Different Type of Bub***********!!]");
		System.out.println("");
		
		
		Bulb bulb4=new Bulb(20,56.6,"green",true);
	    Bulb bulb5=new Bulb(60,5.6,"yellow",true);
		Bulb bulb6=new Bulb(300,7.6,"blue",false);
	
		
		System.out.println("***********Details of Bulb4***************");
		bulb4.showDetails();
		System.out.println("***********Details of Bulb5***************");
		bulb5.showDetails();
		System.out.println("***********Details of Bulb6***************");
		bulb6.showDetails();
		Bulb.countBulb();
		
		bulb6.changeState();
		System.out.println("***********Updated Details of Bulb6***************");
		bulb6.showDetails();
		bulb5.changeCompanayName("SURYA-JAVA");
		
		System.out.println("***********updated Details of Bulb5***************");
		bulb5.showDetails();
		
	}

}
