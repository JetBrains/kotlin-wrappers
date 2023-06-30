package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{explicit: 'explicit', overwrite: 'overwrite', expired: 'expired', evicted: 'evicted', expiredOverwrite: 'expired-overwrite'}/*union*/)""")
sealed external interface CookiesRemoveListenerListenerCause {
    companion object {
        val explicit: CookiesRemoveListenerListenerCause
        val overwrite: CookiesRemoveListenerListenerCause
        val expired: CookiesRemoveListenerListenerCause
        val evicted: CookiesRemoveListenerListenerCause
        val expiredOverwrite: CookiesRemoveListenerListenerCause
    }
}
