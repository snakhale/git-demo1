package com.javatechie.app.git_demo1;

import com.javatechie.app.git_demo1.Constant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Added new line for git demo");
        
       
    }
    
    public void addData(String data) {
    	System.out.println("data ="+data);
    	if (data.equals(Constant.DATA_TYPE)) {
    		System.out.println("I am Samir");
    	}
    	
    }
}
