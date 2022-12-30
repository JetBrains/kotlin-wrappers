// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package dom.events

import js.core.ReadonlyArray
import web.data.DataTransfer
import web.events.EventType

external interface InputEventInit : UIEventInit {
    var data: String?
    var dataTransfer: DataTransfer?
    var inputType: String?
    var isComposing: Boolean?
    var targetRanges: ReadonlyArray<Any /* StaticRange */>?
}

open external class InputEvent(
    override val type: EventType<InputEvent>,
    init: InputEventInit = definedExternally,
) : UIEvent {
    val data: String?
    val dataTransfer: DataTransfer?
    val inputType: String
    val isComposing: Boolean
    fun getTargetRanges(): ReadonlyArray<Any /* StaticRange */>

    companion object
}
