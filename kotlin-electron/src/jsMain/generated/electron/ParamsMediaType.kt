package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', image: 'image', audio: 'audio', video: 'video', canvas: 'canvas', file: 'file', plugin: 'plugin'}/*union*/)""")
sealed external interface ParamsMediaType {
    companion object {
        val none: ParamsMediaType
        val image: ParamsMediaType
        val audio: ParamsMediaType
        val video: ParamsMediaType
        val canvas: ParamsMediaType
        val file: ParamsMediaType
        val plugin: ParamsMediaType
    }
}
