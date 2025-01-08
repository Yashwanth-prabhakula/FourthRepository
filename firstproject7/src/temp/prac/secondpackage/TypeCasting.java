package temp.prac.secondpackage;

public class TypeCasting {

		public static void main(String[] args) 
		{
			// 1 ltr water bottle - 500ml of water  ---> There is no data loss ---> widining  
			// 1 ltr water bottle - 1.5ltr of water ---> There is data loss ---> Narowing
			
			//byte-1, short-2, int-4, long-8, float-4, double-8
			
			//Type Casting from one pritive type to another primitive type data
			
			/*
			int i1 = 11;
			System.out.println(i1);
			
			double i2 = i1;
			System.out.println(i2);
			
			 int i3 = (int) i2;
			 System.out.println(i3);
			 
			 char i4 = (char) i3;
			 System.out.println(i4);
			 
			 float i5 = 3.141f;
			 System.out.println(i5);
			 int i6 = (int) i5;
			 System.out.println(i6);
			
			//Type Casting from one primitive type to corresponding wrapper class
			 
			 int x1 = 100;
			 System.out.println(x1);
			 
			 Integer x2 = Integer.valueOf(x1);
			 System.out.println(x2);
			
			  //int  x3 = x2;
			  int x3 = (int)x2;
			  System.out.println(x3);
		
			  float x4 = 3.141f;
			  Float x5 = Float.valueOf(x4);
			  System.out.println(x5);
			 
			  float x6 = (float) x5;
			  System.out.println(x6);
			  */
			  
			//Type casting from one wrapper class to another wrapper class
			  
			  String s1 = "100";
			  String s2 = "300";
			  System.out.println(s1+s2);
			  
			  float f1 = Float.parseFloat(s1);
			  float f2 = Float.parseFloat(s2);
			  System.out.println(f1+f2);
			  
			 int p1 = Integer.parseInt(s1);
			 int p2 = Integer.parseInt(s2);
			 System.out.println(p1+p2);
			 
			Integer q1 = Integer.valueOf(p1);
			Integer q2 = Integer.valueOf(p2);
			System.out.println(q1+q2);
		}

	}
