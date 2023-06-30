package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName(
    """(/*union*/{LOAD_COMMIT: 'load-commit', DID_FINISH_LOAD: 'did-finish-load', DID_FAIL_LOAD: 'did-fail-load', DID_FRAME_FINISH_LOAD: 'did-frame-finish-load', DID_START_LOADING: 'did-start-loading', DID_STOP_LOADING: 'did-stop-loading', DID_ATTACH: 'did-attach', DOM_READY: 'dom-ready', PAGE_TITLE_UPDATED: 'page-title-updated', PAGE_FAVICON_UPDATED: 'page-favicon-updated', ENTER_HTML_FULL_SCREEN: 'enter-html-full-screen', LEAVE_HTML_FULL_SCREEN: 'leave-html-full-screen', CONSOLE_MESSAGE: 'console-message', FOUND_IN_PAGE: 'found-in-page', WILL_NAVIGATE: 'will-navigate', DID_START_NAVIGATION: 'did-start-navigation', DID_REDIRECT_NAVIGATION: 'did-redirect-navigation', DID_NAVIGATE: 'did-navigate', DID_FRAME_NAVIGATE: 'did-frame-navigate', DID_NAVIGATE_IN_PAGE: 'did-navigate-in-page', CLOSE: 'close', IPC_MESSAGE: 'ipc-message', CRASHED: 'crashed', PLUGIN_CRASHED: 'plugin-crashed', DESTROYED: 'destroyed', MEDIA_STARTED_PLAYING: 'media-started-playing', MEDIA_PAUSED: 'media-paused', DID_CHANGE_THEME_COLOR: 'did-change-theme-color', UPDATE_TARGET_URL: 'update-target-url', DEVTOOLS_OPEN_URL: 'devtools-open-url', DEVTOOLS_OPENED: 'devtools-opened', DEVTOOLS_CLOSED: 'devtools-closed', DEVTOOLS_FOCUSED: 'devtools-focused', CONTEXT_MENU: 'context-menu'}/*union*/)"""
)
sealed external interface WebviewTagEvent : node.events.EventType {
    object LOAD_COMMIT : WebviewTagEvent
    object DID_FINISH_LOAD : WebviewTagEvent
    object DID_FAIL_LOAD : WebviewTagEvent
    object DID_FRAME_FINISH_LOAD : WebviewTagEvent
    object DID_START_LOADING : WebviewTagEvent
    object DID_STOP_LOADING : WebviewTagEvent
    object DID_ATTACH : WebviewTagEvent
    object DOM_READY : WebviewTagEvent
    object PAGE_TITLE_UPDATED : WebviewTagEvent
    object PAGE_FAVICON_UPDATED : WebviewTagEvent
    object ENTER_HTML_FULL_SCREEN : WebviewTagEvent
    object LEAVE_HTML_FULL_SCREEN : WebviewTagEvent
    object CONSOLE_MESSAGE : WebviewTagEvent
    object FOUND_IN_PAGE : WebviewTagEvent
    object WILL_NAVIGATE : WebviewTagEvent
    object DID_START_NAVIGATION : WebviewTagEvent
    object DID_REDIRECT_NAVIGATION : WebviewTagEvent
    object DID_NAVIGATE : WebviewTagEvent
    object DID_FRAME_NAVIGATE : WebviewTagEvent
    object DID_NAVIGATE_IN_PAGE : WebviewTagEvent
    object CLOSE : WebviewTagEvent
    object IPC_MESSAGE : WebviewTagEvent
    object CRASHED : WebviewTagEvent
    object PLUGIN_CRASHED : WebviewTagEvent
    object DESTROYED : WebviewTagEvent
    object MEDIA_STARTED_PLAYING : WebviewTagEvent
    object MEDIA_PAUSED : WebviewTagEvent
    object DID_CHANGE_THEME_COLOR : WebviewTagEvent
    object UPDATE_TARGET_URL : WebviewTagEvent
    object DEVTOOLS_OPEN_URL : WebviewTagEvent
    object DEVTOOLS_OPENED : WebviewTagEvent
    object DEVTOOLS_CLOSED : WebviewTagEvent
    object DEVTOOLS_FOCUSED : WebviewTagEvent
    object CONTEXT_MENU : WebviewTagEvent
}
