/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.cache.ehcache.internal.configurator;

import com.liferay.portal.kernel.util.Props;

import java.util.Properties;

import net.sf.ehcache.config.FactoryConfiguration;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Dante Wang
 */
@Component(
	immediate = true,
	service = SingleVMEhcachePortalCacheManagerConfigurator.class
)
public class SingleVMEhcachePortalCacheManagerConfigurator
	extends AbstractEhcachePortalCacheManagerConfigurator {

	@Override
	protected boolean isClearCacheManagerPeerConfigurations() {
		return true;
	}

	@Override
	protected Properties parseBootstrapCacheLoaderConfigurations(
		FactoryConfiguration<?> factoryConfiguration) {

		return null;
	}

	@Reference(unbind = "-")
	protected void setProps(Props props) {
		this.props = props;
	}

}