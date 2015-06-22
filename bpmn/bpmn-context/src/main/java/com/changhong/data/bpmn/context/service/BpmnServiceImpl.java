/**
 * 
 */
package com.changhong.data.bpmn.context.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.changhong.data.bpmn.common.domain.BpmnDomain;
import com.changhong.data.bpmn.common.service.api.BpmnService;

/**
 * @author Tony
 * @mail tony.qiyao@foxmail.com
 * @date 2015年6月22日
 * @since 
 */
@Service
public class BpmnServiceImpl implements BpmnService{
	private static Logger logger = LoggerFactory.getLogger(BpmnServiceImpl.class);
	
	
	public BpmnServiceImpl(){
		logger.info("dubbo service create");
	}


	/* (non-Javadoc)
	 * @see com.changhong.data.bpmn.common.service.api.BpmnService#query(java.lang.String)
	 */
	@Override
	public BpmnDomain query(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
