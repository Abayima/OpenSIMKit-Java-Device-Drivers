/*
 * Exception for all driver errors
 */
package org.opensimkit.drivers;

/**
 *
 * @author ahmedmaawy
 */
public class DriverException extends RuntimeException {
    public DriverException(String excpetion)
    {
        super(excpetion);
    }

    DriverException() {
        super();
    }
}
