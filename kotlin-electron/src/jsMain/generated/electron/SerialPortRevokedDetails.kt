package electron


external interface SerialPortRevokedDetails {
    var port: SerialPort
    var frame: WebFrameMain

    /**
     * The origin that the device has been revoked from.
     */
    var origin: String
}
