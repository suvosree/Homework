package q4;

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.Date;
/**
 * 
 * @author Suvosree Chatterjee
 *
 */
	public final class Student {

	   private final String name;
	   private final Date enrollment_date;

	   /*@invariant name != null && name.length>0; @*/ //class invariant
	   /*@invariant enrollment_date != null; @*/ //class invariant
	   
	   public Student(String name, Date enrollment_date) {
	       super();
	      
	       assert name != null : "Precondition: name != null";
	       assert enrollment_date != null : "Precondition: enrollment_date != null";
	       assert name.indexOf(",") != -1 : "Precondition: name.indexOf(\",\") != -1";
	      
	       this.name = name;
	       this.enrollment_date = enrollment_date;
	      
	       assert getName() == name : "Postcondition: getName() == name";
	       assert getEnrollment_date() == enrollment_date : "Postcondition: getEnrollment_date() == enrollment_date";
	   }

	   public String getName() {
	       return name;
	   }

	   public Date getEnrollment_date() {
	       return enrollment_date;
	   }

	   public static Comparator<Student> getCompByName =
	           new Comparator<Student>(){

	       @Override
	       public int compare(Student o1, Student o2) {

	           assert o1.name != null : "Precondition: o1.name != null";
	           assert o2.name != null : "Precondition: o2.name != null";
	          
	           return o1.name.compareTo(o2.name);
	       }

	   };

	   public static Comparator<Student> getCompByDate =
	           new Comparator<Student>(){

	       @Override
	       public int compare(Student p, Student q) {

	           if (p.getEnrollment_date().before(q.getEnrollment_date())) {
	               return -1;
	           } else if (p.getEnrollment_date().after(q.getEnrollment_date())) {
	               return 1;
	           } else {
	               return 0;
	           }
	       }

	   };
	   
	   public static void main(String args[])
	   
	   {
	      ArrayList<Student> al=new ArrayList<Student>();
	        
	      al.add(new Student("Annie",new Date(System.currentTimeMillis())));
	      al.add(new Student("Johnson",new Date(System.currentTimeMillis())));
	      al.add(new Student("Alpha",new Date(1580897313933L)));
	      al.add(new Student("Ron",new Date(1095379198L)));
	      al.sort(getCompByName);
	      System.out.println("Students list sorted by name");
	      for(int i=0;i<al.size();i++)
	      {
	      System.out.println("Student Name:"+al.get(i).getName()+", Enrollemnt Date:"+al.get(i).getEnrollment_date());
	      }
	      al.sort(getCompByDate);
	      System.out.println("Students list sorted by enrollment date");
	      for(int i=0;i<al.size();i++)
	      {
	      System.out.println("Student Name:"+al.get(i).getName()+", Enrollemnt Dat:"+al.get(i).getEnrollment_date());
	      }
	   }
	   
	}



