·       Logout from the application after clicking the Logout button.
·       User redirected to the login screen after Logout.
 

Controller Class:

@Controller
public class LogoutController {

    @Autowired
    private LogoutService logoutService;

    @GetMapping("/logout")
    public String logout(){
        logoutService.logoutUser();
        return "redirect:/login";
    }
}

Service Class:

@Service
public class LogoutService {

    @Autowired
    private LogoutRepository logoutRepository;

    public void logoutUser(){
        logoutRepository.logout();
    }
}

Repository Class:

@Repository
public class LogoutRepository {

    public void logout(){
        //Code to logout user
    }
}