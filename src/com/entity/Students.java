package com.entity;

public class Students {
	private int    SId;
	private String SName;
	private String SSex;
	
	
	public Students()
	{
		
	}
	public Students(int sId, String sName, String sSex) {
		//super();
		SId = sId;
		SName = sName;
		SSex = sSex;
	}





	public int getSId() {
		return SId;
	}

	public void setSId(int sId) {
		SId = sId;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getSSex() {
		return SSex;
	}

	public void setSSex(String sSex) {
		SSex = sSex;
	}

	

	@Override
	public String toString() {
		return "Students [SId=" + SId + ", SName=" + SName + ", SSex=" + SSex
				+ ", SNumber=" + "]";
	}
	
	

	
}
