package com.anjani.epam.maven_calculator;

public class yagni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRepository userRepository=new UserRepository();
		userRepository.getAll();

	}

}
class UserRepository{
	public void getAll()
	{
		System.out.println("returned all users");
	}
}
