package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{clipboardRead: 'clipboard-read', clipboardSanitizedWrite: 'clipboard-sanitized-write', media: 'media', displayCapture: 'display-capture', mediaKeySystem: 'mediaKeySystem', geolocation: 'geolocation', notifications: 'notifications', midi: 'midi', midiSysex: 'midiSysex', pointerLock: 'pointerLock', fullscreen: 'fullscreen', openExternal: 'openExternal', windowManagement: 'window-management', unknown: 'unknown'}/*union*/)""")
sealed external interface Temp1 {
    companion object {
        val clipboardRead: Temp1
        val clipboardSanitizedWrite: Temp1
        val media: Temp1
        val displayCapture: Temp1
        val mediaKeySystem: Temp1
        val geolocation: Temp1
        val notifications: Temp1
        val midi: Temp1
        val midiSysex: Temp1
        val pointerLock: Temp1
        val fullscreen: Temp1
        val openExternal: Temp1
        val windowManagement: Temp1
        val unknown: Temp1
    }
}
