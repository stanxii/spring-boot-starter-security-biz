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

public class SecurityLogoutProperties {

	/** 注销地址：会话注销后的重定向地址 */
	private String logoutUrl;
	private String logoutUrlPatterns = "/logout";
	/** 注销地址：会话注销后的重定向地址 */
	private String logoutSuccessUrl;

	private boolean invalidateHttpSession = true;
	private boolean clearAuthentication = true;

	public String getLogoutUrl() {
		return logoutUrl;
	}

	public void setLogoutUrl(String logoutUrl) {
		this.logoutUrl = logoutUrl;
	}

	public String getLogoutUrlPatterns() {
		return logoutUrlPatterns;
	}

	public void setLogoutUrlPatterns(String logoutUrlPatterns) {
		this.logoutUrlPatterns = logoutUrlPatterns;
	}

	public String getLogoutSuccessUrl() {
		return logoutSuccessUrl;
	}

	public void setLogoutSuccessUrl(String logoutSuccessUrl) {
		this.logoutSuccessUrl = logoutSuccessUrl;
	}

	public boolean isInvalidateHttpSession() {
		return invalidateHttpSession;
	}

	public void setInvalidateHttpSession(boolean invalidateHttpSession) {
		this.invalidateHttpSession = invalidateHttpSession;
	}

	public boolean isClearAuthentication() {
		return clearAuthentication;
	}

	public void setClearAuthentication(boolean clearAuthentication) {
		this.clearAuthentication = clearAuthentication;
	}

}
