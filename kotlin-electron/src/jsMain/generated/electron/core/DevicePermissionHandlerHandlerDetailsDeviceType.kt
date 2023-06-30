package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{hid: 'hid', serial: 'serial', usb: 'usb'}/*union*/)""")
sealed external interface DevicePermissionHandlerHandlerDetailsDeviceType {
    companion object {
        val hid: DevicePermissionHandlerHandlerDetailsDeviceType
        val serial: DevicePermissionHandlerHandlerDetailsDeviceType
        val usb: DevicePermissionHandlerHandlerDetailsDeviceType
    }
}
