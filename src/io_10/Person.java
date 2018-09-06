package io_10;

import java.io.*;
import java.time.*;
import java.util.*;

public class Person implements Serializable {

	private static final long serialVersionUID = -8170389295318532074L;
   

	class Hartbeat extends TimerTask {
		public void run() {
			System.out.print("*");
		}
	}

	private LocalDate birthDay;

	private String birthPlace;

	private String firstName;
	
	private transient Timer hartbeat;

	
	private String lastName;
	
	public Person(String fname, String lname, LocalDate birthDay) {
		this(fname,lname,birthDay,"unknown");
	}
	
	public Person(String fname, String lname, LocalDate birthDay, String birthPlace) {
		this.firstName = fname;
		this.lastName = lname;
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		hartbeat = new Timer(true);
		hartbeat.scheduleAtFixedRate(new Hartbeat(), 0, 1000);
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	private void readObject(ObjectInputStream s)
			throws IOException, ClassNotFoundException {
		s.defaultReadObject();
      if(birthPlace == null) birthPlace="Unknown";
		hartbeat = new Timer(true);
		hartbeat.scheduleAtFixedRate(new Hartbeat(), 0, 1000);
	}
}
