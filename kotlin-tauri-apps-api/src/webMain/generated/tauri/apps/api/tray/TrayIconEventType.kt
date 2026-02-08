// Automatically generated - do not modify!

package tauri.apps.api.tray

sealed external interface TrayIconEventType {
    companion object
}

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
