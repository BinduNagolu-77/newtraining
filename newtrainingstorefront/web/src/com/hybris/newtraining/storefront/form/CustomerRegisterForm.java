/**
 *
 */
package com.hybris.newtraining.storefront.form;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;


/**
 * @author bnagolu
 *
 */
public class CustomerRegisterForm extends RegisterForm
{
	private String phoneNumber;

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *           the phoneNumber to set
	 */
	public void setPhoneNumber(final String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}


}
