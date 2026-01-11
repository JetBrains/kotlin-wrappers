// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: LogicalPosition from "./dpi"
// unhandled import: LogicalSize from "./dpi"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"
// unhandled import: Position from "./dpi"
// unhandled import: Size from "./dpi"
// unhandled import: Event from "./event"
// unhandled import: EventName from "./event"
// unhandled import: EventCallback from "./event"
// unhandled import: UnlistenFn from "./event"
// unhandled import: EventTarget from "./event"
// unhandled import: WebviewWindow from "./webviewWindow"
// unhandled import: DragDropEvent from "./webview"
// unhandled import: Image from "./image"

/** The window effects configuration object
 *
 * @since 2.0.0
 */
external interface Effects {
    /**
     *  List of Window effects to apply to the Window.
     * Conflicting effects will apply the first one and ignore the rest.
     */
    var effects: js.array.ReadonlyArray<Effect>

    /**
     * Window effect state **macOS Only**
     */
    var state: EffectState?

    /**
     * Window effect corner radius **macOS Only**
     */
    var radius: Double?

    /**
     *  Window effect color. Affects {@link Effect.Blur} and {@link Effect.Acrylic} only
     * on Windows 10 v1903+. Doesn't have any effect on Windows 7 or Windows 11.
     */
    var color: Color?
}
