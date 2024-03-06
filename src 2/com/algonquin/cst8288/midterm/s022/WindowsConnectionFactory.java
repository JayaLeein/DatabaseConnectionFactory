package com.algonquin.cst8288.midterm.s022;

import com.algonquin.cst8288.midterm.s022.common.DriverEnum;
import com.algonquin.cst8288.midterm.s022.common.PlatformEnum;
import com.algonquin.cst8288.midterm.s022.common.ServerEnum;
import com.algonquin.cst8288.midterm.s022.windows.WindowsJDBCDriver;
import com.algonquin.cst8288.midterm.s022.windows.WindowsMySQLServer;
import com.algonquin.cst8288.midterm.s022.windows.WindowsODBCDriver;
import com.algonquin.cst8288.midterm.s022.windows.WindowsOracleServer;

class WindowsConnectionFactory implements ConnectionFactory {
	
	@Override
	public Driver createDriver(DriverEnum driverEnum) {
	
		switch(driverEnum) {
			case JDBC:
				return new WindowsJDBCDriver();
			case ODBC:
				return new WindowsODBCDriver();
			default:
				throw new IllegalArgumentException("Invalid type");
		}
	}
	
	@Override
	public Server createServer(ServerEnum serverEnum) {
		
		switch(serverEnum) {
			case ORACLE:
				return new WindowsOracleServer();
			case MYSQL:
				return new WindowsMySQLServer();
			default:
				throw new IllegalArgumentException("Invalid type");
		}
	}
	
	@Override
	public PlatformEnum getConnection() {
		
		return PlatformEnum.WINDOWS;
	}

}

