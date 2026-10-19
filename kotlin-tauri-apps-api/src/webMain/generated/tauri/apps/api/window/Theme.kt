// Automatically generated - do not modify!

package tauri.apps.api.window

/** The light or dark appearance of a window or of the system. */
@js.union.JsUnion
sealed /* union */
external interface Theme

inline val Theme.Companion.light: Theme
    get() = js.reflect.unsafeCast("light")

inline val Theme.Companion.dark: Theme
    get() = js.reflect.unsafeCast("dark")
