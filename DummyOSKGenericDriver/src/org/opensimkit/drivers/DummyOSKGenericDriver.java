/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensimkit.drivers;

import net.xeoh.plugins.base.annotations.PluginImplementation;

/**
 *
 * @author ahmedmaawy
 */
@PluginImplementation
public class DummyOSKGenericDriver implements DriverInterface {

    private boolean deviceConnected;
    
    public DummyOSKGenericDriver()
    {
        deviceConnected = false;
    }
    
    @Override
    public String getManufacturer() {
        return "Dummy";
    }

    @Override
    public String getModel() {
        return "Model";
    }

    @Override
    public String getRevision() {
        return "01";
    }

    @Override
    public String runCommand(String command) {
        return "OK";
    }

    @Override
    public boolean saveMessage(String contact, String message) {
        return true;
    }

    @Override
    public boolean setMemoryToSIMMemory() {
        return true;
    }

    @Override
    public boolean setToTextFormat() {
        return true;
    }

    @Override
    public String getAllMessages() {
        return "Message 1\n" + getDelimiter() + "\nMessage 2\n" + getDelimiter();
    }

    @Override
    public String getPortName() {
        return null;
    }

    @Override
    public String getMessageAt(int messageIndex) {
        if(messageIndex == 0)
        {
            return "Message 1";
        }
        else if(messageIndex == 1)
        {
            return "Message 2";
        }
        
        return "ERROR";
    }

    @Override
    public String getDelimiter() {
        return "<<END>>";
    }

    @Override
    public boolean isDeviceConnected() {
        return deviceConnected;
    }

    @Override
    public boolean isGenericConnection() {
        return true;
    }

    @Override
    public boolean connectToDevice() {
        deviceConnected = true;
        
        return true;
    }

    @Override
    public boolean connectToSerialPort(int portIndex) {
        return false;
    }

    @Override
    public boolean disconnectDevice() {
        deviceConnected = false;
        
        return true;
    }

    @Override
    public boolean clearAllMessages() {
        return true;
    }
    
}
