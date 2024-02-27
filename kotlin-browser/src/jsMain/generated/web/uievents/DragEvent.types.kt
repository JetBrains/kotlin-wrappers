// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class DragEventTypes :
    DragEventTypes_deprecated {

    @JsValue("drag")
    fun <C : EventTarget> drag(): EventType<DragEvent<C>>

    @JsValue("dragend")
    fun <C : EventTarget> dragEnd(): EventType<DragEvent<C>>

    @JsValue("dragenter")
    fun <C : EventTarget> dragEnter(): EventType<DragEvent<C>>

    @JsValue("dragleave")
    fun <C : EventTarget> dragLeave(): EventType<DragEvent<C>>

    @JsValue("dragover")
    fun <C : EventTarget> dragOver(): EventType<DragEvent<C>>

    @JsValue("dragstart")
    fun <C : EventTarget> dragStart(): EventType<DragEvent<C>>

    @JsValue("drop")
    fun <C : EventTarget> drop(): EventType<DragEvent<C>>
}
