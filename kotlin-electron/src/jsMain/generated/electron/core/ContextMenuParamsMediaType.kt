package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', image: 'image', audio: 'audio', video: 'video', canvas: 'canvas', file: 'file', plugin: 'plugin'}/*union*/)""")
sealed external interface ContextMenuParamsMediaType {
    companion object {
        val none: ContextMenuParamsMediaType
        val image: ContextMenuParamsMediaType
        val audio: ContextMenuParamsMediaType
        val video: ContextMenuParamsMediaType
        val canvas: ContextMenuParamsMediaType
        val file: ContextMenuParamsMediaType
        val plugin: ContextMenuParamsMediaType
    }
}
