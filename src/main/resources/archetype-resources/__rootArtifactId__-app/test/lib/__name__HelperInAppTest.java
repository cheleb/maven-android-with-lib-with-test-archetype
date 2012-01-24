#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.lib;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * ${name}CodeHelperInAppTest is the unit test suite for {@link ${package}.lib.${name}Helper}.
 * This class is a duplicate of MorseCodeConverterInAppTest showing how a pure unit test can run within the same project
 * as the Android application.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 */
public class ${name}HelperInAppTest extends TestCase {

    
    public void testHelp()
    {
    	${classPrefix}Helper.help();
    }
}
