#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.lib;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * MorseCodeConverterTest is the unit test suite for {@link ${package}.morse.MorseCodeConverter}.
 *
* @author Manfred Moser <manfred@simpligility.com>
 */
public class ${classPrefix}HelperTest extends TestCase {

    /**
     * Test the timing parameters for signals.
     */
    public void testHelp()
    {
    	${classPrefix}Helper.help();
    }

}
