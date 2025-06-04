// Automatically generated - do not modify!

package web.dom

import web.components.Slottable
import web.events.EventInstance
import web.events.JsEvent
import web.uievents.DragEvent
import web.uievents.PointerEvent
import kotlin.js.definedExternally

/**
 * The **`Text`** interface represents a text Node in a DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text)
 */
open external class Text(
    data: String = definedExternally,
) : CharacterData,
    Slottable {
    /**
     * The read-only **`wholeText`** property of the Text interface returns the full text of all Text nodes logically adjacent to the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/wholeText)
     */
    val wholeText: String

    /**
     * The **`splitText()`** method of the Text interface breaks the Text node into two nodes at the specified offset, keeping both nodes in the tree as siblings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/splitText)
     */
    fun splitText(offset: Int): Text

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/drag_event)
     */
    @JsEvent("drag")
    val dragEvent: EventInstance<DragEvent, Text /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/dragend_event)
     */
    @JsEvent("dragend")
    val dragEndEvent: EventInstance<DragEvent, Text /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/dragstart_event)
     */
    @JsEvent("dragstart")
    val dragStartEvent: EventInstance<DragEvent, Text /* this */, Node>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/pointercancel_event)
     */
    @JsEvent("pointercancel")
    val pointerCancelEvent: EventInstance<PointerEvent, Text /* this */, Node>
}
