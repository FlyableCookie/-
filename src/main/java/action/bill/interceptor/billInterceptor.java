package action.bill.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import service.EmployeeService;
import service.UserService;

import javax.servlet.http.HttpSession;

public class billInterceptor extends MethodFilterInterceptor {

    @Autowired
    private UserService userService;

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
//        System.out.println(session.getAttribute("userName"));
        if (session.getAttribute("userName") != null){
            return actionInvocation.invoke();
        }
        return "login";
    }

}
