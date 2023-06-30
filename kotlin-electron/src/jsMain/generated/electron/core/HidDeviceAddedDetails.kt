package electron.core


external interface HidDeviceAddedDetails {
    var device: js.core.ReadonlyArray<HIDDevice>
    var frame: WebFrameMain
}
