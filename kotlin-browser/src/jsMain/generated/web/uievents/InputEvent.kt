// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import js.array.ReadonlyArray
import web.data.DataTransfer
import web.events.EventTarget
import web.events.EventType
import web.ranges.StaticRange

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent)
 */
open external class InputEvent<out C : EventTarget?>(
    override val type: EventType<InputEvent<C>>,
    init: InputEventInit = definedExternally,
) : UIEvent<C> {
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

    companion object : InputEventTypes
}
