// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import js.core.ReadonlyArray
import seskar.js.JsValue
import web.data.DataTransfer
import web.dom.StaticRange
import web.events.EventType

external interface InputEventInit : UIEventInit {
    var data: String?
    var dataTransfer: DataTransfer?
    var inputType: String?
    var isComposing: Boolean?
    var targetRanges: ReadonlyArray<StaticRange>?
}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent) */
open external class InputEvent(
    override val type: EventType<InputEvent>,
    init: InputEventInit = definedExternally,
) : UIEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/data) */
    val data: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/dataTransfer) */
    val dataTransfer: DataTransfer?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/inputType) */
    val inputType: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/isComposing) */
    val isComposing: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/getTargetRanges) */
    fun getTargetRanges(): ReadonlyArray<StaticRange>

    companion object {
        @JsValue("beforeinput")
        val BEFORE_INPUT: EventType<InputEvent>
    }
}
