package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{single: 'single', multiple: 'multiple', buttons: 'buttons'}/*union*/)""")
sealed external interface TouchBarSegmentedControlMode {
    companion object {
        val single: TouchBarSegmentedControlMode
        val multiple: TouchBarSegmentedControlMode
        val buttons: TouchBarSegmentedControlMode
    }
}
