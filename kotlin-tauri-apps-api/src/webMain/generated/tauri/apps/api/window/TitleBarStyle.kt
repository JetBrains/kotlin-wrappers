// Automatically generated - do not modify!

package tauri.apps.api.window

/**
 * The style of the window title bar. **macOS only**
 *
 * - `visible`: the standard title bar.
 * - `transparent`: the title bar is transparent but the traffic lights stay in place.
 * - `overlay`: the content extends under a transparent title bar, leaving only the
 *   traffic lights visible.
 */
@js.union.JsUnion
sealed /* union */
external interface TitleBarStyle

inline val TitleBarStyle.Companion.visible: TitleBarStyle
    get() = js.reflect.unsafeCast("visible")

inline val TitleBarStyle.Companion.transparent: TitleBarStyle
    get() = js.reflect.unsafeCast("transparent")

inline val TitleBarStyle.Companion.overlay: TitleBarStyle
    get() = js.reflect.unsafeCast("overlay")
