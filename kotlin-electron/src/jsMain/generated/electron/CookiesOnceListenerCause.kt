package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{explicit: 'explicit', overwrite: 'overwrite', expired: 'expired', evicted: 'evicted', expiredOverwrite: 'expired-overwrite'}/*union*/)""")
sealed external interface CookiesOnceListenerCause {
    companion object {
        val explicit: CookiesOnceListenerCause
        val overwrite: CookiesOnceListenerCause
        val expired: CookiesOnceListenerCause
        val evicted: CookiesOnceListenerCause
        val expiredOverwrite: CookiesOnceListenerCause
    }
}
