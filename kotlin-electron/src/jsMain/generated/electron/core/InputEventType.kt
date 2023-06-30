package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName(
    """(/*union*/{undefined: 'undefined', mouseDown: 'mouseDown', mouseUp: 'mouseUp', mouseMove: 'mouseMove', mouseEnter: 'mouseEnter', mouseLeave: 'mouseLeave', contextMenu: 'contextMenu', mouseWheel: 'mouseWheel', rawKeyDown: 'rawKeyDown', keyDown: 'keyDown', keyUp: 'keyUp', char: 'char', gestureScrollBegin: 'gestureScrollBegin', gestureScrollEnd: 'gestureScrollEnd', gestureScrollUpdate: 'gestureScrollUpdate', gestureFlingStart: 'gestureFlingStart', gestureFlingCancel: 'gestureFlingCancel', gesturePinchBegin: 'gesturePinchBegin', gesturePinchEnd: 'gesturePinchEnd', gesturePinchUpdate: 'gesturePinchUpdate', gestureTapDown: 'gestureTapDown', gestureShowPress: 'gestureShowPress', gestureTap: 'gestureTap', gestureTapCancel: 'gestureTapCancel', gestureShortPress: 'gestureShortPress', gestureLongPress: 'gestureLongPress', gestureLongTap: 'gestureLongTap', gestureTwoFingerTap: 'gestureTwoFingerTap', gestureTapUnconfirmed: 'gestureTapUnconfirmed', gestureDoubleTap: 'gestureDoubleTap', touchStart: 'touchStart', touchMove: 'touchMove', touchEnd: 'touchEnd', touchCancel: 'touchCancel', touchScrollStarted: 'touchScrollStarted', pointerDown: 'pointerDown', pointerUp: 'pointerUp', pointerMove: 'pointerMove', pointerRawUpdate: 'pointerRawUpdate', pointerCancel: 'pointerCancel', pointerCausedUaAction: 'pointerCausedUaAction'}/*union*/)"""
)
sealed external interface InputEventType {
    companion object {
        val undefined: InputEventType
        val mouseDown: InputEventType
        val mouseUp: InputEventType
        val mouseMove: InputEventType
        val mouseEnter: InputEventType
        val mouseLeave: InputEventType
        val contextMenu: InputEventType
        val mouseWheel: InputEventType
        val rawKeyDown: InputEventType
        val keyDown: InputEventType
        val keyUp: InputEventType
        val char: InputEventType
        val gestureScrollBegin: InputEventType
        val gestureScrollEnd: InputEventType
        val gestureScrollUpdate: InputEventType
        val gestureFlingStart: InputEventType
        val gestureFlingCancel: InputEventType
        val gesturePinchBegin: InputEventType
        val gesturePinchEnd: InputEventType
        val gesturePinchUpdate: InputEventType
        val gestureTapDown: InputEventType
        val gestureShowPress: InputEventType
        val gestureTap: InputEventType
        val gestureTapCancel: InputEventType
        val gestureShortPress: InputEventType
        val gestureLongPress: InputEventType
        val gestureLongTap: InputEventType
        val gestureTwoFingerTap: InputEventType
        val gestureTapUnconfirmed: InputEventType
        val gestureDoubleTap: InputEventType
        val touchStart: InputEventType
        val touchMove: InputEventType
        val touchEnd: InputEventType
        val touchCancel: InputEventType
        val touchScrollStarted: InputEventType
        val pointerDown: InputEventType
        val pointerUp: InputEventType
        val pointerMove: InputEventType
        val pointerRawUpdate: InputEventType
        val pointerCancel: InputEventType
        val pointerCausedUaAction: InputEventType
    }
}
