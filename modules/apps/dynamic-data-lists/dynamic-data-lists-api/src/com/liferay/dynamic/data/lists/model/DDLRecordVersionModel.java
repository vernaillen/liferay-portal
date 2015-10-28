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

package com.liferay.dynamic.data.lists.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ShardedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DDLRecordVersion service. Represents a row in the &quot;DDLRecordVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDLRecordVersion
 * @see com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionImpl
 * @see com.liferay.dynamic.data.lists.model.impl.DDLRecordVersionModelImpl
 * @generated
 */
@ProviderType
public interface DDLRecordVersionModel extends BaseModel<DDLRecordVersion>,
	ShardedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a d d l record version model instance should use the {@link DDLRecordVersion} interface instead.
	 */

	/**
	 * Returns the primary key of this d d l record version.
	 *
	 * @return the primary key of this d d l record version
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this d d l record version.
	 *
	 * @param primaryKey the primary key of this d d l record version
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the record version ID of this d d l record version.
	 *
	 * @return the record version ID of this d d l record version
	 */
	public long getRecordVersionId();

	/**
	 * Sets the record version ID of this d d l record version.
	 *
	 * @param recordVersionId the record version ID of this d d l record version
	 */
	public void setRecordVersionId(long recordVersionId);

	/**
	 * Returns the group ID of this d d l record version.
	 *
	 * @return the group ID of this d d l record version
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this d d l record version.
	 *
	 * @param groupId the group ID of this d d l record version
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this d d l record version.
	 *
	 * @return the company ID of this d d l record version
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this d d l record version.
	 *
	 * @param companyId the company ID of this d d l record version
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this d d l record version.
	 *
	 * @return the user ID of this d d l record version
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this d d l record version.
	 *
	 * @param userId the user ID of this d d l record version
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this d d l record version.
	 *
	 * @return the user uuid of this d d l record version
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this d d l record version.
	 *
	 * @param userUuid the user uuid of this d d l record version
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this d d l record version.
	 *
	 * @return the user name of this d d l record version
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this d d l record version.
	 *
	 * @param userName the user name of this d d l record version
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this d d l record version.
	 *
	 * @return the create date of this d d l record version
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this d d l record version.
	 *
	 * @param createDate the create date of this d d l record version
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the d d m storage ID of this d d l record version.
	 *
	 * @return the d d m storage ID of this d d l record version
	 */
	public long getDDMStorageId();

	/**
	 * Sets the d d m storage ID of this d d l record version.
	 *
	 * @param DDMStorageId the d d m storage ID of this d d l record version
	 */
	public void setDDMStorageId(long DDMStorageId);

	/**
	 * Returns the record set ID of this d d l record version.
	 *
	 * @return the record set ID of this d d l record version
	 */
	public long getRecordSetId();

	/**
	 * Sets the record set ID of this d d l record version.
	 *
	 * @param recordSetId the record set ID of this d d l record version
	 */
	public void setRecordSetId(long recordSetId);

	/**
	 * Returns the record ID of this d d l record version.
	 *
	 * @return the record ID of this d d l record version
	 */
	public long getRecordId();

	/**
	 * Sets the record ID of this d d l record version.
	 *
	 * @param recordId the record ID of this d d l record version
	 */
	public void setRecordId(long recordId);

	/**
	 * Returns the version of this d d l record version.
	 *
	 * @return the version of this d d l record version
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this d d l record version.
	 *
	 * @param version the version of this d d l record version
	 */
	public void setVersion(String version);

	/**
	 * Returns the display index of this d d l record version.
	 *
	 * @return the display index of this d d l record version
	 */
	public int getDisplayIndex();

	/**
	 * Sets the display index of this d d l record version.
	 *
	 * @param displayIndex the display index of this d d l record version
	 */
	public void setDisplayIndex(int displayIndex);

	/**
	 * Returns the status of this d d l record version.
	 *
	 * @return the status of this d d l record version
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this d d l record version.
	 *
	 * @param status the status of this d d l record version
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this d d l record version.
	 *
	 * @return the status by user ID of this d d l record version
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this d d l record version.
	 *
	 * @param statusByUserId the status by user ID of this d d l record version
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this d d l record version.
	 *
	 * @return the status by user uuid of this d d l record version
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this d d l record version.
	 *
	 * @param statusByUserUuid the status by user uuid of this d d l record version
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this d d l record version.
	 *
	 * @return the status by user name of this d d l record version
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this d d l record version.
	 *
	 * @param statusByUserName the status by user name of this d d l record version
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this d d l record version.
	 *
	 * @return the status date of this d d l record version
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this d d l record version.
	 *
	 * @param statusDate the status date of this d d l record version
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Deprecated
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this d d l record version is approved.
	 *
	 * @return <code>true</code> if this d d l record version is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this d d l record version is denied.
	 *
	 * @return <code>true</code> if this d d l record version is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this d d l record version is a draft.
	 *
	 * @return <code>true</code> if this d d l record version is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this d d l record version is expired.
	 *
	 * @return <code>true</code> if this d d l record version is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this d d l record version is inactive.
	 *
	 * @return <code>true</code> if this d d l record version is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this d d l record version is incomplete.
	 *
	 * @return <code>true</code> if this d d l record version is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this d d l record version is pending.
	 *
	 * @return <code>true</code> if this d d l record version is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this d d l record version is scheduled.
	 *
	 * @return <code>true</code> if this d d l record version is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.dynamic.data.lists.model.DDLRecordVersion ddlRecordVersion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.dynamic.data.lists.model.DDLRecordVersion> toCacheModel();

	@Override
	public com.liferay.dynamic.data.lists.model.DDLRecordVersion toEscapedModel();

	@Override
	public com.liferay.dynamic.data.lists.model.DDLRecordVersion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}