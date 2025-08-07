/*
 * Diese Datei ist Teil von My-Prose Anwendung.
 *
 * Copyright (c) [2025] [https://github/mileyCg]
 *
 * Lizenziert unter der Open Software License Version 3.0 (OSL-3.0);
 * diese Datei darf nur in Übereinstimmung mit der Lizenz verwendet werden.
 *
 * Eine Kopie der Lizenz ist verfügbar unter:
 *   https://opensource.org/licenses/OSL-3.0
 *
 * Sofern nicht gesetzlich vorgeschrieben oder schriftlich vereinbart,
 * wird die Software unter der Lizenz "WIE BESEHEN" bereitgestellt –
 * OHNE JEGLICHE GEWÄHRLEISTUNG, weder ausdrücklich noch stillschweigend.
 * Siehe die Lizenz für spezifische Regelungen zu Rechten und Einschränkungen.
 * 
 * SPDX-License-Identifier: OSL-3.0
 */


package com.example;

public class App 
{
    public static void main( String[] args )
    {
        printAnswers();
    }


	public static void printAnswers() {
	int question = 1;
	String[] answers = {
"""
Why is it important to include both a LICENSE file and license headers in an open source project?
""",
"""
To prevent ambiguity and reduce legal risk for everyone involved. LICENSE covers the whole project, while headers attach the license to individual files for better traceability and reuse compliance.
""",    
"""
What role do CONTRIBUTING.md, CODE_OF_CONDUCT.md, and SECURITY.md play in building a healthy open source community?
""",
"""
CONTRIBUTING.md explains how to contribute effectively, ensuring quality and consistency. CODE_OF_CONDUCT.md defines expected behavior and builds trust. SECURITY.md provides a clear process for reporting vulnerabilities, showing responsibility and care for users.
""",    
"""
When might it be beneficial to transfer stewardship of an open source project to a foundation like the Apache Software Foundation or the Eclipse Foundation?
""",
"""
It can be beneficial when neutrality, legal support, and long-term sustainability are needed. Foundations offer governance, infrastructure, and credibility that individuals or small teams may lack. This builds community trust and reduces risk.
""",
"""
What are the key contents of a NOTICE file, and how does it differ from a LICENSE file in an open source repository?
""",
"""
While LICENSE explains the legal terms under which the code is distributed, NOTICE includes attribution requirements and other notices that must be preserved during redistribution. LICENSE is always required; NOTICE is only needed under licenses like Apache-2.0 or OSL-3.0, or when required by third-party components.
"""
};

	System.out.println();
	System.out.println("-------------------Execise 3---------------------");
	System.out.println();
	for (int index = 0; index < answers.length - 1 ; index ++)
	{ if (index % 2 == 0) {
	System.out.println("Question "  + question + ": ");
	System.out.println(answers[index]);
	System.out.println();
	question ++ ;
	} else {
	System.out.println("Answer: ");
	System.out.println(answers[index]);
	System.out.println();
		}	
	}

}


}
