package electron


external interface USBDevice {
// Docs: https://electronjs.org/docs/api/structures/usb-device
    /**
     * The device class for the communication interface supported by the device
     */
    var deviceClass: Double

    /**
     * Unique identifier for the device.
     */
    var deviceId: String

    /**
     * The device protocol for the communication interface supported by the device
     */
    var deviceProtocol: Double

    /**
     * The device subclass for the communication interface supported by the device
     */
    var deviceSubclass: Double

    /**
     * The major version number of the device as defined by the device manufacturer.
     */
    var deviceVersionMajor: Double

    /**
     * The minor version number of the device as defined by the device manufacturer.
     */
    var deviceVersionMinor: Double

    /**
     * The subminor version number of the device as defined by the device manufacturer.
     */
    var deviceVersionSubminor: Double

    /**
     * The manufacturer name of the device.
     */
    var manufacturerName: String?

    /**
     * The USB product ID.
     */
    var productId: Double

    /**
     * Name of the device.
     */
    var productName: String?

    /**
     * The USB device serial number.
     */
    var serialNumber: String?

    /**
     * The USB protocol major version supported by the device
     */
    var usbVersionMajor: Double

    /**
     * The USB protocol minor version supported by the device
     */
    var usbVersionMinor: Double

    /**
     * The USB protocol subminor version supported by the device
     */
    var usbVersionSubminor: Double

    /**
     * The USB vendor ID.
     */
    var vendorId: Double
}
