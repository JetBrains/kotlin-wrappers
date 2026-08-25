// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface LoginItemSettingsStatus

inline val LoginItemSettingsStatus.Companion.notRegistered: LoginItemSettingsStatus
    get() = js.reflect.unsafeCast("not-registered")

inline val LoginItemSettingsStatus.Companion.enabled: LoginItemSettingsStatus
    get() = js.reflect.unsafeCast("enabled")

inline val LoginItemSettingsStatus.Companion.requiresApproval: LoginItemSettingsStatus
    get() = js.reflect.unsafeCast("requires-approval")

inline val LoginItemSettingsStatus.Companion.notFound: LoginItemSettingsStatus
    get() = js.reflect.unsafeCast("not-found")
