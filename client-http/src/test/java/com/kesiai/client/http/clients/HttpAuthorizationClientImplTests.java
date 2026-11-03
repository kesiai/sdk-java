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

package com.kesiai.client.http.clients;


import com.kesiai.client.dto.ResponseDTO;
import com.kesiai.client.dto.Token;
import com.kesiai.client.properties.AuthorizationProperties;
import com.kesiai.client.service.core.AppClient;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@ActiveProfiles("integration")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HttpAuthorizationClientImplTests {

    @Autowired
    private AuthorizationProperties authorizationProperties;

    @Autowired
    private AppClient appClient;

    @Test
    void getProjectToken() {
        ResponseDTO<Token> response = appClient.getToken("base", authorizationProperties.getAppKey(), authorizationProperties.getAppSecret());
        Assertions.assertTrue(response.isSuccess(), response.getMessage());
        Assertions.assertNotNull(response.getData());
        Assertions.assertNotNull(response.getData().getToken());
        Assertions.assertFalse(response.getData().getToken().isBlank());
        System.out.println(response.getData());
    }
}
