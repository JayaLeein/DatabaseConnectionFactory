package com.algonquin.cst8288.midterm.s022;

import com.algonquin.cst8288.midterm.s022.common.DriverEnum;
import com.algonquin.cst8288.midterm.s022.common.PlatformEnum;
import com.algonquin.cst8288.midterm.s022.common.ServerEnum;

/**
 * 
 * Abstract Factory interface @ConnectionFactory must have following three methods 
 * 
 * @createDriver(DriverEnum driverEnum) - return @Driver
 * @createServer(ServerEnum serverEnum) - return @Server
 * @getConnection() - return @PlatformEnum
 *
 * 
 * 
 * This Abstract Factory interface @ConnectionFactory is implemented by following 
 * two concrete classes.
 * 
 * 1. @WindowsConnectionFactory - TODO 
 * 2. @MacOSConnectionFactory - TODO
 * 
 * Each of the above Factory should be able to load desired @Driver and launch
 * @Server based on the value defined in the @DriverEnum and @ServerEnum.
 * 
 * 
 * Example:
 * 
 * if @DriverEnum = JDBC and @PlatformEnum = WINDOWS, it should create an instance of 
 * @WindowsJDBCDriver - TODO 
 * 
 * 
 */

public interface ConnectionFactory {

  Driver createDriver(DriverEnum driverEnum);
  Server createServer(ServerEnum serverEnum);
  public PlatformEnum getConnection();
  
}
