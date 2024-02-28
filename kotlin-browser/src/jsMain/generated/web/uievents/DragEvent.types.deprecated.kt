// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface DragEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DragEvent.drag()"),
    )
    @JsValue("drag")
    val DRAG: EventType<DragEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DragEvent.dragEnd()"),
    )
    @JsValue("dragend")
    val DRAG_END: EventType<DragEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DragEvent.dragEnter()"),
    )
    @JsValue("dragenter")
    val DRAG_ENTER: EventType<DragEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DragEvent.dragLeave()"),
    )
    @JsValue("dragleave")
    val DRAG_LEAVE: EventType<DragEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DragEvent.dragOver()"),
    )
    @JsValue("dragover")
    val DRAG_OVER: EventType<DragEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DragEvent.dragStart()"),
    )
    @JsValue("dragstart")
    val DRAG_START: EventType<DragEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("DragEvent.drop()"),
    )
    @JsValue("drop")
    val DROP: EventType<DragEvent<EventTarget>>
        get() = definedExternally
}
