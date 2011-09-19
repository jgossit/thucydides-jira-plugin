package net.thucydides.plugins.jira.service;

import net.thucydides.core.ThucydidesSystemProperty;

/**
 * Obtain the JIRA configuration details from system properties.
 */
public class SystemPropertiesJIRAConfiguration implements JIRAConfiguration {

    public static final String JIRA_URL = "jira.url";
    public static final String JIRA_USERNAME = "jira.username";
    public static final String JIRA_PASSWORD = "jira.password";

    public String getJiraUser() {
        return System.getProperty(JIRA_USERNAME);
    }

    public String getJiraPassword() {
        return System.getProperty(JIRA_PASSWORD
        );
    }

    public String getJiraWebserviceUrl() {
        String baseUrl = System.getProperty(JIRA_URL);
        return baseUrl + "/rpc/soap/jirasoapservice-v2";
    }


}