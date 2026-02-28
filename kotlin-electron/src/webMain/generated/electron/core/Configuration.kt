// Automatically generated - do not modify!

package electron.core

external interface Configuration {
    /**
     * the configuration value of this configuration.
     */
    var configurationValue: Double

    /**
     * the name provided by the device to describe this configuration.
     */
    var configurationName: String

    /**
     * An array of USBInterface objects containing information about an interface
     * provided by the USB device.
     */
    var interfaces: js.array.ReadonlyArray<Interfaces>
}
