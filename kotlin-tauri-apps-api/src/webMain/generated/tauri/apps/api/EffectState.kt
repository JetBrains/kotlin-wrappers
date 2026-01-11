// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

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

/**
 * Window effect state **macOS only**
 *
 * @see https://developer.apple.com/documentation/appkit/nsvisualeffectview/state
 *
 * @since 2.0.0
 */
sealed external interface EffectState {
    companion object {
        /**
         *  Make window effect state follow the window's active state **macOS only**
         */
        val FollowsWindowActiveState: EffectState

        /**
         *  Make window effect state always active **macOS only**
         */
        val Active: EffectState

        /**
         *  Make window effect state always inactive **macOS only**
         */
        val Inactive: EffectState
    }
}
