package electron


external interface SelectHidDeviceDetails {
    var deviceList: js.core.ReadonlyArray<HIDDevice>
    var frame: WebFrameMain
}
