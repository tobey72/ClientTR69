/*--------------------------------------------------------
 * Product Name : modus TR-069
 * Version : 1.1
 * Module Name : GetParameterValuesBundle
 *
 * Copyright © 2011 France Telecom
 *
 * This software is distributed under the Apache License, Version 2.0
 * (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 or see the "license.txt" file for
 * more details
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author : Orange Labs R&D O.Beyler
 */
package com.francetelecom.admindm.getParameterValues;

import org.kxml2.kdom.Element;
import com.francetelecom.admindm.api.RPCEncoder;
import com.francetelecom.admindm.api.RPCMethod;
import com.francetelecom.admindm.soap.Soap;
/**
 * The Class GetParameterValuesResponseEncoder.
 */
public class GetParameterValuesResponseEncoder implements RPCEncoder {
    /**
     * Encode.
     * @param method the method
     * @return the element
     */
    public final Element encode(final RPCMethod method) {
        GetParameterValuesResponse gpvr = (GetParameterValuesResponse) method;
        Element result = new Element();
        result.setName(gpvr.getName());
        result.setNamespace(Soap.getCWMPNameSpace());
        Element eParameterList = new Element();
        eParameterList.setName("ParameterList");
        result.addChild(Element.ELEMENT,eParameterList);
        StringBuffer value = new StringBuffer("cwmp:ParameterValueStruct[");
        int count = 0; 
        if (gpvr.getParameterList()!=null){
            count = gpvr.getParameterList().length;
        }
        value.append(count);
        value.append("]");
        eParameterList.setAttribute(Soap.getSoapEncNameSpace(),
                "arrayType", value.toString());
        for (int i = 0; i < count; i++) {
            eParameterList.addChild(Element.ELEMENT,
                    gpvr.getParameterList()[i].encoded());
        }
        return result;
    }
}
