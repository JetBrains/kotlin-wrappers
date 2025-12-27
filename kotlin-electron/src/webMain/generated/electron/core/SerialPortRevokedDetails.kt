// Automatically generated - do not modify!

package electron.core

external interface SerialPortRevokedDetails {
    var port: SerialPort

    /**
     * The frame initiating this event. May be `null` if accessed after the frame has
     * either navigated or been destroyed.
     */
    var frame: WebFrameMain?

    /**
     * The origin that the device has been revoked from.
     */
    var origin: String
}
