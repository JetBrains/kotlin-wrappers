package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{noUserGestureRequired: 'no-user-gesture-required', userGestureRequired: 'user-gesture-required', documentUserActivationRequired: 'document-user-activation-required'}/*union*/)""")
sealed external interface WebPreferencesAutoplayPolicy {
    companion object {
        val noUserGestureRequired: WebPreferencesAutoplayPolicy
        val userGestureRequired: WebPreferencesAutoplayPolicy
        val documentUserActivationRequired: WebPreferencesAutoplayPolicy
    }
}
