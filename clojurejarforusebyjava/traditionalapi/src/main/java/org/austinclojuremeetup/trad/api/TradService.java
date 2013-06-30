package org.austinclojuremeetup.trad.api;

import java.util.List;

/**
 * Some service given to us by the rest of the hypothetical project.
 */
public interface TradService {
    /** 
     * Translate the ordered list of things to Strings for display.
     */
    List<String> convert(List<Object> inputs);
}
