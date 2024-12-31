package com.lalit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.lalit.sbeans.WishMessageGeneretor;

public class MainClass {

	public static void main(String[] args) 
	{
	 System.out.println("MainClass.main() (start)");
	 
	 FileSystemXmlApplicationContext ctx=
			 new FileSystemXmlApplicationContext("src/com/lalit/cfgs/applicationContext.xml");
	       Object obj = ctx.getBean("wmg");
    
	   WishMessageGeneretor message=(WishMessageGeneretor)obj;
	   
	   String result=message.generateWishMessage("Lalit");
	   System.out.println(result);
       ctx.close();
       
       System.out.println("MainClass.main() (end)");
	}

}
