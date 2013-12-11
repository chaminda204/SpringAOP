/**
 * 
 */
package com.chaminda.aop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chaminda
 *   <p/>
 *       date 11/12/2013
 */
public class AOPTest {

	private static SpringService springService ;
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "spring-beans.xml" });
		springService = appContext.getBean(SpringService.class);

		System.out.println("**********************************");
		springService.saveOrUpdateObject();
		System.out.println("**********************************");
		springService.getObject();
		System.out.println("**********************************");
		springService.deleteObject();
		System.out.println("**********************************");
	}

}
