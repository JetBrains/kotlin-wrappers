package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName(
    """(/*union*/{ACCESSIBILITY_SUPPORT_CHANGED: 'accessibility-support-changed', ACTIVATE: 'activate', ACTIVITY_WAS_CONTINUED: 'activity-was-continued', BEFORE_QUIT: 'before-quit', BROWSER_WINDOW_BLUR: 'browser-window-blur', BROWSER_WINDOW_CREATED: 'browser-window-created', BROWSER_WINDOW_FOCUS: 'browser-window-focus', CERTIFICATE_ERROR: 'certificate-error', CHILD_PROCESS_GONE: 'child-process-gone', CONTINUE_ACTIVITY: 'continue-activity', CONTINUE_ACTIVITY_ERROR: 'continue-activity-error', DID_BECOME_ACTIVE: 'did-become-active', GPU_INFO_UPDATE: 'gpu-info-update', GPU_PROCESS_CRASHED: 'gpu-process-crashed', LOGIN: 'login', NEW_WINDOW_FOR_TAB: 'new-window-for-tab', OPEN_FILE: 'open-file', OPEN_URL: 'open-url', QUIT: 'quit', READY: 'ready', RENDER_PROCESS_GONE: 'render-process-gone', RENDERER_PROCESS_CRASHED: 'renderer-process-crashed', SECOND_INSTANCE: 'second-instance', SELECT_CLIENT_CERTIFICATE: 'select-client-certificate', SESSION_CREATED: 'session-created', UPDATE_ACTIVITY_STATE: 'update-activity-state', WEB_CONTENTS_CREATED: 'web-contents-created', WILL_CONTINUE_ACTIVITY: 'will-continue-activity', WILL_FINISH_LAUNCHING: 'will-finish-launching', WILL_QUIT: 'will-quit', WINDOW_ALL_CLOSED: 'window-all-closed'}/*union*/)"""
)
sealed external interface AppEvent : node.events.EventType {
    object ACCESSIBILITY_SUPPORT_CHANGED : AppEvent
    object ACTIVATE : AppEvent
    object ACTIVITY_WAS_CONTINUED : AppEvent
    object BEFORE_QUIT : AppEvent
    object BROWSER_WINDOW_BLUR : AppEvent
    object BROWSER_WINDOW_CREATED : AppEvent
    object BROWSER_WINDOW_FOCUS : AppEvent
    object CERTIFICATE_ERROR : AppEvent
    object CHILD_PROCESS_GONE : AppEvent
    object CONTINUE_ACTIVITY : AppEvent
    object CONTINUE_ACTIVITY_ERROR : AppEvent
    object DID_BECOME_ACTIVE : AppEvent
    object GPU_INFO_UPDATE : AppEvent
    object GPU_PROCESS_CRASHED : AppEvent
    object LOGIN : AppEvent
    object NEW_WINDOW_FOR_TAB : AppEvent
    object OPEN_FILE : AppEvent
    object OPEN_URL : AppEvent
    object QUIT : AppEvent
    object READY : AppEvent
    object RENDER_PROCESS_GONE : AppEvent
    object RENDERER_PROCESS_CRASHED : AppEvent
    object SECOND_INSTANCE : AppEvent
    object SELECT_CLIENT_CERTIFICATE : AppEvent
    object SESSION_CREATED : AppEvent
    object UPDATE_ACTIVITY_STATE : AppEvent
    object WEB_CONTENTS_CREATED : AppEvent
    object WILL_CONTINUE_ACTIVITY : AppEvent
    object WILL_FINISH_LAUNCHING : AppEvent
    object WILL_QUIT : AppEvent
    object WINDOW_ALL_CLOSED : AppEvent
}
