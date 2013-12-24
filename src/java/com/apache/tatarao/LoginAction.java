/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.tatarao;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author TATARAO
 */
public class LoginAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm lf=(LoginForm)form;
        String uname=lf.getName();
        String pwd=lf.getPassword();
        
        Session session=new Configuration().configure().buildSessionFactory().openSession();
        Query query=session.createQuery("from Userreg u where u.ename=? and u.password=?");
       query.setParameter(0,uname);
       query.setParameter(1, pwd);
       List l=query.list();
        if(l.size()!=0)
        return mapping.findForward("success");
        else
            return mapping.findForward("failure");
    }
}
