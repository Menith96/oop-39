package project_c.repo;
import project_c.security.RepoSecurity;
import project_b.service.CustomerService;
import project_e.componant.CostomerComponant;
import project_f.config.AppConfig;

public class CustomerRepo {
    RepoSecurity repoSecurity =new RepoSecurity();
    CustomerService customerService =new CustomerService();
    CostomerComponant costomerComponant = new CostomerComponant();
    AppConfig apiConfig =new AppConfig();
}
