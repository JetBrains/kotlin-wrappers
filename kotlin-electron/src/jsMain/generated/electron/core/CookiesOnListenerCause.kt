package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{explicit: 'explicit', overwrite: 'overwrite', expired: 'expired', evicted: 'evicted', expiredOverwrite: 'expired-overwrite'}/*union*/)""")
sealed external interface CookiesOnListenerCause {
    companion object {
        val explicit: CookiesOnListenerCause
        val overwrite: CookiesOnListenerCause
        val expired: CookiesOnListenerCause
        val evicted: CookiesOnListenerCause
        val expiredOverwrite: CookiesOnListenerCause
    }
}
