package electron


external interface UsbDeviceRevokedDetails {
    var device: js.core.ReadonlyArray<USBDevice>

    /**
     * The origin that the device has been revoked from.
     */
    var origin: String?
}
