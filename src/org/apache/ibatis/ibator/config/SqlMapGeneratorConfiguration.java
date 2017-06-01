/*
 *  Copyright 2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.ibatis.ibator.config;

import org.apache.ibatis.ibator.api.dom.xml.Attribute;
import org.apache.ibatis.ibator.api.dom.xml.XmlElement;


/**
 * @author Jeff Butler
 */
public class SqlMapGeneratorConfiguration extends PropertyHolder {
	private String targetPackage;

	private String targetProject;
	
	private String baseFolder;

	/**
	 *  
	 */
	public SqlMapGeneratorConfiguration() {
		super();
	}

	public String getTargetProject() {
		return targetProject;
	}

	public void setTargetProject(String targetProject) {
		this.targetProject = targetProject;
	}
	
	public String getTargetPackage() {
		return targetPackage;
	}
	
	public void setTargetPackage(String targetPackage) {
		this.targetPackage = targetPackage;
	}
	
	public String getBaseFolder() {
		return baseFolder;
	}
	
	public void setBaseFolder(String baseFolder) {
		this.baseFolder = baseFolder;
	}

    public XmlElement toXmlElement() {
        XmlElement answer = new XmlElement("sqlMapGenerator"); //$NON-NLS-1$
        
        if (targetPackage != null) {
            answer.addAttribute(new Attribute("targetPackage", targetPackage)); //$NON-NLS-1$
        }
        
        if (targetProject != null) {
            answer.addAttribute(new Attribute("targetProject", targetProject)); //$NON-NLS-1$
        }

        if (baseFolder != null) {
        	answer.addAttribute(new Attribute("baseFolder", baseFolder)); //$NON-NLS-1$
        }
        
        addPropertyXmlElements(answer);
        
        return answer;
    }
}
