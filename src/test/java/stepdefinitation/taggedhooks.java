//package stepdefinitation;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//
//public class taggedhooks {
//	
//	@Before(order=0)
//	public void before1() {
//		System.out.println("1st Before method");
//	}
//	@After(order=0)
//	public void after2() {
//		System.out.println("1st After method");
//	}
//	
//	
//	
//	@Before(order=1)
//	public void before2() {
//		System.out.println("2nd Before method");
//	}
//	
//	
//	@After(order=2)
//	public void after1() {
//		System.out.println("2nd After method");
//	}
//	
//	
//
//	@Given("^first scene$")
//	public void first_scene(){
//		System.out.println("This is 1st scenario");
//	    
//	}
//
//	@Given("^second scene$")
//	public void second_scene(){
//		System.out.println("This is 2nd scenario");
//	}
//
//}
