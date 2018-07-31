package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.controllers.Options;
import com.example.demo.model.User;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/data")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value="/save/User", method = RequestMethod.POST)
	public void saveUser(@RequestBody UserModel userm) {
		User user = new User();
		user.setUserName(userm.getUsername());
		Options opt = new Options();
		opt.setOption_1(userm.isOption_1());
		opt.setOption_2(userm.isOption_2());
		opt.setOption_3(userm.isOption_3());
		opt.setOption_4(userm.isOption_4());
		System.out.println("Option1:");
		user.setOption(opt.getAllOption());
		System.out.println(opt.getAllOption());
		userService.saveData(user);
		System.out.println("data saved");
	}
	

	@RequestMapping(value = "/retrieve/User/{id}", method = RequestMethod.GET)
	public void retrieveUser(@PathVariable Long id) {
		Optional<User> user = userService.getById(id);
		if (user.isPresent()) {
			User usr = user.get();
			System.out.println("Username:" + usr.getUserName());
			System.out.println("Id:" + usr.getId());
			byte op = usr.getOption();
			Options opt = new Options();
			opt.setAllOption(op);
			System.out.println("Option1:" + opt.isOption_1());
			System.out.println("Option2:" + opt.isOption_2());
			System.out.println("Option3:" + opt.isOption_3());
			System.out.println("Option4:" + opt.isOption_4());
		} else {
			System.out.println("not valid");
		}

	}
}
