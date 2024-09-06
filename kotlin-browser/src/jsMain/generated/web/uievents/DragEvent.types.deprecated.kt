// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class DragEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DragEvent.DRAG"),
    )
    @JsValue("drag")
    fun drag(): EventType<DragEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DragEvent.DRAG_END"),
    )
    @JsValue("dragend")
    fun dragEnd(): EventType<DragEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DragEvent.DRAG_ENTER"),
    )
    @JsValue("dragenter")
    fun dragEnter(): EventType<DragEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DragEvent.DRAG_LEAVE"),
    )
    @JsValue("dragleave")
    fun dragLeave(): EventType<DragEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DragEvent.DRAG_OVER"),
    )
    @JsValue("dragover")
    fun dragOver(): EventType<DragEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DragEvent.DRAG_START"),
    )
    @JsValue("dragstart")
    fun dragStart(): EventType<DragEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DragEvent.DROP"),
    )
    @JsValue("drop")
    fun drop(): EventType<DragEvent>
}
