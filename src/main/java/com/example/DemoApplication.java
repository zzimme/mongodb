package com.example;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.relatedocument.CommentRepository;
import com.example.relatedocument.EmoticonRepository;
import com.example.relatedocument.PostRepository;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;
	
	@Autowired
	private AccountRepository accountrepo;

	@Autowired
	private CustomerNAccountRepository relationrepo;
	
	@Autowired
	private CustomerNAccountRepositoryImpl repoSupport;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private EmoticonRepository emoticonRepository;
	
	
	@Autowired MongoOperations operations;
	@Autowired
	 MongoTemplate mongoTemplate;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*emoticonRepository.deleteAll();
		commentRepository.deleteAll();
		postRepository.deleteAll();
		
		Post post = new Post();
		post.setTitle("title");
		post.setContent("content");
		
		Comment comment = new Comment();
		comment.setComment("comment....");
		comment.setRefer(1);
		
		Emoticon emo = new Emoticon();
		emo.setName("emo1");
		emoticonRepository.save(emo);
		
		comment.setEmoticon(emo);
		commentRepository.save(comment);
		
		post.setComment(comment);
				
		postRepository.save(post);
		
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Post cc : postRepository.findAll() ) {
			System.out.println(cc);
		}
		System.out.println();*/
		
		/*repository.deleteAll();
		accountrepo.deleteAll();
		relationrepo.deleteAll();
		
		// save a couple of customers
		
		Account account = new Account();
		account.setTotal(200);
		//account.setId(ObjectId.get());
		accountrepo.save(account);
		
		Account account_second = new Account();
		account_second.setTotal(2000);
		//account_second.setId(ObjectId.get());
		accountrepo.save(account_second);
		//Account account = accountrepo.findOne(new ObjectId("5678f6e2d4c6ea0b2c88828d"));

		//Customer customer = repository.findOne("5678f772d4c677cc0efdfb16");
		Customer customer  = new Customer("Kim", "marine");
		//a.setAccount(ac);
		List<Account> list  = new ArrayList<>();
		list.add(account);
		list.add(account_second);
		//list.add(ac2);
		customer.setAccounts(list);
		repository.save(customer);
		//list.add(ac2);
		//a.setAccounts(list);
		//repository.save(new Customer("Bob", "Smith"));
		CustomerNAccount cna = new CustomerNAccount();
		cna.setAccount(account);
		cna.setCustomer(customer);
		
		
		relationrepo.save(cna);
		
		CustomerNAccount cna2 = new CustomerNAccount();
		cna2.setAccount(account_second);
		cna2.setCustomer(customer);
		
		
		relationrepo.save(cna2);*/
		
		/*List<ObjectId> a = new ArrayList();
		a.add(new ObjectId("5678f6a5d4c68d534a6027e4"));
		a.add(new ObjectId("5678f6aed4c622b835cdc3e3"));
		*/
		Customer customer = repository.findOne("567b901ed4c647325a96cc17");
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (CustomerNAccount list : relationrepo.findDistinctAccountByCustomer(customer) ) {
			System.out.println(list);
		}
		System.out.println();
		
		
		
	/*	Customer cna = Alias.alias(Customer.class);
		
		List<Customer> list = (List<Customer>) repository.findAll(Alias.$(cna.getFirstName()).eq("Alice"));
		
		*/
		/*Customer c = Alias.alias(Customer.class);
		CustomerNAccount cna = Alias.alias(CustomerNAccount.class);

		List<Customer> list = (List<Customer>) repository.findAll(Alias.$(c.getFirstName()).eq("Alice"));
		List<String> list_ = Lists.transform(list, new Function<Customer, String>() {

			@Override
			public String apply(Customer input) {
				return input.getId();
			}

		});
		System.out.println(list_.toString());
		
		//List<CustomerNAccount> list2 = (List<CustomerNAccount>) relationrepo.findAll(Alias.$(cna.getCustomer().any()).in(list_));
		List<CustomerNAccount> list2 = relationrepo.findByCustomerFirstName("Alice");
		//List<CustomerNAccount> list2 = mongoTemplate.find(Query.query(Criteria.where("customer.$ref.customer.firstName").is("Alice")), CustomerNAccount.class);
		System.out.println(list2.toString());
		BooleanExpression predicate = Alias.$(cna.getFirstName())
				.eq(name);
		
		this.from(Alias.$(cna)).where(predicate).list(Alias.$(cna));
		
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (CustomerNAccount cc : list2 ) {
			System.out.println(cc);
		}
		System.out.println();*/
		
		/*Account account_second = new Account();
		account_second.setTotal(100);
		account_second.setId(ObjectId.get());
		accountrepo.save(account_second);
		
		Customer customer_second  = new Customer("Alice2", "Smith");
		repository.save(customer_second);
		
		
		CustomerNAccount cna2 = new CustomerNAccount();
		cna.setAccount(account_second);
		cna.setCustomer(customer_second);
		
		
		relationrepo.save(cna2);
		
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (CustomerNAccount list : relationrepo.findAll()) {
			System.out.println(list);
		}
		System.out.println();*/
		// fetch all customers
		/*System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();*/

		// fetch an individual customer
		/*List<Account> list = accountrepo.findByTotal(100);
		
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(accountrepo.findByTotal(100));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer_ : repository.findByLastName("Smith")) {
			System.out.println(customer_);
		}*/

	}

}