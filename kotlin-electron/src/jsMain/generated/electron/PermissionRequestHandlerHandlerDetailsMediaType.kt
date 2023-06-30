package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{video: 'video', audio: 'audio'}/*union*/)""")
sealed external interface PermissionRequestHandlerHandlerDetailsMediaType {
    companion object {
        val video: PermissionRequestHandlerHandlerDetailsMediaType
        val audio: PermissionRequestHandlerHandlerDetailsMediaType
    }
}
