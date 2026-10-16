// Automatically generated - do not modify!

package tauri.apps.api.tray

/**
 * The kind of a {@linkcode TrayIconEvent}.
 *
 * - `Click`: a mouse button was pressed or released over the icon.
 * - `DoubleClick`: the icon was double clicked.
 * - `Enter`: the cursor entered the icon area.
 * - `Move`: the cursor moved inside the icon area.
 * - `Leave`: the cursor left the icon area.
 */
@js.union.JsUnion
sealed external interface TrayIconEventType

inline val TrayIconEventType.Companion.Click: TrayIconEventType
    get() = js.reflect.unsafeCast("Click")

inline val TrayIconEventType.Companion.DoubleClick: TrayIconEventType
    get() = js.reflect.unsafeCast("DoubleClick")

inline val TrayIconEventType.Companion.Enter: TrayIconEventType
    get() = js.reflect.unsafeCast("Enter")

inline val TrayIconEventType.Companion.Move: TrayIconEventType
    get() = js.reflect.unsafeCast("Move")

inline val TrayIconEventType.Companion.Leave: TrayIconEventType
    get() = js.reflect.unsafeCast("Leave")
