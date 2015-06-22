/**
 * 
 */
package com.changhong.data.bpmn.context.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Tony
 * @mail tony.qiyao@foxmail.com
 * @date 2015年6月22日
 * @since 1.0.0
 */
@Service
public class BpmnDefServiceImpl {

	private Logger logger = LoggerFactory.getLogger(BpmnDefServiceImpl.class);
	
	@PostConstruct
	public void init(){
		logger.info("spring service init");
	}
}
