// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface PreloadScriptRegistrationType

inline val PreloadScriptRegistrationType.Companion.frame: PreloadScriptRegistrationType
    get() = js.reflect.unsafeCast("frame")

inline val PreloadScriptRegistrationType.Companion.serviceWorker: PreloadScriptRegistrationType
    get() = js.reflect.unsafeCast("service-worker")
