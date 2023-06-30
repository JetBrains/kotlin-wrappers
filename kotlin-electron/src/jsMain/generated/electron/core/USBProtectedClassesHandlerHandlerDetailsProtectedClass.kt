package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{audio: 'audio', audioVideo: 'audio-video', hid: 'hid', massStorage: 'mass-storage', smartCard: 'smart-card', video: 'video', wireless: 'wireless'}/*union*/)""")
sealed external interface USBProtectedClassesHandlerHandlerDetailsProtectedClass {
    companion object {
        val audio: USBProtectedClassesHandlerHandlerDetailsProtectedClass
        val audioVideo: USBProtectedClassesHandlerHandlerDetailsProtectedClass
        val hid: USBProtectedClassesHandlerHandlerDetailsProtectedClass
        val massStorage: USBProtectedClassesHandlerHandlerDetailsProtectedClass
        val smartCard: USBProtectedClassesHandlerHandlerDetailsProtectedClass
        val video: USBProtectedClassesHandlerHandlerDetailsProtectedClass
        val wireless: USBProtectedClassesHandlerHandlerDetailsProtectedClass
    }
}
