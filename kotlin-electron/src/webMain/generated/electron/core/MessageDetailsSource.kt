// Automatically generated - do not modify!

package electron.core

sealed external interface MessageDetailsSource {
    companion object
}

inline val MessageDetailsSource.Companion.javascript: MessageDetailsSource
    get() = js.reflect.unsafeCast("javascript")

inline val MessageDetailsSource.Companion.xml: MessageDetailsSource
    get() = js.reflect.unsafeCast("xml")

inline val MessageDetailsSource.Companion.network: MessageDetailsSource
    get() = js.reflect.unsafeCast("network")

inline val MessageDetailsSource.Companion.consoleApi: MessageDetailsSource
    get() = js.reflect.unsafeCast("console-api")

inline val MessageDetailsSource.Companion.storage: MessageDetailsSource
    get() = js.reflect.unsafeCast("storage")

inline val MessageDetailsSource.Companion.rendering: MessageDetailsSource
    get() = js.reflect.unsafeCast("rendering")

inline val MessageDetailsSource.Companion.security: MessageDetailsSource
    get() = js.reflect.unsafeCast("security")

inline val MessageDetailsSource.Companion.deprecation: MessageDetailsSource
    get() = js.reflect.unsafeCast("deprecation")

inline val MessageDetailsSource.Companion.worker: MessageDetailsSource
    get() = js.reflect.unsafeCast("worker")

inline val MessageDetailsSource.Companion.violation: MessageDetailsSource
    get() = js.reflect.unsafeCast("violation")

inline val MessageDetailsSource.Companion.intervention: MessageDetailsSource
    get() = js.reflect.unsafeCast("intervention")

inline val MessageDetailsSource.Companion.recommendation: MessageDetailsSource
    get() = js.reflect.unsafeCast("recommendation")

inline val MessageDetailsSource.Companion.other: MessageDetailsSource
    get() = js.reflect.unsafeCast("other")
