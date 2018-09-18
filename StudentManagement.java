package student;

public class StudentManagement {
	
	public static void main(String[] args) {
		
		
     	Student StudentOne = new Student();
		StudentOne.getInfo();
		
		Student StudentTwo = new Student("student" , "000", "daikpro36@gmail.com");
		StudentTwo.getInfo();
		
		Student StudentThree = new Student(StudentOne);
		StudentThree.getInfo();
		
		StudentManagement group = new StudentManagement();
		group.st[0] = new Student();
		group.st[1]=new Student(StudentTwo);
	    group.st[2]=new Student();
	    group.StudentsByGroup();
		
	}
	
	public boolean sameGroup (Student StudentOne ,Student StudentTwo) {
		 
		return (StudentOne.getGroup() == StudentTwo.getGroup());
	
	}
	
	public Student[] st = new Student[100];
	int total =0;
	
	public  void StudentsByGroup() {
	   	
		    String nameGroup;
			int k=0;
			this.total =0;
			  
			  while(this.st[k]!=null) {
				  
				  this.total++;
				  k++;
			  }
			for(int i=0;i<total;i++) 
			{
			    for(int j =0;j<total -1;j++) {
				     if(this.st[i].getGroup().compareTo(st[j].getGroup())>0)
				{
					Student group;
					group=st[i];
					st[i]=st[j];
					st[j] =group;
					}
		    }
			}
			nameGroup = st[0].getGroup();
			System.out.println(nameGroup);
			for(int i=0;i<this.total;i++) {
				if(nameGroup == null ? st[i].getGroup() != null : !nameGroup.equals(st[i].getGroup())) {
					nameGroup =st[i].getGroup();
					System.out.println(nameGroup);
				}
			st[i].getInfo();
			}
        }}
