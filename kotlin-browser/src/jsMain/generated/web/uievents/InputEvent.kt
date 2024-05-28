// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.data.DataTransfer
import web.events.EventTarget
import web.events.EventType
import web.ranges.StaticRange

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent)
 */
open external class InputEvent(
    override val type: EventType<InputEvent, EventTarget>,
    init: InputEventInit = definedExternally,
) : UIEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/data)
     */
    val data: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/dataTransfer)
     */
    val dataTransfer: DataTransfer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/inputType)
     */
    val inputType: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/isComposing)
     */
    val isComposing: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/getTargetRanges)
     */
    fun getTargetRanges(): ReadonlyArray<StaticRange>

    @JsAlias(THIS)
    override fun asInit(): InputEventInit

    companion object : InputEventTypes
}
