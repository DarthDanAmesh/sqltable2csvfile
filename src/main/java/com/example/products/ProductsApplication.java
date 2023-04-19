package com.example.products;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

//@SpringBootApplication
public class ProductsApplication {
	public static void main(String[] args) throws IOException, SQLException {
// creating the csv format
		CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator("\n");
// file name
		final String FILE_NAME = "product.csv";
// creating the file object
		File file = new File(FILE_NAME);
// creating file writer object
		FileWriter fw = new FileWriter(file);
// creating the csv printer object
		CSVPrinter printer = new CSVPrinter(fw, format);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the query ----> ");
// reading the query from user as input
		String query = scanner.nextLine();
// printing the result in 'CSV' file
		printer.printRecords(SQLService.getResult(query));
		System.out.println("Query has been executed successfully...");
// closing all resources
		scanner.close();
		fw.close();
		printer.close();
	}
}
