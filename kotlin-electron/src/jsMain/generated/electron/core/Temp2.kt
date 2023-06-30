package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{dark: 'dark', light: 'light'}/*union*/)""")
sealed external interface Temp2 {
    companion object {
        val dark: Temp2
        val light: Temp2
    }
}
