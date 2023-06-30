package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName(
    """(/*union*/{BEFORE_INPUT_EVENT: 'before-input-event', BLUR: 'blur', CERTIFICATE_ERROR: 'certificate-error', CONSOLE_MESSAGE: 'console-message', CONTENT_BOUNDS_UPDATED: 'content-bounds-updated', CONTEXT_MENU: 'context-menu', CRASHED: 'crashed', CURSOR_CHANGED: 'cursor-changed', DESTROYED: 'destroyed', DEVTOOLS_CLOSED: 'devtools-closed', DEVTOOLS_FOCUSED: 'devtools-focused', DEVTOOLS_OPEN_URL: 'devtools-open-url', DEVTOOLS_OPENED: 'devtools-opened', DEVTOOLS_RELOAD_PAGE: 'devtools-reload-page', DID_ATTACH_WEBVIEW: 'did-attach-webview', DID_CHANGE_THEME_COLOR: 'did-change-theme-color', DID_CREATE_WINDOW: 'did-create-window', DID_FAIL_LOAD: 'did-fail-load', DID_FAIL_PROVISIONAL_LOAD: 'did-fail-provisional-load', DID_FINISH_LOAD: 'did-finish-load', DID_FRAME_FINISH_LOAD: 'did-frame-finish-load', DID_FRAME_NAVIGATE: 'did-frame-navigate', DID_NAVIGATE: 'did-navigate', DID_NAVIGATE_IN_PAGE: 'did-navigate-in-page', DID_REDIRECT_NAVIGATION: 'did-redirect-navigation', DID_START_LOADING: 'did-start-loading', DID_START_NAVIGATION: 'did-start-navigation', DID_STOP_LOADING: 'did-stop-loading', DOM_READY: 'dom-ready', ENTER_HTML_FULL_SCREEN: 'enter-html-full-screen', FOCUS: 'focus', FOUND_IN_PAGE: 'found-in-page', FRAME_CREATED: 'frame-created', INPUT_EVENT: 'input-event', IPC_MESSAGE: 'ipc-message', IPC_MESSAGE_SYNC: 'ipc-message-sync', LEAVE_HTML_FULL_SCREEN: 'leave-html-full-screen', LOGIN: 'login', MEDIA_PAUSED: 'media-paused', MEDIA_STARTED_PLAYING: 'media-started-playing', PAGE_FAVICON_UPDATED: 'page-favicon-updated', PAGE_TITLE_UPDATED: 'page-title-updated', PAINT: 'paint', PLUGIN_CRASHED: 'plugin-crashed', PREFERRED_SIZE_CHANGED: 'preferred-size-changed', PRELOAD_ERROR: 'preload-error', RENDER_PROCESS_GONE: 'render-process-gone', RESPONSIVE: 'responsive', SELECT_BLUETOOTH_DEVICE: 'select-bluetooth-device', SELECT_CLIENT_CERTIFICATE: 'select-client-certificate', UNRESPONSIVE: 'unresponsive', UPDATE_TARGET_URL: 'update-target-url', WILL_ATTACH_WEBVIEW: 'will-attach-webview', WILL_NAVIGATE: 'will-navigate', WILL_PREVENT_UNLOAD: 'will-prevent-unload', WILL_REDIRECT: 'will-redirect', ZOOM_CHANGED: 'zoom-changed'}/*union*/)"""
)
sealed external interface WebContentsEvent : node.events.EventType {
    object BEFORE_INPUT_EVENT : WebContentsEvent
    object BLUR : WebContentsEvent
    object CERTIFICATE_ERROR : WebContentsEvent
    object CONSOLE_MESSAGE : WebContentsEvent
    object CONTENT_BOUNDS_UPDATED : WebContentsEvent
    object CONTEXT_MENU : WebContentsEvent
    object CRASHED : WebContentsEvent
    object CURSOR_CHANGED : WebContentsEvent
    object DESTROYED : WebContentsEvent
    object DEVTOOLS_CLOSED : WebContentsEvent
    object DEVTOOLS_FOCUSED : WebContentsEvent
    object DEVTOOLS_OPEN_URL : WebContentsEvent
    object DEVTOOLS_OPENED : WebContentsEvent
    object DEVTOOLS_RELOAD_PAGE : WebContentsEvent
    object DID_ATTACH_WEBVIEW : WebContentsEvent
    object DID_CHANGE_THEME_COLOR : WebContentsEvent
    object DID_CREATE_WINDOW : WebContentsEvent
    object DID_FAIL_LOAD : WebContentsEvent
    object DID_FAIL_PROVISIONAL_LOAD : WebContentsEvent
    object DID_FINISH_LOAD : WebContentsEvent
    object DID_FRAME_FINISH_LOAD : WebContentsEvent
    object DID_FRAME_NAVIGATE : WebContentsEvent
    object DID_NAVIGATE : WebContentsEvent
    object DID_NAVIGATE_IN_PAGE : WebContentsEvent
    object DID_REDIRECT_NAVIGATION : WebContentsEvent
    object DID_START_LOADING : WebContentsEvent
    object DID_START_NAVIGATION : WebContentsEvent
    object DID_STOP_LOADING : WebContentsEvent
    object DOM_READY : WebContentsEvent
    object ENTER_HTML_FULL_SCREEN : WebContentsEvent
    object FOCUS : WebContentsEvent
    object FOUND_IN_PAGE : WebContentsEvent
    object FRAME_CREATED : WebContentsEvent
    object INPUT_EVENT : WebContentsEvent
    object IPC_MESSAGE : WebContentsEvent
    object IPC_MESSAGE_SYNC : WebContentsEvent
    object LEAVE_HTML_FULL_SCREEN : WebContentsEvent
    object LOGIN : WebContentsEvent
    object MEDIA_PAUSED : WebContentsEvent
    object MEDIA_STARTED_PLAYING : WebContentsEvent
    object PAGE_FAVICON_UPDATED : WebContentsEvent
    object PAGE_TITLE_UPDATED : WebContentsEvent
    object PAINT : WebContentsEvent
    object PLUGIN_CRASHED : WebContentsEvent
    object PREFERRED_SIZE_CHANGED : WebContentsEvent
    object PRELOAD_ERROR : WebContentsEvent
    object RENDER_PROCESS_GONE : WebContentsEvent
    object RESPONSIVE : WebContentsEvent
    object SELECT_BLUETOOTH_DEVICE : WebContentsEvent
    object SELECT_CLIENT_CERTIFICATE : WebContentsEvent
    object UNRESPONSIVE : WebContentsEvent
    object UPDATE_TARGET_URL : WebContentsEvent
    object WILL_ATTACH_WEBVIEW : WebContentsEvent
    object WILL_NAVIGATE : WebContentsEvent
    object WILL_PREVENT_UNLOAD : WebContentsEvent
    object WILL_REDIRECT : WebContentsEvent
    object ZOOM_CHANGED : WebContentsEvent
}
