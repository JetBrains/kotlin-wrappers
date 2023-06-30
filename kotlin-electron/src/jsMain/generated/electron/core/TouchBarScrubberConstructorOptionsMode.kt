package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{fixed: 'fixed', free: 'free'}/*union*/)""")
sealed external interface TouchBarScrubberConstructorOptionsMode {
    companion object {
        val fixed: TouchBarScrubberConstructorOptionsMode
        val free: TouchBarScrubberConstructorOptionsMode
    }
}
