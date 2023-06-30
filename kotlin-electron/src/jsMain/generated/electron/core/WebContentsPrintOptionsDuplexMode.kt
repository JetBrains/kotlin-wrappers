package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{simplex: 'simplex', shortEdge: 'shortEdge', longEdge: 'longEdge'}/*union*/)""")
sealed external interface WebContentsPrintOptionsDuplexMode {
    companion object {
        val simplex: WebContentsPrintOptionsDuplexMode
        val shortEdge: WebContentsPrintOptionsDuplexMode
        val longEdge: WebContentsPrintOptionsDuplexMode
    }
}
