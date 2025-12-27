// Automatically generated - do not modify!

package electron.core

external interface SelectUsbDeviceDetails {
    var deviceList: js.array.ReadonlyArray<USBDevice>

    /**
     * The frame initiating this event. May be `null` if accessed after the frame has
     * either navigated or been destroyed.
     */
    var frame: WebFrameMain?
}
