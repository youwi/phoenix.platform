/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.suren.autotest.platform.mapping;

import java.util.List;

import org.suren.autotest.platform.model.SuiteRunnerLog;

/**
 * 运行日志服务接口
 * @author suren
 * @date 2017年1月31日 下午7:40:36
 */
public interface SuiteRunnerLogMapper
{
	void save(SuiteRunnerLog suiteRunnerLog);
	
	void delBySuiteRunnerId(String suiteRunnerInfoId);
	
	void delByTriggerUserId(String triggerUserId);
	
	List<SuiteRunnerLog> findByRunnerId(String runnerId);
	
	SuiteRunnerLog findById(String id);
}
