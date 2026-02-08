// Automatically generated - do not modify!

package electron.core

sealed external interface WebRequestFilterType {
    companion object
}

inline val WebRequestFilterType.Companion.mainFrame: WebRequestFilterType
    get() = js.reflect.unsafeCast("mainFrame")

inline val WebRequestFilterType.Companion.subFrame: WebRequestFilterType
    get() = js.reflect.unsafeCast("subFrame")

inline val WebRequestFilterType.Companion.stylesheet: WebRequestFilterType
    get() = js.reflect.unsafeCast("stylesheet")

inline val WebRequestFilterType.Companion.script: WebRequestFilterType
    get() = js.reflect.unsafeCast("script")

inline val WebRequestFilterType.Companion.image: WebRequestFilterType
    get() = js.reflect.unsafeCast("image")

inline val WebRequestFilterType.Companion.font: WebRequestFilterType
    get() = js.reflect.unsafeCast("font")

inline val WebRequestFilterType.Companion.`object`: WebRequestFilterType
    get() = js.reflect.unsafeCast("object")

inline val WebRequestFilterType.Companion.xhr: WebRequestFilterType
    get() = js.reflect.unsafeCast("xhr")

inline val WebRequestFilterType.Companion.ping: WebRequestFilterType
    get() = js.reflect.unsafeCast("ping")

inline val WebRequestFilterType.Companion.cspReport: WebRequestFilterType
    get() = js.reflect.unsafeCast("cspReport")

inline val WebRequestFilterType.Companion.media: WebRequestFilterType
    get() = js.reflect.unsafeCast("media")

inline val WebRequestFilterType.Companion.webSocket: WebRequestFilterType
    get() = js.reflect.unsafeCast("webSocket")
