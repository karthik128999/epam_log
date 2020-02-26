package com.house;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class interest {
	private static final Logger LOGGER=LogManager.getLogger(interest.class);
public static double simple(double pr,double t,double rate)
{
	LOGGER.info("simple interest");
	return (pr * t * rate)/100;
}
}
