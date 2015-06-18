package com.changhong.data.bpmn.common.service.api;

import com.changhong.data.bpmn.common.domain.BpmnDomain;

/**
 * bpmn 服务 接口
 * @author QiYao
 * @mail tony.qiyao@foxmail.com
 * @date 2015年6月18日
 */
public interface BpmnService {

	BpmnDomain query(String id);
	
	
}
