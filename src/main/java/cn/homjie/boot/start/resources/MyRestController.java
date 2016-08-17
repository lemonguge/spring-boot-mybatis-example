package cn.homjie.boot.start.resources;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.homjie.boot.start.model.Customer;
import cn.homjie.boot.start.model.User;

@RestController
@RequestMapping(value = "/users")
public class MyRestController {

	@RequestMapping(value = "/{user}", method = RequestMethod.GET)
	public User getUser(@PathVariable Long user) {
		// ...
		return null;
	}

	@RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
	List<Customer> getUserCustomers(@PathVariable Long user) {
		// ...
		return null;
	}

	@RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
	public User deleteUser(@PathVariable Long user) {
		// ...
		return null;
	}

}