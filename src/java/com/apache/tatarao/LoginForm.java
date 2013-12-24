/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.tatarao;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author TATARAO
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    private String Password;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @return
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param i
     */
    public void setPassword(String i) {
        Password = i;
    }

    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("enter.user"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getPassword() == null || getPassword().length() < 1) {
            errors.add("password", new ActionMessage("enter.pass"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
