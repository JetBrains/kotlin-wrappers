package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{none: 'none', info: 'info', warning: 'warning', error: 'error', custom: 'custom'}/*union*/)""")
sealed external interface DisplayBalloonOptionsIconType {
    companion object {
        val none: DisplayBalloonOptionsIconType
        val info: DisplayBalloonOptionsIconType
        val warning: DisplayBalloonOptionsIconType
        val error: DisplayBalloonOptionsIconType
        val custom: DisplayBalloonOptionsIconType
    }
}
