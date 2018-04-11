package com.my.file;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	HomeDao homeDao;
	
	protected Log log = LogFactory.getLog(HomeController.class);

	@RequestMapping(value = "/")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		
		List<HomeDto> list = homeDao.jobsearch();
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getJob_name());
        }
		return mv;
	}
	
}
