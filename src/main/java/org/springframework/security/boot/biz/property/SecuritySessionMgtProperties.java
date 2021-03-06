/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.springframework.security.boot.biz.property;

import javax.servlet.http.HttpServletResponse;

import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;

public class SecuritySessionMgtProperties {
	
	
	private boolean allowSessionCreation = false;
	/** if should allow the JSESSIONID to be rewritten into the URLs*/
	private boolean enableSessionUrlRewriting;
	/**  */
	private String failureUrl = "/error";
	/** the maximum number of sessions for a user */
	private Integer maximumSessions = Integer.MAX_VALUE;
	private boolean maxSessionsPreventsLogin = false;
	
	private SessionCreationPolicy creationPolicy = SessionCreationPolicy.STATELESS;
	private SessionFixationPolicy fixationPolicy = SessionFixationPolicy.NONE;
	
	private String sessionAttrName = "SPRING_SECURITY_SAVED_REQUEST";
	
	public boolean isAllowSessionCreation() {
		return allowSessionCreation;
	}

	public void setAllowSessionCreation(boolean allowSessionCreation) {
		this.allowSessionCreation = allowSessionCreation;
	}
	
	public String getFailureUrl() {
		return failureUrl;
	}

	public void setFailureUrl(String failureUrl) {
		this.failureUrl = failureUrl;
	}

	public Integer getMaximumSessions() {
		return maximumSessions;
	}

	/**
	 * Controls the maximum number of sessions for a user. The default is to allow
	 * any number of users.
	 * 
	 * @param maximumSessions the maximum number of sessions for a user
	 */
	public void setMaximumSessions(Integer maximumSessions) {
		this.maximumSessions = maximumSessions;
	}

	public boolean isMaxSessionsPreventsLogin() {
		return maxSessionsPreventsLogin;
	}

	/**
	 * If true, prevents a user from authenticating when the
	 * {@link #maximumSessions(int)} has been reached. Otherwise (default), the user
	 * who authenticates is allowed access and an existing user's session is
	 * expired. The user's who's session is forcibly expired is sent to
	 * {@link #expiredUrl(String)}. The advantage of this approach is if a user
	 * accidentally does not log out, there is no need for an administrator to
	 * intervene or wait till their session expires.
	 *
	 * @param maxSessionsPreventsLogin true to have an error at time of
	 *                                 authentication, else false (default)
	 */
	public void setMaxSessionsPreventsLogin(boolean maxSessionsPreventsLogin) {
		this.maxSessionsPreventsLogin = maxSessionsPreventsLogin;
	}

	public boolean isEnableSessionUrlRewriting() {
		return enableSessionUrlRewriting;
	}

	/**
	 * If set to true, allows HTTP sessions to be rewritten in the URLs when using
	 * {@link HttpServletResponse#encodeRedirectURL(String)} or
	 * {@link HttpServletResponse#encodeURL(String)}, otherwise disallows HTTP
	 * sessions to be included in the URL. This prevents leaking information to
	 * external domains.
	 *
	 * @param enableSessionUrlRewriting true if should allow the JSESSIONID to be
	 *                                  rewritten into the URLs, else false
	 *                                  (default)
	 * @see HttpSessionSecurityContextRepository#setDisableUrlRewriting(boolean)
	 */
	public void setEnableSessionUrlRewriting(boolean enableSessionUrlRewriting) {
		this.enableSessionUrlRewriting = enableSessionUrlRewriting;
	}

	public SessionCreationPolicy getCreationPolicy() {
		return creationPolicy;
	}

	public void setCreationPolicy(SessionCreationPolicy creationPolicy) {
		this.creationPolicy = creationPolicy;
	}

	public SessionFixationPolicy getFixationPolicy() {
		return fixationPolicy;
	}

	public void setFixationPolicy(SessionFixationPolicy fixationPolicy) {
		this.fixationPolicy = fixationPolicy;
	}
	

	/**
	 * If the {@code sessionAttrName} property is set, the request is stored in
	 * the session using this attribute name. Default is
	 * "SPRING_SECURITY_SAVED_REQUEST".
	 *
	 * @param sessionAttrName a new session attribute name.
	 */
	public void setSessionAttrName(String sessionAttrName) {
		this.sessionAttrName = sessionAttrName;
	}

	public String getSessionAttrName() {
		return sessionAttrName;
	}
	
}
