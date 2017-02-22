package com.logictech.dwzq.core.exception;

public class ImportSerialsDataErrorException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4754944603341649128L;

	private int errorLine;
	
	private int errorRow;
	
	private String errorData ;
	
	public ImportSerialsDataErrorException(){
		
	}
	
	public ImportSerialsDataErrorException(String msg){
		super(msg);
		errorData = msg;
	}
	
	public ImportSerialsDataErrorException(int errorRow,  String msg){
		this(msg);
		this.errorRow=errorRow+1;
	}

	public int getErrorLine() {
		return errorLine;
	}

	public void setErrorLine(int errorLine) {
		this.errorLine = errorLine;
	}

	public String getErrorData() {
		return errorData;
	}

	public void setErrorData(String errorData) {
		this.errorData = errorData;
	}
	
	
	public int getErrorRow() {
		return errorRow;
	}

	public void setErrorRow(int errorRow) {
		this.errorRow = errorRow;
	}

	public String toString(){
		return "第"+errorRow +"行:"+errorData;
	}
	
	
	
	
}
