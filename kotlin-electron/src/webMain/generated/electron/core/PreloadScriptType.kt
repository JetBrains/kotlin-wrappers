// Automatically generated - do not modify!

package electron.core

sealed external interface PreloadScriptType {
    companion object
}

inline val PreloadScriptType.Companion.frame: PreloadScriptType
    get() = js.reflect.unsafeCast("frame")

inline val PreloadScriptType.Companion.serviceWorker: PreloadScriptType
    get() = js.reflect.unsafeCast("service-worker")
