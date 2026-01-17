// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/event")

package tauri.apps.api.event

/**
 * @since 1.1.0
 */
sealed external interface TauriEvent {
    companion object {
        val WINDOW_RESIZED: TauriEvent
        val WINDOW_MOVED: TauriEvent
        val WINDOW_CLOSE_REQUESTED: TauriEvent
        val WINDOW_DESTROYED: TauriEvent
        val WINDOW_FOCUS: TauriEvent
        val WINDOW_BLUR: TauriEvent
        val WINDOW_SCALE_FACTOR_CHANGED: TauriEvent
        val WINDOW_THEME_CHANGED: TauriEvent
        val WINDOW_CREATED: TauriEvent
        val WEBVIEW_CREATED: TauriEvent
        val DRAG_ENTER: TauriEvent
        val DRAG_OVER: TauriEvent
        val DRAG_DROP: TauriEvent
        val DRAG_LEAVE: TauriEvent
    }
}
