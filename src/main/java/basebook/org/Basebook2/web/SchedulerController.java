package basebook.org.Basebook2.web;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SchedulerController {

	@Autowired
	private SessionFactory sessionFactory;

//	@RequestMapping(value="/addScheduler.htm", method=RequestMethod.POST)
//	public ModelAndView addScheduler(Scheduler t, Errors errors)
//	{
//		if (errors.hasErrors())
//		{
//			ModelAndView mav = new ModelAndView("addScheduler");
//			mav.addObject("errors", errors);
//			return mav;
//		}
//		
//		sessionFactory.getCurrentSession().save(t);	
//		return new ModelAndView("redirect:/allScheduler.htm");
//	}
//
//	@RequestMapping(value="/addScheduler.htm")
//	public String addPerson()
//	{
//		return "addScheduler";
//	}
//
//	
//	
//	@RequestMapping("/allScheduler.htm")
//	public ModelAndView allPersons()
//	{
//		List<Turn> persons = sessionFactory.getCurrentSession().
//			createQuery("FROM Scheduler").list();
//		
//		ModelAndView mav = new ModelAndView("allScheduler");
//		mav.addObject("persons", persons);
//		return mav;
//	}
	
}
