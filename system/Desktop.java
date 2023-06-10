package org.system;

public class Desktop extends Computer{
	
	public int desktopSize(int size)
	{
		return size;
	}

	public static void main(String[] args) {
		
		Desktop objRef=new Desktop();
		objRef.computerModel();
		System.out.println(objRef.desktopSize(6)+ " inches");
		
	}

	}


