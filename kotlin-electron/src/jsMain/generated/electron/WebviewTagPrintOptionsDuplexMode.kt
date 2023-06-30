package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{simplex: 'simplex', shortEdge: 'shortEdge', longEdge: 'longEdge'}/*union*/)""")
sealed external interface WebviewTagPrintOptionsDuplexMode {
    companion object {
        val simplex: WebviewTagPrintOptionsDuplexMode
        val shortEdge: WebviewTagPrintOptionsDuplexMode
        val longEdge: WebviewTagPrintOptionsDuplexMode
    }
}
