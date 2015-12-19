package com.example;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;
	
	@Autowired
	private AccountRepository arepo;

	@Autowired
	private CustomerNAccountRepository cnarepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();
		arepo.deleteAll();
		cnarepo.deleteAll();
		
		// save a couple of customers
		
		Account ac = new Account();
		ac.setTotal(100);
		ac.setId(ObjectId.get());
		arepo.save(ac);
		
		Customer a  = new Customer("Alice", "Smith");
		//a.setAccount(ac);
		
		repository.save(a);
		//repository.save(new Customer("Bob", "Smith"));
		CustomerNAccount cna = new CustomerNAccount();
		cna.setAccount(ac);
		cna.setCustomer(a);
		
		cnarepo.save(cna);
		
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (CustomerNAccount customer : cnarepo.findAll()) {
			System.out.println(customer);
		}
		System.out.println();
		// fetch all customers
		/*System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();*/

		// fetch an individual customer
		/*System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}*/

	}

}