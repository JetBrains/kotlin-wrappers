// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface DragEventTypes {
    @JsValue("drag")
    val DRAG: EventType<DragEvent>
        get() = definedExternally

    @JsValue("dragend")
    val DRAG_END: EventType<DragEvent>
        get() = definedExternally

    @JsValue("dragenter")
    val DRAG_ENTER: EventType<DragEvent>
        get() = definedExternally

    @JsValue("dragleave")
    val DRAG_LEAVE: EventType<DragEvent>
        get() = definedExternally

    @JsValue("dragover")
    val DRAG_OVER: EventType<DragEvent>
        get() = definedExternally

    @JsValue("dragstart")
    val DRAG_START: EventType<DragEvent>
        get() = definedExternally

    @JsValue("drop")
    val DROP: EventType<DragEvent>
        get() = definedExternally
}
