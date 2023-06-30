package electron.core


external interface HidDeviceRevokedDetails {
    var device: js.core.ReadonlyArray<HIDDevice>

    /**
     * The origin that the device has been revoked from.
     */
    var origin: String?
}
