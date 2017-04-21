package com.myclasses;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.ResultSet;
@Resource(name = "DatabaseOperationsInterface")
public interface DatabaseOperationsInterface {
	Connection connect();
	ResultSet  Read(String read);
	boolean Update(String update);
	boolean delete();
	boolean write(String s);
}
