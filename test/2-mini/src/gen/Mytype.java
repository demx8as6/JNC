/* 
 * @(#)My-type.java        1.0 4/7/12
 *
 * This file has been auto-generated by JPyang, the Java output format plug-in
 * of pyang. Origin: module "mini", revision: "unknown".
 */

package gen;

import com.tailf.netconfmanager.yang.YangException;
import com.tailf.netconfmanager.yang.type.YangString;

/**
 * This class represents a "src/gen/my-type" element
 * from the namespace http://exampleCom/ns/mini/10
 *
 * @version    1.0 2012-7-4
 * @author    Auto Generated
 */
@SuppressWarnings("serial")
public class Mytype extends YangString {

    /**
     * Constructor for my-type object from a string.
     * @param value Value to construct the my-type from.
     */
    public Mytype(String value) 
        throws YangException {
        super(value);
        check();
    }

    /**
     * Sets the value for child typedef "my-type", using a string value.
     * @param my-typeValue The value to set.
     * @throws YangException 
     */
    public void setValue(String mytypeValue) throws YangException {
        super.setValue(mytypeValue);
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check()
        throws YangException {
    }

}