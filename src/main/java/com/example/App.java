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
	String[] answers = {"a a a","b b b","c c c","d d d"};
	System.out.println("-------Execise 3--------");
	for (int index = 0; index < answers.length - 1 ; index ++)
		{ if (index % 2 == 0){ if (index == 0){
        System.out.println("Question 1 : ");
        System.out.println(answers[index]);
        System.out.println();
}
	System.out.println("Question"  + index + ": ");
	System.out.println(answers[index]);
	System.out.println();
	} else {
	System.out.println("Answer: ");
	System.out.println(answers[index]);
	System.out.println();
		}	
	}

}


}
