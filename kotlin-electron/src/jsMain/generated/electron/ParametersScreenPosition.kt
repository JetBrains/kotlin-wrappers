package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{desktop: 'desktop', mobile: 'mobile'}/*union*/)""")
sealed external interface ParametersScreenPosition {
    companion object {
        val desktop: ParametersScreenPosition
        val mobile: ParametersScreenPosition
    }
}
