// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface PreloadScriptType

inline val PreloadScriptType.Companion.frame: PreloadScriptType
    get() = js.reflect.unsafeCast("frame")

inline val PreloadScriptType.Companion.serviceWorker: PreloadScriptType
    get() = js.reflect.unsafeCast("service-worker")
