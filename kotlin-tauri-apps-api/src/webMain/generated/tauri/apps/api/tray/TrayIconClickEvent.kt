// Automatically generated - do not modify!

package tauri.apps.api.tray

/** The extra fields of the `Click` and `DoubleClick` {@linkcode TrayIconEvent} variants. */
external interface TrayIconClickEvent {
    /** Mouse button that triggered this event. */
    var button: MouseButton

    /** Mouse button state when this event was triggered. */
    var buttonState: MouseButtonState
}
