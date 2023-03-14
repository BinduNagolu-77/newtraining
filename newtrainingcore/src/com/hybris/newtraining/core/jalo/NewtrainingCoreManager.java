/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.newtraining.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.newtraining.core.constants.NewtrainingCoreConstants;
import com.hybris.newtraining.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class NewtrainingCoreManager extends GeneratedNewtrainingCoreManager
{
	public static final NewtrainingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (NewtrainingCoreManager) em.getExtension(NewtrainingCoreConstants.EXTENSIONNAME);
	}
}
