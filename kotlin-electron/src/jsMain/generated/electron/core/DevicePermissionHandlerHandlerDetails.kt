package electron.core


external interface DevicePermissionHandlerHandlerDetails {
    /**
     * The type of device that permission is being requested on, can be `hid`,
     * `serial`, or `usb`.
     */
    var deviceType: (DevicePermissionHandlerHandlerDetailsDeviceType)

    /**
     * The origin URL of the device permission check.
     */
    var origin: String

    /**
     * the device that permission is being requested for.
     */
    var device: Any /* (HIDDevice) | (SerialPort) | (USBDevice) */
}
