package com.affiliate.common;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.affiliate.entities.Country;
import com.affiliate.entities.LanguageCode;
import com.affiliate.entities.Region;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {
	private String inputFile;

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public void readLanguageCodes(List<LanguageCode> languageCodes) throws IOException {
		File inputWorkbook = new File(inputFile);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(0);
			// Loop over columns and lines
			for (int i = 1; i < sheet.getRows(); i++) {
				Cell cell = sheet.getCell(0, i);
				LanguageCode lc = new LanguageCode(cell.getContents());
				languageCodes.add(lc);
			}
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}

	public void readCountries(String languageCode, List<Country> countries) throws IOException {
		File inputWorkbook = new File(inputFile);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(0);
			// Loop over columns and lines
			for (int i = 1; i < sheet.getRows(); i++) {
				Cell cell0 = sheet.getCell(0, i);
				Cell cell1 = sheet.getCell(1, i);
				Country c = new Country(languageCode, cell0.getContents(), cell1.getContents());
				countries.add(c);
			}
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}

	public void readRegions(String languageCode, List<Region> regions) throws IOException {
		File inputWorkbook = new File(inputFile);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(0);
			// Loop over columns and lines
			for (int i = 1; i < sheet.getRows(); i++) {
				Cell cell0 = sheet.getCell(0, i);
				Cell cell1 = sheet.getCell(1, i);
				Cell cell2 = sheet.getCell(2, i);				
				Region r = new Region(languageCode, cell0.getContents(), cell1.getContents(), cell2.getContents());
				regions.add(r);
			}
		} catch (BiffException e) {
			e.printStackTrace();
		}	
	}
}
