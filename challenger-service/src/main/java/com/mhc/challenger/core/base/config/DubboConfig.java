/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.core.base.config
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 

package com.mhc.challenger.core.base.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**   
 * <p> dubbo配置 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @since V1.0 
 */
@Configuration
@ImportResource("classpath:dubbo/dubbo-all.xml")
public class DubboConfig {

}
