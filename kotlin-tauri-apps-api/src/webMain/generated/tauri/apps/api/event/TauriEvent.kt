// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/event")

package tauri.apps.api.event

/**
 * The built-in event names emitted by Tauri itself.
 *
 * These are the raw names behind the `on*` helpers of the `Window` and `Webview`
 * classes (e.g. `Window.onResized` listens to {@linkcode TauriEvent.WINDOW_RESIZED}).
 * Prefer those helpers when one exists, since they also decode the payload into
 * the matching class (`PhysicalSize`, `PhysicalPosition`, ...).
 *
 * @example
 * ```typescript
 * import { listen, TauriEvent } from '@tauri-apps/api/event';
 * const unlisten = await listen(TauriEvent.WINDOW_DESTROYED, (event) => {
 *   console.log('a window was destroyed', event.payload);
 * });
 * ```
 *
 * @since 1.1.0
 */
/* enum */
external class TauriEvent
private constructor() {
    companion object {
        /** A window was resized. Payload: the new inner size, in physical pixels. See `Window.onResized`. */
        val WINDOW_RESIZED: TauriEvent

        /** A window was moved. Payload: the new outer position, in physical pixels. See `Window.onMoved`. */
        val WINDOW_MOVED: TauriEvent

        /**
         * The user requested a window to be closed (e.g. clicked the close button).
         * See `Window.onCloseRequested`, which also handles preventing the close.
         */
        val WINDOW_CLOSE_REQUESTED: TauriEvent

        /** A window was destroyed, i.e. it is gone and its label can be reused. */
        val WINDOW_DESTROYED: TauriEvent

        /** A window gained focus. See `Window.onFocusChanged`. */
        val WINDOW_FOCUS: TauriEvent

        /** A window lost focus. See `Window.onFocusChanged`. */
        val WINDOW_BLUR: TauriEvent

        /**
         * The scale factor of the monitor a window is on changed, or the window moved to
         * a monitor with a different scale factor. See `Window.onScaleChanged`.
         */
        val WINDOW_SCALE_FACTOR_CHANGED: TauriEvent

        /** The system or window theme changed. See `Window.onThemeChanged`. */
        val WINDOW_THEME_CHANGED: TauriEvent

        /** A new window was created. */
        val WINDOW_CREATED: TauriEvent

        /**
         * The window's event loop was suspended.
         *
         * #### Platform-specific
         *
         * - **Android:** emitted when the activity is paused.
         * - **Other platforms:** never emitted.
         */
        val WINDOW_SUSPENDED: TauriEvent

        /**
         * The window's event loop was resumed after being suspended.
         *
         * #### Platform-specific
         *
         * - **Android:** emitted when the activity is resumed.
         * - **Other platforms:** never emitted.
         */
        val WINDOW_RESUMED: TauriEvent

        /** A new webview was created. */
        val WEBVIEW_CREATED: TauriEvent

        /** The user dragged files onto a webview. See `Webview.onDragDropEvent`. */
        val DRAG_ENTER: TauriEvent

        /** The user is moving dragged files over a webview. See `Webview.onDragDropEvent`. */
        val DRAG_OVER: TauriEvent

        /** The user dropped files onto a webview. See `Webview.onDragDropEvent`. */
        val DRAG_DROP: TauriEvent

        /** The drag operation left the webview or was cancelled. See `Webview.onDragDropEvent`. */
        val DRAG_LEAVE: TauriEvent
    }
}
