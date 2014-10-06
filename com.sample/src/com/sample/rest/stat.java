package com.sample.rest;

import java.util.Scanner;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/stat/get")
public class stat 
{

	@GET
	@Path("/version")
	@Produces(MediaType.TEXT_HTML)
	public String version()
	{
		
		Scanner scan = new Scanner(System.in);
	       
        link_li op = new link_li(); 
              
        int ch;
 
        do
        {
            System.out.println("#### MENU ####");
            System.out.println("1. Add an element ");
            System.out.println("2. Remove an element ");
            System.out.println("3. Modify an element ");
            System.out.println("4. Display the list ");
            System.out.println("5. Get list size ");
            System.out.println("6. Exit ");      
            int c4 = 0;
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
            		int val,c1 = 0;
            		do
            		{
                   System.out.println("Enter the element you want to add : ");
                   val=scan.nextInt();
                   op.add(val);
                   System.out.println("Do you wish to add another element : [0=no / 1=yes] ");
                   c1=scan.nextInt();
            		}while(c1==1);
            		break;
            	
            case 2 : 
            		int val1,c2 = 0;
            		try
            		{
            			do
            			{
            				System.out.println("Enter the element you want to remove : ");
            				val1=scan.nextInt();
            				op.remove(val1);
            				System.out.println("Do you wish to remove another element : [0=no / 1=yes] ");
            				c2=scan.nextInt();
            			}while(c2==1);
            		}
            		catch(NullPointerException e)
            		{
            			System.out.println("\n\nPlease create a list first .... \n\n");
            		}
            		break;
            		
            case 3 : 
            		int val2,val3,c3 = 0;
            		do
            		{
            			System.out.println("Enter the element you want to modify : ");
            			val2=scan.nextInt();
            			System.out.println("Enter the modified value :" );
            			val3=scan.nextInt();
            			op.modify(val2,val3);
            			System.out.println("Do you wish to modify another element : [0=no / 1=yes] ");
            			c3=scan.nextInt();
            		}while(c3==1);
                                  
            case 4 : 
            	
            		System.out.println("The linked list : \n");
            		op.display();
            		
                
            case 5 : 
            	
            		System.out.println("The size of the linked list is "+op.size);
            		break;
                                 
            case 6 : 
            		c4=1;
            		break;
                                      
             default : 
            	 	break;
                
            }
            
            if(c4==1)
            {
            	break;
            }
            else
            {
            System.out.println("\nDo you want to continue [0=no / 1=yes] \n");
            ch = scan.nextInt();                        
            }
        } while (ch == 1);               
    scan.close();
    
    return "<h1>DONE..</h1>";
	}
	
			
	
}
