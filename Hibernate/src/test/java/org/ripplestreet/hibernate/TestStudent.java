package org.ripplestreet.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(22);
		s.setAge(2);
		s.setName("prashanth");
		s.setPercentage("90");
		Configuration conf = new Configuration();

		SessionFactory ss = conf.buildSessionFactory();
		Session sion = ss.openSession();
	}

}
