// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: Menu from "./menu"
// unhandled import: Submenu from "./menu"
// unhandled import: Resource from "./core"
// unhandled import: Image from "./image"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"

/**
 * Describes a tray icon event.
 *
 * #### Platform-specific:
 *
 * - **Linux**: Unsupported. The event is not emitted even though the icon is shown,
 * the icon will still show a context menu on right click.
 */
typealias TrayIconEvent = Any // (TrayIconEventBase<'Click'> & TrayIconClickEvent) | (TrayIconEventBase<'DoubleClick'> & Omit<TrayIconClickEvent, 'buttonState'>) | TrayIconEventBase<'Enter'> | TrayIconEventBase<'Move'> | TrayIconEventBase<'Leave'>
