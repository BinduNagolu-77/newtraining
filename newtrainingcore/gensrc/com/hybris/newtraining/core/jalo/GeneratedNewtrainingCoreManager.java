/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 09-Mar-2023, 3:34:23 PM                     ---
 * ----------------------------------------------------------------
 */
package com.hybris.newtraining.core.jalo;

import com.hybris.newtraining.core.constants.NewtrainingCoreConstants;
import com.hybris.newtraining.core.jalo.ApparelProduct;
import com.hybris.newtraining.core.jalo.ApparelSizeVariantProduct;
import com.hybris.newtraining.core.jalo.ApparelStyleVariantProduct;
import com.hybris.newtraining.core.jalo.CustomCMSComponent;
import com.hybris.newtraining.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>NewtrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNewtrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("phone", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("weightData", AttributeMode.INITIAL);
		tmp.put("resolutionType", AttributeMode.INITIAL);
		tmp.put("ramSize", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NewtrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NewtrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NewtrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomCMSComponent createCustomCMSComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NewtrainingCoreConstants.TC.CUSTOMCMSCOMPONENT );
			return (CustomCMSComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomCMSComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CustomCMSComponent createCustomCMSComponent(final Map attributeValues)
	{
		return createCustomCMSComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NewtrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return NewtrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phone</code> attribute.
	 * @return the phone - Mobile Number for customer.
	 */
	public String getPhone(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, NewtrainingCoreConstants.Attributes.Customer.PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phone</code> attribute.
	 * @return the phone - Mobile Number for customer.
	 */
	public String getPhone(final Customer item)
	{
		return getPhone( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phone</code> attribute. 
	 * @param value the phone - Mobile Number for customer.
	 */
	public void setPhone(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, NewtrainingCoreConstants.Attributes.Customer.PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phone</code> attribute. 
	 * @param value the phone - Mobile Number for customer.
	 */
	public void setPhone(final Customer item, final String value)
	{
		setPhone( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.ramSize</code> attribute.
	 * @return the ramSize - Ram of the product.
	 */
	public String getRamSize(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, NewtrainingCoreConstants.Attributes.Product.RAMSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.ramSize</code> attribute.
	 * @return the ramSize - Ram of the product.
	 */
	public String getRamSize(final Product item)
	{
		return getRamSize( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.ramSize</code> attribute. 
	 * @param value the ramSize - Ram of the product.
	 */
	public void setRamSize(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, NewtrainingCoreConstants.Attributes.Product.RAMSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.ramSize</code> attribute. 
	 * @param value the ramSize - Ram of the product.
	 */
	public void setRamSize(final Product item, final String value)
	{
		setRamSize( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.resolutionType</code> attribute.
	 * @return the resolutionType - resolution field added to product table
	 */
	public EnumerationValue getResolutionType(final SessionContext ctx, final Product item)
	{
		return (EnumerationValue)item.getProperty( ctx, NewtrainingCoreConstants.Attributes.Product.RESOLUTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.resolutionType</code> attribute.
	 * @return the resolutionType - resolution field added to product table
	 */
	public EnumerationValue getResolutionType(final Product item)
	{
		return getResolutionType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.resolutionType</code> attribute. 
	 * @param value the resolutionType - resolution field added to product table
	 */
	public void setResolutionType(final SessionContext ctx, final Product item, final EnumerationValue value)
	{
		item.setProperty(ctx, NewtrainingCoreConstants.Attributes.Product.RESOLUTIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.resolutionType</code> attribute. 
	 * @param value the resolutionType - resolution field added to product table
	 */
	public void setResolutionType(final Product item, final EnumerationValue value)
	{
		setResolutionType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weightData</code> attribute.
	 * @return the weightData - Weight of the product.
	 */
	public String getWeightData(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, NewtrainingCoreConstants.Attributes.Product.WEIGHTDATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weightData</code> attribute.
	 * @return the weightData - Weight of the product.
	 */
	public String getWeightData(final Product item)
	{
		return getWeightData( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weightData</code> attribute. 
	 * @param value the weightData - Weight of the product.
	 */
	public void setWeightData(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, NewtrainingCoreConstants.Attributes.Product.WEIGHTDATA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weightData</code> attribute. 
	 * @param value the weightData - Weight of the product.
	 */
	public void setWeightData(final Product item, final String value)
	{
		setWeightData( getSession().getSessionContext(), item, value );
	}
	
}
