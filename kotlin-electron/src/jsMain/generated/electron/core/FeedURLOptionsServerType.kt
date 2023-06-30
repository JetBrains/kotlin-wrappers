package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{json: 'json', default: 'default'}/*union*/)""")
sealed external interface FeedURLOptionsServerType {
    companion object {
        val json: FeedURLOptionsServerType
        val default: FeedURLOptionsServerType
    }
}
