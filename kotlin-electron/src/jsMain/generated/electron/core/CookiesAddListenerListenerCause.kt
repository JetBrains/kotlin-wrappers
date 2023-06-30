package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{explicit: 'explicit', overwrite: 'overwrite', expired: 'expired', evicted: 'evicted', expiredOverwrite: 'expired-overwrite'}/*union*/)""")
sealed external interface CookiesAddListenerListenerCause {
    companion object {
        val explicit: CookiesAddListenerListenerCause
        val overwrite: CookiesAddListenerListenerCause
        val expired: CookiesAddListenerListenerCause
        val evicted: CookiesAddListenerListenerCause
        val expiredOverwrite: CookiesAddListenerListenerCause
    }
}
