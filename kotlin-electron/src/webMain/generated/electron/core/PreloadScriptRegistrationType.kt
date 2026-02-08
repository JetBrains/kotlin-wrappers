// Automatically generated - do not modify!

package electron.core

sealed external interface PreloadScriptRegistrationType {
    companion object
}

inline val PreloadScriptRegistrationType.Companion.frame: PreloadScriptRegistrationType
    get() = js.reflect.unsafeCast("frame")

inline val PreloadScriptRegistrationType.Companion.serviceWorker: PreloadScriptRegistrationType
    get() = js.reflect.unsafeCast("service-worker")
