package electron.core


external interface HIDDevice {
// Docs: https://electronjs.org/docs/api/structures/hid-device
    /**
     * Unique identifier for the device.
     */
    var deviceId: String

    /**
     * Unique identifier for the HID interface.  A device may have multiple HID
     * interfaces.
     */
    var guid: String?

    /**
     * Name of the device.
     */
    var name: String

    /**
     * The USB product ID.
     */
    var productId: Double

    /**
     * The USB device serial number.
     */
    var serialNumber: String?

    /**
     * The USB vendor ID.
     */
    var vendorId: Double
}
