package com.execel.springboot.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.execel.springboot.model.BusinessPartner;

/**
 * reads the excel file and saves it in repository
 * 
 * @author Kalaivanan 
 *
 */

public class ReadExcelFile {

	/**
	 * gets param file and read's it and save it in an arraylist and returns it
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static List<BusinessPartner> excelToDb(FileInputStream file) throws IOException {
		XSSFWorkbook ex = new XSSFWorkbook(file);
		Sheet st = ex.getSheetAt(0);

		List<BusinessPartner> business = new ArrayList<BusinessPartner>();
		Iterator<Row> itr = st.iterator();
		itr.next();
		while (itr.hasNext()) {
			Row row = itr.next();

			BusinessPartner bs = new BusinessPartner();

			Iterator<Cell> cellItr = row.cellIterator();
			while (cellItr.hasNext()) {
				Cell cell = cellItr.next();
				int index = cell.getColumnIndex();

				switch (index) {
				case 0:
					bs.setBusinessPartnerId((int) cell.getNumericCellValue());
					break;
				case 1:
					bs.setBusinessPartnerName(cell.getStringCellValue());
					break;
				case 2:
					bs.setBusinessPartnerCode(cell.getStringCellValue());
					break;
				case 3:
					bs.setContactNumber(cell.getStringCellValue());
					break;
				case 4:
					bs.setAddress1(cell.getStringCellValue());
					break;
				case 5:
					bs.setAddress2(cell.getStringCellValue());
					break;
				case 6:
					bs.setCity(cell.getStringCellValue());
					break;
				case 7:
					bs.setProvince(cell.getStringCellValue());
					break;
				case 8:
					bs.setCountry(cell.getStringCellValue());
					break;
				case 9:
					bs.setPostalCode(cell.getStringCellValue());
					break;
				case 10:
					bs.setParentCompany(cell.getStringCellValue());
					break;
				case 11:
					bs.setTollFreeNumber(cell.getStringCellValue());
					break;
				case 12:
					bs.setPhone(String.valueOf((long) cell.getNumericCellValue()));
					break;
				case 13:
					bs.setPhoneExtension(String.valueOf((long) cell.getNumericCellValue()));
					break;
				case 14:
					bs.setFax(cell.getStringCellValue());
					break;
				case 15:
					bs.setWebsiteUrl(cell.getStringCellValue());
					break;
				case 16:
					bs.setPaymentCondition((int) cell.getNumericCellValue());
					break;
				case 17:
					bs.setGlNumber(cell.getStringCellValue());
					break;
				case 18:
					bs.setDriverMinAge((int) cell.getNumericCellValue());
					break;
				case 19:
					bs.setApiEnabled((int) cell.getNumericCellValue());
					break;
				case 20:
					bs.setStatus((int) cell.getNumericCellValue());
					break;
				case 21:
					bs.setOneWayFeePaidBy(cell.getStringCellValue());
					break;
				case 22:
					bs.setCountryCode(cell.getStringCellValue());
					break;
				default:
					break;
				}
			}
			business.add(bs);
		}
		ex.close();
		return business;

	}
}