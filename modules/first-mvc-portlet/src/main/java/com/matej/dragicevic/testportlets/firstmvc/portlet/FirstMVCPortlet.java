package com.matej.dragicevic.testportlets.firstmvc.portlet;

import com.matej.dragicevic.testportlets.firstmvc.constants.FirstMVCPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author matej
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=first-mvc-portlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/view.jsp",
		"com.liferay.portlet.footer-portlet-javascript=/js/handlebars.runtime-v4.0.12.js",
		"com.liferay.portlet.footer-portlet-javascript=/js/template.js",
		"com.liferay.portlet.footer-portlet-javascript=/js/test.js",
		"javax.portlet.name=" + FirstMVCPortletKeys.FirstMVC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FirstMVCPortlet extends MVCPortlet {
}