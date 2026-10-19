// Automatically generated - do not modify!

package tauri.apps.api.tray

/** Whether the mouse button was pressed (`Down`) or released (`Up`). */
@js.union.JsUnion
sealed /* union */
external interface MouseButtonState

inline val MouseButtonState.Companion.Up: MouseButtonState
    get() = js.reflect.unsafeCast("Up")

inline val MouseButtonState.Companion.Down: MouseButtonState
    get() = js.reflect.unsafeCast("Down")
