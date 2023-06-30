package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{preventAppSuspension: 'prevent-app-suspension', preventDisplaySleep: 'prevent-display-sleep'}/*union*/)""")
sealed external interface PowerSaveBlockerStartType {
    companion object {
        val preventAppSuspension: PowerSaveBlockerStartType
        val preventDisplaySleep: PowerSaveBlockerStartType
    }
}
