public class Student {
	   private String name;
	   private int number; 
	   private int age;
	   private String gender; 
	   private int[] grade;
	   
	   public Student(String stuName,int stuNumber,int stuAge,String stuGender, int[] stuGrade){
				this.name = stuName;
				this.number = stuNumber;
				this.gender = stuGender;
				this.age = stuAge;
				this.grade=stuGrade;
			}

	   public String getName(){
	        return name;
	   }
	   public int getNumber(){
	        return number;
	   }
	   public int getAge(){
	        return age;
	   }
	   public String getGender(){
	        return gender;
	   }
	   public int[] getGrade(){
	        return grade;
	   }
}
