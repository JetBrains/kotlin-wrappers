// Automatically generated - do not modify!

package electron.core

sealed external interface ConfigMaxVersion {
    companion object
}

inline val ConfigMaxVersion.Companion.`tls1-2`: ConfigMaxVersion
    get() = js.reflect.unsafeCast("tls1.2")

inline val ConfigMaxVersion.Companion.`tls1-3`: ConfigMaxVersion
    get() = js.reflect.unsafeCast("tls1.3")
