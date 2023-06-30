package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{available: 'available', unavailable: 'unavailable', unknown: 'unknown'}/*union*/)""")
sealed external interface DisplayAccelerometerSupport {
    companion object {
        val available: DisplayAccelerometerSupport
        val unavailable: DisplayAccelerometerSupport
        val unknown: DisplayAccelerometerSupport
    }
}
