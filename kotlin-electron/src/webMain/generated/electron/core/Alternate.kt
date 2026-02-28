// Automatically generated - do not modify!

package electron.core

external interface Alternate {
    /**
     * the alternate setting number of this interface.
     */
    var alternateSetting: Double

    /**
     * the class of this interface. See USB.org for class code descriptions.
     */
    var interfaceClass: Double

    /**
     * the subclass of this interface.
     */
    var interfaceSubclass: Double

    /**
     * the protocol supported by this interface.
     */
    var interfaceProtocol: Double

    /**
     * the name of the interface, if one is provided by the device.
     */
    var interfaceName: String?

    /**
     * an array containing instances of the USBEndpoint interface describing each of
     * the endpoints that are part of this interface.
     */
    var endpoints: js.array.ReadonlyArray<Endpoints>
}
