package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName(
    """(/*union*/{ALWAYS_ON_TOP_CHANGED: 'always-on-top-changed', APP_COMMAND: 'app-command', BLUR: 'blur', CLOSE: 'close', CLOSED: 'closed', ENTER_FULL_SCREEN: 'enter-full-screen', ENTER_HTML_FULL_SCREEN: 'enter-html-full-screen', FOCUS: 'focus', HIDE: 'hide', LEAVE_FULL_SCREEN: 'leave-full-screen', LEAVE_HTML_FULL_SCREEN: 'leave-html-full-screen', MAXIMIZE: 'maximize', MINIMIZE: 'minimize', MOVE: 'move', MOVED: 'moved', NEW_WINDOW_FOR_TAB: 'new-window-for-tab', PAGE_TITLE_UPDATED: 'page-title-updated', READY_TO_SHOW: 'ready-to-show', RESIZE: 'resize', RESIZED: 'resized', RESPONSIVE: 'responsive', RESTORE: 'restore', ROTATE_GESTURE: 'rotate-gesture', SCROLL_TOUCH_BEGIN: 'scroll-touch-begin', SCROLL_TOUCH_EDGE: 'scroll-touch-edge', SCROLL_TOUCH_END: 'scroll-touch-end', SESSION_END: 'session-end', SHEET_BEGIN: 'sheet-begin', SHEET_END: 'sheet-end', SHOW: 'show', SWIPE: 'swipe', SYSTEM_CONTEXT_MENU: 'system-context-menu', UNMAXIMIZE: 'unmaximize', UNRESPONSIVE: 'unresponsive', WILL_MOVE: 'will-move', WILL_RESIZE: 'will-resize'}/*union*/)"""
)
sealed external interface BrowserWindowEvent : node.events.EventType {
    object ALWAYS_ON_TOP_CHANGED : BrowserWindowEvent
    object APP_COMMAND : BrowserWindowEvent
    object BLUR : BrowserWindowEvent
    object CLOSE : BrowserWindowEvent
    object CLOSED : BrowserWindowEvent
    object ENTER_FULL_SCREEN : BrowserWindowEvent
    object ENTER_HTML_FULL_SCREEN : BrowserWindowEvent
    object FOCUS : BrowserWindowEvent
    object HIDE : BrowserWindowEvent
    object LEAVE_FULL_SCREEN : BrowserWindowEvent
    object LEAVE_HTML_FULL_SCREEN : BrowserWindowEvent
    object MAXIMIZE : BrowserWindowEvent
    object MINIMIZE : BrowserWindowEvent
    object MOVE : BrowserWindowEvent
    object MOVED : BrowserWindowEvent
    object NEW_WINDOW_FOR_TAB : BrowserWindowEvent
    object PAGE_TITLE_UPDATED : BrowserWindowEvent
    object READY_TO_SHOW : BrowserWindowEvent
    object RESIZE : BrowserWindowEvent
    object RESIZED : BrowserWindowEvent
    object RESPONSIVE : BrowserWindowEvent
    object RESTORE : BrowserWindowEvent
    object ROTATE_GESTURE : BrowserWindowEvent
    object SCROLL_TOUCH_BEGIN : BrowserWindowEvent
    object SCROLL_TOUCH_EDGE : BrowserWindowEvent
    object SCROLL_TOUCH_END : BrowserWindowEvent
    object SESSION_END : BrowserWindowEvent
    object SHEET_BEGIN : BrowserWindowEvent
    object SHEET_END : BrowserWindowEvent
    object SHOW : BrowserWindowEvent
    object SWIPE : BrowserWindowEvent
    object SYSTEM_CONTEXT_MENU : BrowserWindowEvent
    object UNMAXIMIZE : BrowserWindowEvent
    object UNRESPONSIVE : BrowserWindowEvent
    object WILL_MOVE : BrowserWindowEvent
    object WILL_RESIZE : BrowserWindowEvent
}
