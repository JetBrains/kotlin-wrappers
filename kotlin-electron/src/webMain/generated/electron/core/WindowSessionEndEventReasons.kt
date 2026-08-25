// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface WindowSessionEndEventReasons

inline val WindowSessionEndEventReasons.Companion.shutdown: WindowSessionEndEventReasons
    get() = js.reflect.unsafeCast("shutdown")

inline val WindowSessionEndEventReasons.Companion.closeApp: WindowSessionEndEventReasons
    get() = js.reflect.unsafeCast("close-app")

inline val WindowSessionEndEventReasons.Companion.critical: WindowSessionEndEventReasons
    get() = js.reflect.unsafeCast("critical")

inline val WindowSessionEndEventReasons.Companion.logoff: WindowSessionEndEventReasons
    get() = js.reflect.unsafeCast("logoff")
