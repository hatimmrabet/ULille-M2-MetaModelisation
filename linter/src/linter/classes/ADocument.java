package linter.classes;

public abstract class ADocument {
	
	public abstract String getDocumentType();
	public String getDocumentName()
	{
		return "file1.txt";
	}
	
	public int getDocumentSize()
	{
		return 100; 
	}

}
