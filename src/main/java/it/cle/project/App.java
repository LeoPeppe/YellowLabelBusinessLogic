package it.cle.project;

import it.cle.project.config.AppConfig;
import it.cle.project.dto.ReportPrestazioniResponseDTO;
import it.cle.project.model.User;
import it.cle.project.service.UserService;

import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The Class App.
 */
public class App 
{
	
	/** The indice adl service. */
	@Inject
//	static IndiceADLService indiceADLService;
	 
	static UserService userService;
	
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main( String[] args )
    {
//    	ApplicationContext ctx = new AnnotationConfigApplicationContext( AppConfig.class );
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	//System.out.println(ctx.getEnvironment().getActiveProfiles().toString());
//    	 	ctx.getEnvironment().setActiveProfiles("dev");
//    	System.out.println(calcolateADL(ctx));
//		selectPrestazioni(ctx);
    	
//    	insertDatiAssistito(ctx);
    	
//    		selectPrestazione(ctx);
    		
//    		insertPaiPrestazioni(ctx);
    		
//    		insertPai(ctx);
    		
//    		insertRisultatiIndici(ctx);
    	
//    	selectInterventi(ctx);
    	
    	
//    	testUser(ctx);
    	
//    	selectAllUsers(ctx);
    	selectByEmail(ctx,"convertinileo@gmail.com");
    	
//    	count(ctx);
    	
//    	inserisciUtente(ctx);
 		
//		((AbstractApplicationContext)ctx).close();
//    	TestFattura(ctx);
    }
    
    private static void count(AnnotationConfigApplicationContext ctx) {
    	UserService userService= (UserService) ctx.getBean("userService");
    	
    	int number_user = userService.count();
		System.out.println("number "+number_user);
	}

	private static void inserisciUtente(AnnotationConfigApplicationContext ctx) {
    	 User usr= new User();
		 usr.setFirstName("pino lavatrice2222");
		 usr.setLastName("levi 22");
		 
			UserService userService= (UserService) ctx.getBean("userService");
			
			userService.insert(usr);
	}

	private static void selectAllUsers(AnnotationConfigApplicationContext ctx) {
    	UserService userService= (UserService) ctx.getBean("userService");
    	List<User> userList=  userService.selectAllUsers();
    	
    	for (int i = 0; i < userList.size(); i++) {
			System.out.println("NOMI "+userList.get(i).getFirstName());
		}
    	
	}

	private static void testUser(AnnotationConfigApplicationContext ctx) {
		UserService userService= (UserService) ctx.getBean("userService");
		
		
		User user=  userService.selectById((long) 1);
		System.out.println("User name "+ user.getFirstName());
	}

    
    private static User selectByEmail(AnnotationConfigApplicationContext ctx,String email){
    	UserService userService= (UserService) ctx.getBean("userService");
    	
    	
    	User user=userService.selectByEmail(email);
    	
    	System.out.println("firstName : "+user.getFirstName()+
    						" middleName : "+user.getMiddleName()+
    						" lastName : "+user.getLastName()+
    						" gender : "+user.getGender()+
    						" dob : "+user.getDob()+
    						" email : "+user.getEmail()+
    						" password : "+user.getPassword());
    	return user;
    	
    	
    }
    
    
    
    
}