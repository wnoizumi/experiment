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
package org.apache.oodt.cas.pushpull.protocol;

//OODT imports
import org.apache.oodt.cas.pushpull.protocol.ProtocolFactory;
import org.apache.oodt.commons.spring.SpringSetIdInjectionType;

/**
 * Mock {@link ProtocolFactory} for testing
 * 
 * @author bfoster
 */
public class MockProtocolFactory implements ProtocolFactory, SpringSetIdInjectionType {

	private String schema;
	private String id;
	
	public MockProtocol newInstance() {
		return new MockProtocol(id);
	}

	public String getSchema() {
		return schema;
	}
	
	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
