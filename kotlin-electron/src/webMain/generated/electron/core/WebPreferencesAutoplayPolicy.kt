// Automatically generated - do not modify!

package electron.core

sealed external interface WebPreferencesAutoplayPolicy {
    companion object
}

inline val WebPreferencesAutoplayPolicy.Companion.noUserGestureRequired: WebPreferencesAutoplayPolicy
    get() = js.reflect.unsafeCast("no-user-gesture-required")

inline val WebPreferencesAutoplayPolicy.Companion.userGestureRequired: WebPreferencesAutoplayPolicy
    get() = js.reflect.unsafeCast("user-gesture-required")

inline val WebPreferencesAutoplayPolicy.Companion.documentUserActivationRequired: WebPreferencesAutoplayPolicy
    get() = js.reflect.unsafeCast("document-user-activation-required")
