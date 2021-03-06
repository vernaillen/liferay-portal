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

package com.liferay.dynamic.data.mapping.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.configuration.admin.ConfigurationAdmin;

/**
 * @author Lino Alves
 */
@ConfigurationAdmin(category = "productivity")
@Meta.OCD(
	id = "com.liferay.dynamic.data.mapping.configuration.DDMServiceConfiguration",
	localization = "content/Language", name = "%ddm.service.configuration.name"
)
public interface DDMServiceConfiguration {

	/**
	 * Returns <code>true</code> if dynamic data mapping structure keys should
	 * always be autogenerated.
	 *
	 * @return <code>true</code> if dynamic data mapping structure keys should
	 *         always be autogenerated; <code>false</code> otherwise
	 */
	@Meta.AD(deflt = "true", required = false)
	public boolean autogenerateStructureKey();

	/**
	 * Returns <code>true</code> if dynamic data mapping template keys should
	 * always be autogenerated.
	 *
	 * @return <code>true</code> if dynamic data mapping template keys should
	 *         always be autogenerated; <code>false</code> otherwise
	 */
	@Meta.AD(deflt = "true", required = false)
	public boolean autogenerateTemplateKey();

	/**
	 * Returns the code (e.g., <code>ftl</code>, <code>vm</code>, or
	 * <code>xls</code>) of the default template language.
	 *
	 * @return the code (e.g., <code>ftl</code>, <code>vm</code>, or
	 *         <code>xls</code>) of the default template language
	 */
	@Meta.AD(
		deflt = "ftl",
		optionLabels = {
			"FreeMarker", "Velocity", "Extensible Stylesheet Language"
		},
		optionValues = {"ftl", "vm", "xls"}, required = false
	)
	public String defaultTemplateLanguage();

}