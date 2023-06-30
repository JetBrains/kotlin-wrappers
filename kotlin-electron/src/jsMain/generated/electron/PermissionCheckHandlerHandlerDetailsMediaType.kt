package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{video: 'video', audio: 'audio', unknown: 'unknown'}/*union*/)""")
sealed external interface PermissionCheckHandlerHandlerDetailsMediaType {
    companion object {
        val video: PermissionCheckHandlerHandlerDetailsMediaType
        val audio: PermissionCheckHandlerHandlerDetailsMediaType
        val unknown: PermissionCheckHandlerHandlerDetailsMediaType
    }
}
