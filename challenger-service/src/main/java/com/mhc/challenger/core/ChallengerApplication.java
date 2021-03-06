/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.challenger.core
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.mhc.challenger.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mhc.framework.common.exception.annotation.EnableExceptionManagement;
import com.mhc.framework.support.log.anno.EnableLogManagement;
import com.spring4all.swagger.EnableSwagger2Doc;

/**   
 * <p> challenger 服务启动类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-11-30 10:55:07 
 * @since V1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.mhc.challenger.dal", "com.mhc.challenger.core","com.mhc.framework.common.exception.handler", "com.mhc.framework.support" })
@EnableTransactionManagement
@EnableLogManagement
@EnableExceptionManagement
@EnableSwagger2Doc
@RestController
public class ChallengerApplication {
	private final static Logger logger = LoggerFactory.getLogger(ChallengerApplication.class);

	/**    
	 * <p> Start启动入口 </p>
	 *  
	 * @param args 
	 */
	public static void main(String[] args) {
		SpringApplication.run(ChallengerApplication.class, args);
		logger.info("sample started. http://localhost:8080/hello/test");
	}
	
	/**    
	 * <p> 测试 </p>
	 *  
	 * @param name
	 * @return 
	 */
	//跳转 path = /hello/  {name} 代表一个变量
	@RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
	public Object hello(@PathVariable String name) {
		return "Hello world " + name;
	}
}