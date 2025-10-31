// Automatically generated - do not modify!

package web.input

import js.array.ReadonlyArray
import web.data.DataTransfer
import web.events.EventType
import web.ranges.StaticRange
import web.uievents.UIEvent
import kotlin.js.definedExternally

/**
 * The **`InputEvent`** interface represents an event notifying the user of editable content changes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent)
 */
open external class InputEvent(
    override val type: EventType<InputEvent>,
    init: InputEventInit = definedExternally,
) : UIEvent {
    /**
     * The **`data`** read-only property of the InputEvent interface returns a string with inserted characters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/data)
     */
    val data: String?

    /**
     * The **`dataTransfer`** read-only property of the InputEvent interface returns a DataTransfer object containing information about richtext or plaintext data being added to or removed from editable content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/dataTransfer)
     */
    val dataTransfer: DataTransfer?

    /**
     * The **`inputType`** read-only property of the InputEvent interface returns the type of change made to editable content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/inputType)
     */
    val inputType: String

    /**
     * The **`InputEvent.isComposing`** read-only property returns a boolean value indicating if the event is fired after Element/compositionstart_event and before Element/compositionend_event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/isComposing)
     */
    val isComposing: Boolean

    /**
     * The **`getTargetRanges()`** method of the InputEvent interface returns an array of StaticRange objects that will be affected by a change to the DOM if the input event is not canceled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/getTargetRanges)
     */
    fun getTargetRanges(): ReadonlyArray<StaticRange>

    companion object
}

inline val InputEvent.Companion.BEFORE_INPUT: EventType<InputEvent>
    get() = EventType("beforeinput")

inline val InputEvent.Companion.INPUT: EventType<InputEvent>
    get() = EventType("input")
