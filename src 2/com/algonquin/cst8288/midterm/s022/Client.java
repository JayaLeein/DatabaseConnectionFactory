package com.algonquin.cst8288.midterm.s022;

import com.algonquin.cst8288.midterm.s022.common.DriverEnum;
import com.algonquin.cst8288.midterm.s022.common.ServerEnum;

/**
 * 
 * 	ABSTRACT FACTORY: 
 * 
 *  The Abstract Factory design pattern falls under the creational design pattern category. 
 *	It provides an @interface or an @abstract class for creating families of related objects 
 *	without exposing their concrete implementations. 
 *
 *	This pattern is useful when there is a need 
 *	to create multiple related objects that belong to a common family or share a common theme.
 * 
 * 
 * 	SOLUTION
 * 	
 * 	Design a solution that creates database connection for Windows or Mac OS by 
 *  loading @Driver and launching @Server based on type defined in @DriverEnum and @ServerEnum
 * 
 * 
 * !! IMPLEMENT YOUR SOLUTION BASED ON ABSTRACT FACTORY DESIGN PATTERN !!
 * 
 * !! SAMPLE OUTPUT !!
 *  
 * 	-------------------------------------
 * 	Establishing Connection for :WINDOWS
 *  Loading JDBC Driver for Windows
 *  Launching MySQL Server for Windows
 * 
 * 	Establishing Connection for :MAC_OS
 *  Loading JDBC Driver for Mac OS
 *  Launching MySQL Server for Mac OS
 * 	--------------------------------------
 * 
 */

import com.algonquin.cst8288.midterm.s022.common.PlatformEnum;

public class Client {

    public static void main(String[] args) {


    	        ConnectionFactory windowsFactory = new WindowsConnectionFactory();
    	        ConnectionFactory macosFactory = new MacOSConnectionFactory();
    	        

    	        PlatformEnum windowsPlatform = windowsFactory.getConnection();
    	        System.out.println("-------------------------------------");
    	        System.out.println("Establishing Connection for: " + windowsPlatform);
    	        
    	        Driver windowsJdbcDriver = windowsFactory.createDriver(DriverEnum.JDBC);
    	        windowsJdbcDriver.loadDriver();
    	        
    	        Server windowsMysqlServer = windowsFactory.createServer(ServerEnum.MYSQL);
    	        windowsMysqlServer.launchServer();
    	        
    	        System.out.println("");
    	        
    	        PlatformEnum macosPlatform = macosFactory.getConnection();
    	        System.out.println("Establishing Connection for: " + macosPlatform);
    	        
    	        Driver macosJdbcDriver = macosFactory.createDriver(DriverEnum.JDBC);
    	        macosJdbcDriver.loadDriver();
    	        
    	        Server macosMysqlServer = macosFactory.createServer(ServerEnum.MYSQL);
    	        macosMysqlServer.launchServer();
    	        
    	        System.out.println("-------------------------------------");
    	        
    }
    	
 }
