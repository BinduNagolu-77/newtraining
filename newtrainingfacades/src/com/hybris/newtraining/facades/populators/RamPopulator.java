/**
 *
 */
package com.hybris.newtraining.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.commons.lang3.StringUtils;


/**
 * @author bnagolu
 *
 */
public class RamPopulator implements Populator<SearchResultValueData, ProductData>
{

	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{
		// XXX Auto-generated method stub

		final String ram = (String) source.getValues().get("ramSize");
		if (StringUtils.isNoneEmpty(ram))
		{
			target.setRamSize(ram);
		}

	}


}
