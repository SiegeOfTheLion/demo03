package com.ziran.UserAction;

import com.opensymphony.xwork2.ActionSupport;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月8日 下午7:08:17 <br/>       
 */
public class UserAction extends ActionSupport {
    
    //获取id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String findById(){
        return SUCCESS;
    }
    
}
  
