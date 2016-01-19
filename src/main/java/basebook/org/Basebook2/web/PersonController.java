package basebook.org.Basebook2.web;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import basebook.org.Basebook2.model.Turn;
import basebook.org.Basebook2.model.User;

@Controller
public class PersonController {

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping(value="/addPerson.htm", method=RequestMethod.POST)
	public ModelAndView addPerson(User p, Errors errors)
	{
		
		
		Set<User> persons = new HashSet<User>();
		persons.add(p);
		Turn turn = new Turn(new Date(),persons);
		
		if (errors.hasErrors())
		{
			ModelAndView mav = new ModelAndView("addPerson");
			mav.addObject("errors", errors);
			return mav;
		}
		
		sessionFactory.getCurrentSession().save(turn);	
		return new ModelAndView("redirect:/allPersons.htm");
	}

	@RequestMapping(value="/addPerson.htm")
	public String addPerson()
	{
		return "addPerson";
	}

	
	
	@RequestMapping("/allPersons.htm")
	public ModelAndView allPersons()
	{
		List<User> persons = sessionFactory.getCurrentSession().
			createQuery("FROM User").list();
		
		ModelAndView mav = new ModelAndView("allPersons");
		mav.addObject("persons", persons);
		return mav;
	}
	
}
