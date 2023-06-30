package electron.core


external interface SerialPort {
// Docs: https://electronjs.org/docs/api/structures/serial-port
    /**
     * A stable identifier on Windows that can be used for device permissions.
     *
     * @platform win32
     */
    var deviceInstanceId: String?

    /**
     * A string suitable for display to the user for describing this device.
     */
    var displayName: String?

    /**
     * Unique identifier for the port.
     */
    var portId: String

    /**
     * Name of the port.
     */
    var portName: String

    /**
     * The USB product ID.
     */
    var productId: String?

    /**
     * The USB device serial number.
     */
    var serialNumber: String?

    /**
     * Represents a single serial port on macOS can be enumerated by multiple drivers.
     *
     * @platform darwin
     */
    var usbDriverName: String?

    /**
     * The USB vendor ID.
     */
    var vendorId: String?
}
