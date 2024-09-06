// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class DragEventTypes {

    @JsValue("drag")
    fun drag(): EventType<DragEvent>

    @JsValue("dragend")
    fun dragEnd(): EventType<DragEvent>

    @JsValue("dragenter")
    fun dragEnter(): EventType<DragEvent>

    @JsValue("dragleave")
    fun dragLeave(): EventType<DragEvent>

    @JsValue("dragover")
    fun dragOver(): EventType<DragEvent>

    @JsValue("dragstart")
    fun dragStart(): EventType<DragEvent>

    @JsValue("drop")
    fun drop(): EventType<DragEvent>
}
