package com.algonquin.cst8288.midterm.s022;

import com.algonquin.cst8288.midterm.s022.common.DriverEnum;
import com.algonquin.cst8288.midterm.s022.common.PlatformEnum;
import com.algonquin.cst8288.midterm.s022.common.ServerEnum;
import com.algonquin.cst8288.midterm.s022.macos.MacOSJDBCDriver;
import com.algonquin.cst8288.midterm.s022.macos.MacOSMySQLServer;
import com.algonquin.cst8288.midterm.s022.macos.MacOSODBCDriver;
import com.algonquin.cst8288.midterm.s022.macos.MacOSOracleServer;


class MacOSConnectionFactory implements ConnectionFactory {
	
	@Override
	public Driver createDriver(DriverEnum driverEnum) {
		
		switch(driverEnum) {
			case JDBC:
				return new MacOSJDBCDriver();
			case ODBC:
				return new MacOSODBCDriver();
			default:
				throw new IllegalArgumentException("Invalid type");
		}
	}
	
	@Override
	public Server createServer(ServerEnum serverEnum) {
		
		switch(serverEnum) {
			case ORACLE:
				return new MacOSOracleServer();
			case MYSQL:
				return new MacOSMySQLServer();
			default:
				throw new IllegalArgumentException("Invalid type");
		}
	}
	
	@Override
	public PlatformEnum getConnection() {
		
		return PlatformEnum.MAC_OS;
	}

}

