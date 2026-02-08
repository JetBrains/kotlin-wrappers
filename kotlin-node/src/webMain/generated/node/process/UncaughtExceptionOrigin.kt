// Automatically generated - do not modify!

package node.process

sealed external interface UncaughtExceptionOrigin {
    companion object
}

inline val UncaughtExceptionOrigin.Companion.uncaughtException: UncaughtExceptionOrigin
    get() = js.reflect.unsafeCast("uncaughtException")

inline val UncaughtExceptionOrigin.Companion.unhandledRejection: UncaughtExceptionOrigin
    get() = js.reflect.unsafeCast("unhandledRejection")
