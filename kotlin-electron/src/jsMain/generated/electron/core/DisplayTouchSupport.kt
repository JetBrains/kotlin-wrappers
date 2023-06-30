package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{available: 'available', unavailable: 'unavailable', unknown: 'unknown'}/*union*/)""")
sealed external interface DisplayTouchSupport {
    companion object {
        val available: DisplayTouchSupport
        val unavailable: DisplayTouchSupport
        val unknown: DisplayTouchSupport
    }
}
