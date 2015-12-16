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

package com.liferay.portal.workflow.kaleo.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.ClassNamePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoDefinition;
import com.liferay.portal.workflow.kaleo.service.KaleoDefinitionService;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoActionPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoConditionPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoDefinitionPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoInstancePersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoInstanceTokenPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoLogPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoNodePersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoNotificationPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoNotificationRecipientPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskAssignmentInstancePersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskAssignmentPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskInstanceTokenFinder;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskInstanceTokenPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTaskPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTimerInstanceTokenPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTimerPersistence;
import com.liferay.portal.workflow.kaleo.service.persistence.KaleoTransitionPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the kaleo definition remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoDefinitionServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portal.workflow.kaleo.service.impl.KaleoDefinitionServiceImpl
 * @see com.liferay.portal.workflow.kaleo.service.KaleoDefinitionServiceUtil
 * @generated
 */
public abstract class KaleoDefinitionServiceBaseImpl extends BaseServiceImpl
	implements KaleoDefinitionService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.portal.workflow.kaleo.service.KaleoDefinitionServiceUtil} to access the kaleo definition remote service.
	 */

	/**
	 * Returns the kaleo action local service.
	 *
	 * @return the kaleo action local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoActionLocalService getKaleoActionLocalService() {
		return kaleoActionLocalService;
	}

	/**
	 * Sets the kaleo action local service.
	 *
	 * @param kaleoActionLocalService the kaleo action local service
	 */
	public void setKaleoActionLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoActionLocalService kaleoActionLocalService) {
		this.kaleoActionLocalService = kaleoActionLocalService;
	}

	/**
	 * Returns the kaleo action persistence.
	 *
	 * @return the kaleo action persistence
	 */
	public KaleoActionPersistence getKaleoActionPersistence() {
		return kaleoActionPersistence;
	}

	/**
	 * Sets the kaleo action persistence.
	 *
	 * @param kaleoActionPersistence the kaleo action persistence
	 */
	public void setKaleoActionPersistence(
		KaleoActionPersistence kaleoActionPersistence) {
		this.kaleoActionPersistence = kaleoActionPersistence;
	}

	/**
	 * Returns the kaleo condition local service.
	 *
	 * @return the kaleo condition local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoConditionLocalService getKaleoConditionLocalService() {
		return kaleoConditionLocalService;
	}

	/**
	 * Sets the kaleo condition local service.
	 *
	 * @param kaleoConditionLocalService the kaleo condition local service
	 */
	public void setKaleoConditionLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoConditionLocalService kaleoConditionLocalService) {
		this.kaleoConditionLocalService = kaleoConditionLocalService;
	}

	/**
	 * Returns the kaleo condition persistence.
	 *
	 * @return the kaleo condition persistence
	 */
	public KaleoConditionPersistence getKaleoConditionPersistence() {
		return kaleoConditionPersistence;
	}

	/**
	 * Sets the kaleo condition persistence.
	 *
	 * @param kaleoConditionPersistence the kaleo condition persistence
	 */
	public void setKaleoConditionPersistence(
		KaleoConditionPersistence kaleoConditionPersistence) {
		this.kaleoConditionPersistence = kaleoConditionPersistence;
	}

	/**
	 * Returns the kaleo definition local service.
	 *
	 * @return the kaleo definition local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoDefinitionLocalService getKaleoDefinitionLocalService() {
		return kaleoDefinitionLocalService;
	}

	/**
	 * Sets the kaleo definition local service.
	 *
	 * @param kaleoDefinitionLocalService the kaleo definition local service
	 */
	public void setKaleoDefinitionLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoDefinitionLocalService kaleoDefinitionLocalService) {
		this.kaleoDefinitionLocalService = kaleoDefinitionLocalService;
	}

	/**
	 * Returns the kaleo definition remote service.
	 *
	 * @return the kaleo definition remote service
	 */
	public KaleoDefinitionService getKaleoDefinitionService() {
		return kaleoDefinitionService;
	}

	/**
	 * Sets the kaleo definition remote service.
	 *
	 * @param kaleoDefinitionService the kaleo definition remote service
	 */
	public void setKaleoDefinitionService(
		KaleoDefinitionService kaleoDefinitionService) {
		this.kaleoDefinitionService = kaleoDefinitionService;
	}

	/**
	 * Returns the kaleo definition persistence.
	 *
	 * @return the kaleo definition persistence
	 */
	public KaleoDefinitionPersistence getKaleoDefinitionPersistence() {
		return kaleoDefinitionPersistence;
	}

	/**
	 * Sets the kaleo definition persistence.
	 *
	 * @param kaleoDefinitionPersistence the kaleo definition persistence
	 */
	public void setKaleoDefinitionPersistence(
		KaleoDefinitionPersistence kaleoDefinitionPersistence) {
		this.kaleoDefinitionPersistence = kaleoDefinitionPersistence;
	}

	/**
	 * Returns the kaleo instance local service.
	 *
	 * @return the kaleo instance local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoInstanceLocalService getKaleoInstanceLocalService() {
		return kaleoInstanceLocalService;
	}

	/**
	 * Sets the kaleo instance local service.
	 *
	 * @param kaleoInstanceLocalService the kaleo instance local service
	 */
	public void setKaleoInstanceLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoInstanceLocalService kaleoInstanceLocalService) {
		this.kaleoInstanceLocalService = kaleoInstanceLocalService;
	}

	/**
	 * Returns the kaleo instance persistence.
	 *
	 * @return the kaleo instance persistence
	 */
	public KaleoInstancePersistence getKaleoInstancePersistence() {
		return kaleoInstancePersistence;
	}

	/**
	 * Sets the kaleo instance persistence.
	 *
	 * @param kaleoInstancePersistence the kaleo instance persistence
	 */
	public void setKaleoInstancePersistence(
		KaleoInstancePersistence kaleoInstancePersistence) {
		this.kaleoInstancePersistence = kaleoInstancePersistence;
	}

	/**
	 * Returns the kaleo instance token local service.
	 *
	 * @return the kaleo instance token local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoInstanceTokenLocalService getKaleoInstanceTokenLocalService() {
		return kaleoInstanceTokenLocalService;
	}

	/**
	 * Sets the kaleo instance token local service.
	 *
	 * @param kaleoInstanceTokenLocalService the kaleo instance token local service
	 */
	public void setKaleoInstanceTokenLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoInstanceTokenLocalService kaleoInstanceTokenLocalService) {
		this.kaleoInstanceTokenLocalService = kaleoInstanceTokenLocalService;
	}

	/**
	 * Returns the kaleo instance token persistence.
	 *
	 * @return the kaleo instance token persistence
	 */
	public KaleoInstanceTokenPersistence getKaleoInstanceTokenPersistence() {
		return kaleoInstanceTokenPersistence;
	}

	/**
	 * Sets the kaleo instance token persistence.
	 *
	 * @param kaleoInstanceTokenPersistence the kaleo instance token persistence
	 */
	public void setKaleoInstanceTokenPersistence(
		KaleoInstanceTokenPersistence kaleoInstanceTokenPersistence) {
		this.kaleoInstanceTokenPersistence = kaleoInstanceTokenPersistence;
	}

	/**
	 * Returns the kaleo log local service.
	 *
	 * @return the kaleo log local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoLogLocalService getKaleoLogLocalService() {
		return kaleoLogLocalService;
	}

	/**
	 * Sets the kaleo log local service.
	 *
	 * @param kaleoLogLocalService the kaleo log local service
	 */
	public void setKaleoLogLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoLogLocalService kaleoLogLocalService) {
		this.kaleoLogLocalService = kaleoLogLocalService;
	}

	/**
	 * Returns the kaleo log persistence.
	 *
	 * @return the kaleo log persistence
	 */
	public KaleoLogPersistence getKaleoLogPersistence() {
		return kaleoLogPersistence;
	}

	/**
	 * Sets the kaleo log persistence.
	 *
	 * @param kaleoLogPersistence the kaleo log persistence
	 */
	public void setKaleoLogPersistence(KaleoLogPersistence kaleoLogPersistence) {
		this.kaleoLogPersistence = kaleoLogPersistence;
	}

	/**
	 * Returns the kaleo node local service.
	 *
	 * @return the kaleo node local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoNodeLocalService getKaleoNodeLocalService() {
		return kaleoNodeLocalService;
	}

	/**
	 * Sets the kaleo node local service.
	 *
	 * @param kaleoNodeLocalService the kaleo node local service
	 */
	public void setKaleoNodeLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoNodeLocalService kaleoNodeLocalService) {
		this.kaleoNodeLocalService = kaleoNodeLocalService;
	}

	/**
	 * Returns the kaleo node persistence.
	 *
	 * @return the kaleo node persistence
	 */
	public KaleoNodePersistence getKaleoNodePersistence() {
		return kaleoNodePersistence;
	}

	/**
	 * Sets the kaleo node persistence.
	 *
	 * @param kaleoNodePersistence the kaleo node persistence
	 */
	public void setKaleoNodePersistence(
		KaleoNodePersistence kaleoNodePersistence) {
		this.kaleoNodePersistence = kaleoNodePersistence;
	}

	/**
	 * Returns the kaleo notification local service.
	 *
	 * @return the kaleo notification local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoNotificationLocalService getKaleoNotificationLocalService() {
		return kaleoNotificationLocalService;
	}

	/**
	 * Sets the kaleo notification local service.
	 *
	 * @param kaleoNotificationLocalService the kaleo notification local service
	 */
	public void setKaleoNotificationLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoNotificationLocalService kaleoNotificationLocalService) {
		this.kaleoNotificationLocalService = kaleoNotificationLocalService;
	}

	/**
	 * Returns the kaleo notification persistence.
	 *
	 * @return the kaleo notification persistence
	 */
	public KaleoNotificationPersistence getKaleoNotificationPersistence() {
		return kaleoNotificationPersistence;
	}

	/**
	 * Sets the kaleo notification persistence.
	 *
	 * @param kaleoNotificationPersistence the kaleo notification persistence
	 */
	public void setKaleoNotificationPersistence(
		KaleoNotificationPersistence kaleoNotificationPersistence) {
		this.kaleoNotificationPersistence = kaleoNotificationPersistence;
	}

	/**
	 * Returns the kaleo notification recipient local service.
	 *
	 * @return the kaleo notification recipient local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoNotificationRecipientLocalService getKaleoNotificationRecipientLocalService() {
		return kaleoNotificationRecipientLocalService;
	}

	/**
	 * Sets the kaleo notification recipient local service.
	 *
	 * @param kaleoNotificationRecipientLocalService the kaleo notification recipient local service
	 */
	public void setKaleoNotificationRecipientLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoNotificationRecipientLocalService kaleoNotificationRecipientLocalService) {
		this.kaleoNotificationRecipientLocalService = kaleoNotificationRecipientLocalService;
	}

	/**
	 * Returns the kaleo notification recipient persistence.
	 *
	 * @return the kaleo notification recipient persistence
	 */
	public KaleoNotificationRecipientPersistence getKaleoNotificationRecipientPersistence() {
		return kaleoNotificationRecipientPersistence;
	}

	/**
	 * Sets the kaleo notification recipient persistence.
	 *
	 * @param kaleoNotificationRecipientPersistence the kaleo notification recipient persistence
	 */
	public void setKaleoNotificationRecipientPersistence(
		KaleoNotificationRecipientPersistence kaleoNotificationRecipientPersistence) {
		this.kaleoNotificationRecipientPersistence = kaleoNotificationRecipientPersistence;
	}

	/**
	 * Returns the kaleo task local service.
	 *
	 * @return the kaleo task local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoTaskLocalService getKaleoTaskLocalService() {
		return kaleoTaskLocalService;
	}

	/**
	 * Sets the kaleo task local service.
	 *
	 * @param kaleoTaskLocalService the kaleo task local service
	 */
	public void setKaleoTaskLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoTaskLocalService kaleoTaskLocalService) {
		this.kaleoTaskLocalService = kaleoTaskLocalService;
	}

	/**
	 * Returns the kaleo task persistence.
	 *
	 * @return the kaleo task persistence
	 */
	public KaleoTaskPersistence getKaleoTaskPersistence() {
		return kaleoTaskPersistence;
	}

	/**
	 * Sets the kaleo task persistence.
	 *
	 * @param kaleoTaskPersistence the kaleo task persistence
	 */
	public void setKaleoTaskPersistence(
		KaleoTaskPersistence kaleoTaskPersistence) {
		this.kaleoTaskPersistence = kaleoTaskPersistence;
	}

	/**
	 * Returns the kaleo task assignment local service.
	 *
	 * @return the kaleo task assignment local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentLocalService getKaleoTaskAssignmentLocalService() {
		return kaleoTaskAssignmentLocalService;
	}

	/**
	 * Sets the kaleo task assignment local service.
	 *
	 * @param kaleoTaskAssignmentLocalService the kaleo task assignment local service
	 */
	public void setKaleoTaskAssignmentLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentLocalService kaleoTaskAssignmentLocalService) {
		this.kaleoTaskAssignmentLocalService = kaleoTaskAssignmentLocalService;
	}

	/**
	 * Returns the kaleo task assignment persistence.
	 *
	 * @return the kaleo task assignment persistence
	 */
	public KaleoTaskAssignmentPersistence getKaleoTaskAssignmentPersistence() {
		return kaleoTaskAssignmentPersistence;
	}

	/**
	 * Sets the kaleo task assignment persistence.
	 *
	 * @param kaleoTaskAssignmentPersistence the kaleo task assignment persistence
	 */
	public void setKaleoTaskAssignmentPersistence(
		KaleoTaskAssignmentPersistence kaleoTaskAssignmentPersistence) {
		this.kaleoTaskAssignmentPersistence = kaleoTaskAssignmentPersistence;
	}

	/**
	 * Returns the kaleo task assignment instance local service.
	 *
	 * @return the kaleo task assignment instance local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentInstanceLocalService getKaleoTaskAssignmentInstanceLocalService() {
		return kaleoTaskAssignmentInstanceLocalService;
	}

	/**
	 * Sets the kaleo task assignment instance local service.
	 *
	 * @param kaleoTaskAssignmentInstanceLocalService the kaleo task assignment instance local service
	 */
	public void setKaleoTaskAssignmentInstanceLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentInstanceLocalService kaleoTaskAssignmentInstanceLocalService) {
		this.kaleoTaskAssignmentInstanceLocalService = kaleoTaskAssignmentInstanceLocalService;
	}

	/**
	 * Returns the kaleo task assignment instance persistence.
	 *
	 * @return the kaleo task assignment instance persistence
	 */
	public KaleoTaskAssignmentInstancePersistence getKaleoTaskAssignmentInstancePersistence() {
		return kaleoTaskAssignmentInstancePersistence;
	}

	/**
	 * Sets the kaleo task assignment instance persistence.
	 *
	 * @param kaleoTaskAssignmentInstancePersistence the kaleo task assignment instance persistence
	 */
	public void setKaleoTaskAssignmentInstancePersistence(
		KaleoTaskAssignmentInstancePersistence kaleoTaskAssignmentInstancePersistence) {
		this.kaleoTaskAssignmentInstancePersistence = kaleoTaskAssignmentInstancePersistence;
	}

	/**
	 * Returns the kaleo task instance token local service.
	 *
	 * @return the kaleo task instance token local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalService getKaleoTaskInstanceTokenLocalService() {
		return kaleoTaskInstanceTokenLocalService;
	}

	/**
	 * Sets the kaleo task instance token local service.
	 *
	 * @param kaleoTaskInstanceTokenLocalService the kaleo task instance token local service
	 */
	public void setKaleoTaskInstanceTokenLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalService kaleoTaskInstanceTokenLocalService) {
		this.kaleoTaskInstanceTokenLocalService = kaleoTaskInstanceTokenLocalService;
	}

	/**
	 * Returns the kaleo task instance token persistence.
	 *
	 * @return the kaleo task instance token persistence
	 */
	public KaleoTaskInstanceTokenPersistence getKaleoTaskInstanceTokenPersistence() {
		return kaleoTaskInstanceTokenPersistence;
	}

	/**
	 * Sets the kaleo task instance token persistence.
	 *
	 * @param kaleoTaskInstanceTokenPersistence the kaleo task instance token persistence
	 */
	public void setKaleoTaskInstanceTokenPersistence(
		KaleoTaskInstanceTokenPersistence kaleoTaskInstanceTokenPersistence) {
		this.kaleoTaskInstanceTokenPersistence = kaleoTaskInstanceTokenPersistence;
	}

	/**
	 * Returns the kaleo task instance token finder.
	 *
	 * @return the kaleo task instance token finder
	 */
	public KaleoTaskInstanceTokenFinder getKaleoTaskInstanceTokenFinder() {
		return kaleoTaskInstanceTokenFinder;
	}

	/**
	 * Sets the kaleo task instance token finder.
	 *
	 * @param kaleoTaskInstanceTokenFinder the kaleo task instance token finder
	 */
	public void setKaleoTaskInstanceTokenFinder(
		KaleoTaskInstanceTokenFinder kaleoTaskInstanceTokenFinder) {
		this.kaleoTaskInstanceTokenFinder = kaleoTaskInstanceTokenFinder;
	}

	/**
	 * Returns the kaleo timer local service.
	 *
	 * @return the kaleo timer local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoTimerLocalService getKaleoTimerLocalService() {
		return kaleoTimerLocalService;
	}

	/**
	 * Sets the kaleo timer local service.
	 *
	 * @param kaleoTimerLocalService the kaleo timer local service
	 */
	public void setKaleoTimerLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoTimerLocalService kaleoTimerLocalService) {
		this.kaleoTimerLocalService = kaleoTimerLocalService;
	}

	/**
	 * Returns the kaleo timer persistence.
	 *
	 * @return the kaleo timer persistence
	 */
	public KaleoTimerPersistence getKaleoTimerPersistence() {
		return kaleoTimerPersistence;
	}

	/**
	 * Sets the kaleo timer persistence.
	 *
	 * @param kaleoTimerPersistence the kaleo timer persistence
	 */
	public void setKaleoTimerPersistence(
		KaleoTimerPersistence kaleoTimerPersistence) {
		this.kaleoTimerPersistence = kaleoTimerPersistence;
	}

	/**
	 * Returns the kaleo timer instance token local service.
	 *
	 * @return the kaleo timer instance token local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoTimerInstanceTokenLocalService getKaleoTimerInstanceTokenLocalService() {
		return kaleoTimerInstanceTokenLocalService;
	}

	/**
	 * Sets the kaleo timer instance token local service.
	 *
	 * @param kaleoTimerInstanceTokenLocalService the kaleo timer instance token local service
	 */
	public void setKaleoTimerInstanceTokenLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoTimerInstanceTokenLocalService kaleoTimerInstanceTokenLocalService) {
		this.kaleoTimerInstanceTokenLocalService = kaleoTimerInstanceTokenLocalService;
	}

	/**
	 * Returns the kaleo timer instance token persistence.
	 *
	 * @return the kaleo timer instance token persistence
	 */
	public KaleoTimerInstanceTokenPersistence getKaleoTimerInstanceTokenPersistence() {
		return kaleoTimerInstanceTokenPersistence;
	}

	/**
	 * Sets the kaleo timer instance token persistence.
	 *
	 * @param kaleoTimerInstanceTokenPersistence the kaleo timer instance token persistence
	 */
	public void setKaleoTimerInstanceTokenPersistence(
		KaleoTimerInstanceTokenPersistence kaleoTimerInstanceTokenPersistence) {
		this.kaleoTimerInstanceTokenPersistence = kaleoTimerInstanceTokenPersistence;
	}

	/**
	 * Returns the kaleo transition local service.
	 *
	 * @return the kaleo transition local service
	 */
	public com.liferay.portal.workflow.kaleo.service.KaleoTransitionLocalService getKaleoTransitionLocalService() {
		return kaleoTransitionLocalService;
	}

	/**
	 * Sets the kaleo transition local service.
	 *
	 * @param kaleoTransitionLocalService the kaleo transition local service
	 */
	public void setKaleoTransitionLocalService(
		com.liferay.portal.workflow.kaleo.service.KaleoTransitionLocalService kaleoTransitionLocalService) {
		this.kaleoTransitionLocalService = kaleoTransitionLocalService;
	}

	/**
	 * Returns the kaleo transition persistence.
	 *
	 * @return the kaleo transition persistence
	 */
	public KaleoTransitionPersistence getKaleoTransitionPersistence() {
		return kaleoTransitionPersistence;
	}

	/**
	 * Sets the kaleo transition persistence.
	 *
	 * @param kaleoTransitionPersistence the kaleo transition persistence
	 */
	public void setKaleoTransitionPersistence(
		KaleoTransitionPersistence kaleoTransitionPersistence) {
		this.kaleoTransitionPersistence = kaleoTransitionPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return KaleoDefinitionService.class.getName();
	}

	protected Class<?> getModelClass() {
		return KaleoDefinition.class;
	}

	protected String getModelClassName() {
		return KaleoDefinition.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = kaleoDefinitionPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoActionLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoActionLocalService kaleoActionLocalService;
	@BeanReference(type = KaleoActionPersistence.class)
	protected KaleoActionPersistence kaleoActionPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoConditionLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoConditionLocalService kaleoConditionLocalService;
	@BeanReference(type = KaleoConditionPersistence.class)
	protected KaleoConditionPersistence kaleoConditionPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoDefinitionLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoDefinitionLocalService kaleoDefinitionLocalService;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoDefinitionService.class)
	protected KaleoDefinitionService kaleoDefinitionService;
	@BeanReference(type = KaleoDefinitionPersistence.class)
	protected KaleoDefinitionPersistence kaleoDefinitionPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoInstanceLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoInstanceLocalService kaleoInstanceLocalService;
	@BeanReference(type = KaleoInstancePersistence.class)
	protected KaleoInstancePersistence kaleoInstancePersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoInstanceTokenLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoInstanceTokenLocalService kaleoInstanceTokenLocalService;
	@BeanReference(type = KaleoInstanceTokenPersistence.class)
	protected KaleoInstanceTokenPersistence kaleoInstanceTokenPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoLogLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoLogLocalService kaleoLogLocalService;
	@BeanReference(type = KaleoLogPersistence.class)
	protected KaleoLogPersistence kaleoLogPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoNodeLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoNodeLocalService kaleoNodeLocalService;
	@BeanReference(type = KaleoNodePersistence.class)
	protected KaleoNodePersistence kaleoNodePersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoNotificationLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoNotificationLocalService kaleoNotificationLocalService;
	@BeanReference(type = KaleoNotificationPersistence.class)
	protected KaleoNotificationPersistence kaleoNotificationPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoNotificationRecipientLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoNotificationRecipientLocalService kaleoNotificationRecipientLocalService;
	@BeanReference(type = KaleoNotificationRecipientPersistence.class)
	protected KaleoNotificationRecipientPersistence kaleoNotificationRecipientPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoTaskLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoTaskLocalService kaleoTaskLocalService;
	@BeanReference(type = KaleoTaskPersistence.class)
	protected KaleoTaskPersistence kaleoTaskPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentLocalService kaleoTaskAssignmentLocalService;
	@BeanReference(type = KaleoTaskAssignmentPersistence.class)
	protected KaleoTaskAssignmentPersistence kaleoTaskAssignmentPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentInstanceLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentInstanceLocalService kaleoTaskAssignmentInstanceLocalService;
	@BeanReference(type = KaleoTaskAssignmentInstancePersistence.class)
	protected KaleoTaskAssignmentInstancePersistence kaleoTaskAssignmentInstancePersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceTokenLocalService kaleoTaskInstanceTokenLocalService;
	@BeanReference(type = KaleoTaskInstanceTokenPersistence.class)
	protected KaleoTaskInstanceTokenPersistence kaleoTaskInstanceTokenPersistence;
	@BeanReference(type = KaleoTaskInstanceTokenFinder.class)
	protected KaleoTaskInstanceTokenFinder kaleoTaskInstanceTokenFinder;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoTimerLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoTimerLocalService kaleoTimerLocalService;
	@BeanReference(type = KaleoTimerPersistence.class)
	protected KaleoTimerPersistence kaleoTimerPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoTimerInstanceTokenLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoTimerInstanceTokenLocalService kaleoTimerInstanceTokenLocalService;
	@BeanReference(type = KaleoTimerInstanceTokenPersistence.class)
	protected KaleoTimerInstanceTokenPersistence kaleoTimerInstanceTokenPersistence;
	@BeanReference(type = com.liferay.portal.workflow.kaleo.service.KaleoTransitionLocalService.class)
	protected com.liferay.portal.workflow.kaleo.service.KaleoTransitionLocalService kaleoTransitionLocalService;
	@BeanReference(type = KaleoTransitionPersistence.class)
	protected KaleoTransitionPersistence kaleoTransitionPersistence;
	@ServiceReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.service.ClassNameLocalService.class)
	protected com.liferay.portal.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.service.ClassNameService.class)
	protected com.liferay.portal.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}