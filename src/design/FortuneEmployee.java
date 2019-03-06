package design;

import databases.ConnectToSqlDB;

import java.util.List;

public class FortuneEmployee {

	private static List<String> storePattern;

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception {
		EmployeeInfo Einfo1 = new EmployeeInfo();
		EmployeeInfo Einfo2 = new EmployeeInfo(777);
		Einfo2.Parson();
		Einfo2.assignDepartment();
		Einfo2.calculateSalary();
		Einfo2.calculateEmployeeBonus(2);
		Einfo2.calculateEmployeePension();
		EmployeeInfo Einfo3 = new EmployeeInfo("Mohammad Hamid",107);



		ConnectToSqlDB connectDB = new ConnectToSqlDB();
		int[] array1 = new int[0];
		ConnectToSqlDB.insertDataFromArrayToSqlTable(array1, "tb2_Parson", "column_FortuneEmployee");
		storePattern = ConnectToSqlDB.readDataBase("tb2_Parson", "column_FortuneEmployee");
		System.out.println("Data is being read from the Table (tableParson) and displaying to the console");

	}

}
