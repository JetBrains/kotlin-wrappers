// Automatically generated - do not modify!

package electron.core

sealed external interface HandlerDetailsDisposition {
    companion object
}

inline val HandlerDetailsDisposition.Companion.default: HandlerDetailsDisposition
    get() = js.reflect.unsafeCast("default")

inline val HandlerDetailsDisposition.Companion.foregroundTab: HandlerDetailsDisposition
    get() = js.reflect.unsafeCast("foreground-tab")

inline val HandlerDetailsDisposition.Companion.backgroundTab: HandlerDetailsDisposition
    get() = js.reflect.unsafeCast("background-tab")

inline val HandlerDetailsDisposition.Companion.newWindow: HandlerDetailsDisposition
    get() = js.reflect.unsafeCast("new-window")

inline val HandlerDetailsDisposition.Companion.other: HandlerDetailsDisposition
    get() = js.reflect.unsafeCast("other")
