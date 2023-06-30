package electron


external interface HidDeviceRemovedDetails {
    var device: js.core.ReadonlyArray<HIDDevice>
    var frame: WebFrameMain
}
