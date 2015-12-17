/**************************************************************************************** 
 Copyright © 2003-2012 fccfc Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.fccfc.framework.common;

import org.springframework.context.ApplicationContext;

/**
 * <Description> <br>
 * 
 * @author 王伟<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2015年12月7日 <br>
 * @since V1.0<br>
 * @see com.fccfc.framework.web.core.init <br>
 */
public interface StartupListener {

    int getOrder();

    void init(ApplicationContext context) throws FrameworkException;

    void destory();

}