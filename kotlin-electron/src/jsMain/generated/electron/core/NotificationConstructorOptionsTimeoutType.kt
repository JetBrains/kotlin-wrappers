package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', never: 'never'}/*union*/)""")
sealed external interface NotificationConstructorOptionsTimeoutType {
    companion object {
        val default: NotificationConstructorOptionsTimeoutType
        val never: NotificationConstructorOptionsTimeoutType
    }
}
