package taxi.service.impl;

import java.util.Objects;
import java.util.Optional;
import taxi.exception.AuthentificationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;
import taxi.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthentificationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent()
                && Objects.equals(driver.get().getPassword(), password)) {
            return driver.get();
        }
        throw new AuthentificationException("Login or password was incorrect");
    }
}
