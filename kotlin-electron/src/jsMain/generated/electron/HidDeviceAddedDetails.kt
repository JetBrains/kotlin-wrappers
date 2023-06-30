package electron


external interface HidDeviceAddedDetails {
    var device: js.core.ReadonlyArray<HIDDevice>
    var frame: WebFrameMain
}
