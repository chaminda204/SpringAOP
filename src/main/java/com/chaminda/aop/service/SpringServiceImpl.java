/**
 * 
 */
package com.chaminda.aop.service;


/**
 * @author chaminda
 *   <p/>
 *       date 11/12/2013
 */

public class SpringServiceImpl implements SpringService {

	@Override
	public void saveOrUpdateObject() {
		System.out.println("*** SpringServiceImpl : saveOrUpdateObject() ***");
		
	}

	@Override
	public Object getObject() {
		System.out.println("*** SpringServiceImpl : getObject() ***");
		return new Object();
	}

	@Override
	public void deleteObject() {
		System.out.println("Invoking deleteObject SpringServiceImpl");
		
	}



}
