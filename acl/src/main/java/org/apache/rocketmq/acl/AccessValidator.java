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

package org.apache.rocketmq.acl;

import org.apache.rocketmq.remoting.protocol.RemotingCommand;

/**
 * 访问验证
 */
public interface AccessValidator {
    /**
     * Parse to get the AccessResource(user, resource, needed permission)
     *  解析以获取访问资源（用户、资源、所需权限）
     * @param request
     * @param remoteAddr
     * @return Plain access resource result,include access key,signature and some other access attributes.
     */
    AccessResource parse(RemotingCommand request, String remoteAddr);

    /**
     * Validate the access resource.
     *  验证访问资源。
     * @param accessResource
     */
    void validate(AccessResource accessResource);
}
