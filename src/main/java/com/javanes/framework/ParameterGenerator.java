/**
 *  Copyright 2005-2015 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package com.javanes.framework;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * To generate random orders
 */
@Component
public class ParameterGenerator {


    public Map<String, Object> queryParameters() {
    	Map<String, Object> sqlInput = new HashMap<>();
    	
    	sqlInput.put("numcte", "005033981");

        return sqlInput;
    }
    
    public Map<String, Object> storedProcedureParameters() {
    	Map<String, Object> sqlInput = new HashMap<>();
    	
    	sqlInput.put("demoParam1", "005033981");
    	sqlInput.put("demoParam2", "BEX");
    	sqlInput.put("demoParam3", "20190520_085917");
    	sqlInput.put("demoParam4", "9621140411");

        return sqlInput;
    }

}