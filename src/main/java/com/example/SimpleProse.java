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

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SimpleProse implements Prose{
    @Override
    public String get() {
        return null;
    }

    public String getText(SimpleSentence[] sentences) {
        StringBuilder text = new StringBuilder();
        for (SimpleSentence sentence : sentences) {
            text.append(sentence.get()).append(" ");
        }
        return text.toString().trim();
    }
}
