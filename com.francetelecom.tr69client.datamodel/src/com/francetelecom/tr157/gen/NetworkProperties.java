/*--------------------------------------------------------
 * Product Name : modus TR-069
 * Version : 1.1
 * Module Name : DataModelBundle
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
 * Generated : 21 oct. 2009 by GenModel
 */

package com.francetelecom.tr157.gen;
import com.francetelecom.admindm.model.*;
import com.francetelecom.admindm.api.StorageMode;
import com.francetelecom.admindm.soap.Fault;
/**
* Class NetworkProperties.
* @author OrangeLabs R&D
*/
public class NetworkProperties  {
    /** The data. */
    private final IParameterData data;
    /** The base path. */
    private final String basePath;
     /**
     * Default constructor.
     * @param pData data model
     * @param pBasePath base path of attribute
     * @param pPersist persistence
     */
     public NetworkProperties(
            final IParameterData pData,
            final String pBasePath) {
        super();
        this.data = pData;
        this.basePath = pBasePath;
    }
    /**
     * Get the data.
     * @return the data
     */
    public final IParameterData getData() {
        return data;
    }

    /**
     * Get the basePath.
     * @return the basePath
     */
    public final String getBasePath() {
        return basePath;
    }

     /**
     * Initialiser.
     */ 
     public void initialize() throws Fault {
        com.francetelecom.admindm.model.Parameter param;
        param = data.createOrRetrieveParameter(basePath);
        param.setType(ParameterType.ANY);

        paramTCPImplementation = createTCPImplementation();
        paramMaxTCPWindowSize = createMaxTCPWindowSize();
    }

    /**
    *  
    */
    private com.francetelecom.admindm.model.Parameter paramTCPImplementation;

    /**
    * Getter method of TCPImplementation.
    * @return _TCPImplementation
    */
    public final com.francetelecom.admindm.model.Parameter
                     getParamTCPImplementation() {
        return paramTCPImplementation;
    }

    /**
    * Create the parameter TCPImplementation
    * @return TCPImplementation
    * @throws Fault exception
    */  
    public final com.francetelecom.admindm.model.Parameter
                     createTCPImplementation() throws Fault {
    	com.francetelecom.admindm.model.Parameter param;
        param = data.createOrRetrieveParameter(basePath + "TCPImplementation");
        param.setNotification(0);
        param.setStorageMode(StorageMode.DM_ONLY);
        param.setType(ParameterType.STRING);
        param.setValue("");
        param.setWritable(false);
        return param;
        }

    /**
    *  
    */
    private com.francetelecom.admindm.model.Parameter paramMaxTCPWindowSize;

    /**
    * Getter method of MaxTCPWindowSize.
    * @return _MaxTCPWindowSize
    */
    public final com.francetelecom.admindm.model.Parameter
                     getParamMaxTCPWindowSize() {
        return paramMaxTCPWindowSize;
    }

    /**
    * Create the parameter MaxTCPWindowSize
    * @return MaxTCPWindowSize
    * @throws Fault exception
    */  
    public final com.francetelecom.admindm.model.Parameter
                     createMaxTCPWindowSize() throws Fault {
    	com.francetelecom.admindm.model.Parameter param;
        param = data.createOrRetrieveParameter(basePath + "MaxTCPWindowSize");
        param.setNotification(0);
        param.setStorageMode(StorageMode.DM_ONLY);
        param.setType(ParameterType.UINT);
        param.addCheck(new CheckMinimum(0));
        param.addCheck(new CheckMaximum(4294967295L));
        param.setValue(new Long(0));
        param.setWritable(false);
        return param;
        }


}