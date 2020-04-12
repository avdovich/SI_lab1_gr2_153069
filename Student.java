class Student {
	String index;
	String firstName;
	String lastName;
	
	ArrayList <Integer> grades = new ArrayList <Integer>;

	//TODO constructor
	public Student(String index, String firstName, String lastName, ArrayList <Integer> grades){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	//TODO seters & getters
	public void setIndex(String index){
		this.index = index;
	}

	public String getIndex(){
		return index;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}


	public double getAverage(ArrayList <Integer> grades) {
		//TODO
		double avg;
		double suma;
		int vkupno;

		for(int i=0; i<grades.size; i++){
			suma += grades[i];
			vkupno++;
		}

		avg = suma / (double)vkupno;

		return avg;
	}

	public int ECTSCredits(ArrayList <Integer> grades) {
		//TODO
		int ects;
		int vkupno;

		for(int i=0; i<grades.size; i++){
			vkupno++;
		}

		ects = vkupno*6;

		return ects;
	}
}

class Faculty{
	List <Student> studenti = new List<Student> ();

	public void addStudent(Student student){
		studenti.add(student);
	}

	public void removeStudent(Student student){
		studenti.remove(student);
	}
}
}
