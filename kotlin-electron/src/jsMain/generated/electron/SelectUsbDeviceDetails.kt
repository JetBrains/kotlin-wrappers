package electron


external interface SelectUsbDeviceDetails {
    var deviceList: js.core.ReadonlyArray<USBDevice>
    var frame: WebFrameMain
}
