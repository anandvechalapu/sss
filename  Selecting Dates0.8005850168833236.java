·       User should be able to select the dates from the calendar.
·       User should be able to enter the date manually.
·       User should be able to select the month from the dropdown menu.
·       Calendar should close once date and year is selected.


Controller Class:

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DateController {

    @RequestMapping(value="/selectDates", method=RequestMethod.GET)
    public String selectDates(Model model){
        model.addAttribute("fromDate", new Date());
        model.addAttribute("toDate", new Date());
        return "selectDates";
    }
    
    @RequestMapping(value="/selectDates", method=RequestMethod.POST)
    public String selectDates(Date fromDate, Date toDate, Model model){
        model.addAttribute("fromDate", fromDate);
        model.addAttribute("toDate", toDate);
        return "selectDates";
    }
}

Service Class:

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateService {
    
    public void selectDates(Date fromDate, Date toDate){
        // Logic to select the dates
    }
}

Repository Class:

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class DateRepository {
    
    public void saveDates(Date fromDate, Date toDate){
        // Logic to save the dates
    }
}