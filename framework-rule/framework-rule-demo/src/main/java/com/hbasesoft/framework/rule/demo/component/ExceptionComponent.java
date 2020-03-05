/**************************************************************************************** 
 Copyright © 2003-2012 hbasesoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.hbasesoft.framework.rule.demo.component;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.hbasesoft.framework.common.utils.Assert;
import com.hbasesoft.framework.rule.core.FlowComponent;
import com.hbasesoft.framework.rule.core.FlowContext;
import com.hbasesoft.framework.rule.demo.bean.FlowBean;

/**
 * <Description> <br>
 * 
 * @author 王伟<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年9月4日 <br>
 * @since V1.0<br>
 * @see com.hbasesoft.framework.test.rule.file.component <br>
 */
@Component("ExceptionComponent")
public class ExceptionComponent implements FlowComponent<FlowBean> {

    /**
     * Description: <br>
     * 
     * @author 王伟<br>
     * @taskId <br>
     * @param flowBean
     * @param paramMap
     * @return
     * @throws Exception <br>
     */
    @Override
    public boolean process(FlowBean flowBean, FlowContext flowContext) throws Exception {
        System.out.println("----------ExceptionComponent------" + JSONObject.toJSONString(flowBean));
        Assert.isFalse(true, 100);
        return true;
    }

}
