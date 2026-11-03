/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kesiai.client.http.clients.warn;

import com.kesiai.client.builder.Query;
import com.kesiai.client.dto.ResponseDTO;
import com.kesiai.client.http.annotation.GetObjectParams;
import com.kesiai.client.service.warning.WarnRuleClient;
import com.kesiai.client.service.warning.dto.Rule;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import javax.annotation.Nonnull;
import java.util.List;


/**
 * 告警规则客户端
 */
@HttpExchange
public interface WarnRuleClientImpl extends WarnRuleClient {
    
    @GetExchange("/warning/rule")
    @Override
    ResponseDTO<List<Rule>> query(@Nonnull @GetObjectParams("query") Query query);
}
