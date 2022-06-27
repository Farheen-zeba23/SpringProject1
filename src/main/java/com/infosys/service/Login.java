package com.infosys.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Login {
	public String LoggedIn() {
		Log log=LogFactory.getLog(this.getClass());
		//u will be habbing lots of functilites
		log.info("Login info");
		log.error("Login error");
		log.warn("Login warnning ");
		return "User Logged In";
	}
	

}
