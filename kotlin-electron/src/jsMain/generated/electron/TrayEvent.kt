package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{BALLOON_CLICK: 'balloon-click', BALLOON_CLOSED: 'balloon-closed', BALLOON_SHOW: 'balloon-show', CLICK: 'click', DOUBLE_CLICK: 'double-click', DRAG_END: 'drag-end', DRAG_ENTER: 'drag-enter', DRAG_LEAVE: 'drag-leave', DROP: 'drop', DROP_FILES: 'drop-files', DROP_TEXT: 'drop-text', MOUSE_DOWN: 'mouse-down', MOUSE_ENTER: 'mouse-enter', MOUSE_LEAVE: 'mouse-leave', MOUSE_MOVE: 'mouse-move', MOUSE_UP: 'mouse-up', RIGHT_CLICK: 'right-click'}/*union*/)""")
sealed external interface TrayEvent : node.events.EventType {
    object BALLOON_CLICK : TrayEvent
    object BALLOON_CLOSED : TrayEvent
    object BALLOON_SHOW : TrayEvent
    object CLICK : TrayEvent
    object DOUBLE_CLICK : TrayEvent
    object DRAG_END : TrayEvent
    object DRAG_ENTER : TrayEvent
    object DRAG_LEAVE : TrayEvent
    object DROP : TrayEvent
    object DROP_FILES : TrayEvent
    object DROP_TEXT : TrayEvent
    object MOUSE_DOWN : TrayEvent
    object MOUSE_ENTER : TrayEvent
    object MOUSE_LEAVE : TrayEvent
    object MOUSE_MOVE : TrayEvent
    object MOUSE_UP : TrayEvent
    object RIGHT_CLICK : TrayEvent
}
