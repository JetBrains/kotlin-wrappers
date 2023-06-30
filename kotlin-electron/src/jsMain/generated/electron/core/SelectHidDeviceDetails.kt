package electron.core


external interface SelectHidDeviceDetails {
    var deviceList: js.core.ReadonlyArray<HIDDevice>
    var frame: WebFrameMain
}
