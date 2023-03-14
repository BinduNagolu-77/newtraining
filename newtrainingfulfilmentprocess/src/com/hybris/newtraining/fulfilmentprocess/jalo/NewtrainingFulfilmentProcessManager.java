/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.newtraining.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hybris.newtraining.fulfilmentprocess.constants.NewtrainingFulfilmentProcessConstants;

public class NewtrainingFulfilmentProcessManager extends GeneratedNewtrainingFulfilmentProcessManager
{
	public static final NewtrainingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (NewtrainingFulfilmentProcessManager) em.getExtension(NewtrainingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
