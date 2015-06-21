package basebook.org.Basebook2.web;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {

//	@Autowired
//	private UserDetailsManager userDetailsManager;
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
	@Autowired
	private SessionFactory sessionFactory;
	
//	@Autowired
//	private SaltSource saltSource;


	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}

	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}

	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String createUser(String username, 
				String password) {
		
//		if (!userDetailsManager.userExists(username)) {
//		
//			List<GrantedAuthority> authorites = new ArrayList<GrantedAuthority>();
//			authorites.add(new GrantedAuthorityImpl("ROLE_USER"));
//			
//			
//			User user = new User(username, password, true, false, false, false, authorites);
//			User saltedUser = new User(username, passwordEncoder.encodePassword(password, saltSource.getSalt(user)), 
//					true, false, false, false, authorites);
//			
//			userDetailsManager.createUser(saltedUser);
//			
//		}
		return "login";
	}

	
}
