// Automatically generated - do not modify!

package electron.core

sealed external interface WebContentsGetTypeResult {
    companion object
}

inline val WebContentsGetTypeResult.Companion.backgroundPage: WebContentsGetTypeResult
    get() = js.reflect.unsafeCast("backgroundPage")

inline val WebContentsGetTypeResult.Companion.window: WebContentsGetTypeResult
    get() = js.reflect.unsafeCast("window")

inline val WebContentsGetTypeResult.Companion.browserView: WebContentsGetTypeResult
    get() = js.reflect.unsafeCast("browserView")

inline val WebContentsGetTypeResult.Companion.remote: WebContentsGetTypeResult
    get() = js.reflect.unsafeCast("remote")

inline val WebContentsGetTypeResult.Companion.webview: WebContentsGetTypeResult
    get() = js.reflect.unsafeCast("webview")

inline val WebContentsGetTypeResult.Companion.offscreen: WebContentsGetTypeResult
    get() = js.reflect.unsafeCast("offscreen")
