package com.sapient.exceptions;

public class UncheckedExceptionDemo {
	public static void main(String [] args){
		int[] array = {34,45,43,21};
		try{
			System.out.println("The value is "+Long.parseLong("15a"));
			System.out.println("The fifth element of array is : "+array[5]);
			array = null;
			System.out.println("The first element of array is : "+array[1]);
/*		} catch(NumberFormatException exception){
			System.out.println("Please Enter a valid number");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please Enter a valid array element");
		} catch(NullPointerException e){
			System.out.println("Array is empty");
		}catch(NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e){
			System.out.println("Invalid Input" + e.getMessage());*/
		}catch (Exception e){
			System.out.println("Generic Exception");
			System.out.println(e instanceof NumberFormatException);
			System.out.println(e instanceof ArrayIndexOutOfBoundsException);
			System.out.println(e instanceof NullPointerException);
		}
	}

}
