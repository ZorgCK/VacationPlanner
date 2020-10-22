package com.rapidclipse.vacationplanner.entities;

import one.microstream.reference.Lazy;

public class BinaryElement
{
	private Lazy<byte[]> binaryData;
	private String fileName;
	private String mimeType;

	public BinaryElement(final byte[] binaryData, final String fileName, final String mimeType)
	{
		super();
		this.binaryData = Lazy.Reference(binaryData);
		this.fileName = fileName;
		this.mimeType = mimeType;
	}

	public Lazy<byte[]> getBinaryData()
	{
		return this.binaryData;
	}

	public void setBinaryData(final Lazy<byte[]> binaryData)
	{
		this.binaryData = binaryData;
	}

	public String getFileName()
	{
		return this.fileName;
	}

	public void setFileName(final String fileName)
	{
		this.fileName = fileName;
	}

	public String getMimeType()
	{
		return this.mimeType;
	}

	public void setMimeType(final String mimeType)
	{
		this.mimeType = mimeType;
	}
}