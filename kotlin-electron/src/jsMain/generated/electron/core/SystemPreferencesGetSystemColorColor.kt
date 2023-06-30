package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{blue: 'blue', brown: 'brown', gray: 'gray', green: 'green', orange: 'orange', pink: 'pink', purple: 'purple', red: 'red', yellow: 'yellow'}/*union*/)""")
sealed external interface SystemPreferencesGetSystemColorColor {
    companion object {
        val blue: SystemPreferencesGetSystemColorColor
        val brown: SystemPreferencesGetSystemColorColor
        val gray: SystemPreferencesGetSystemColorColor
        val green: SystemPreferencesGetSystemColorColor
        val orange: SystemPreferencesGetSystemColorColor
        val pink: SystemPreferencesGetSystemColorColor
        val purple: SystemPreferencesGetSystemColorColor
        val red: SystemPreferencesGetSystemColorColor
        val yellow: SystemPreferencesGetSystemColorColor
    }
}
