Topics Learned
---------
@SpringBootApplication
	1)@SpringBootConfiguration --> @Configuration
	2)@ComponentScan
	3)@EnableAutoConfiguration
@Component
@Autowired
implements CommandLineRunner
SpringApplication.run(Configurationclass, arguments)
	SpringApplication class given by SpringBoot to run the application as a Spring application
	1) Create the ApplicationContext object
	2) Register CommandLinePropertySource bean (to read command line arguments)
	3) Load sigleton bean to ApplicationContext
	4) Trigger CommandLineRunner bean run method
	