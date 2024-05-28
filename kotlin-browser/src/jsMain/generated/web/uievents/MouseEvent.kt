// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.EventTarget
import web.events.EventType
import web.keyboard.ModifierKeyCode

/**
 * Events that occur due to the user interacting with a pointing device (such as a mouse). Common events using this interface include click, dblclick, mouseup, mousedown.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent)
 */
open external class MouseEvent(
    override val type: EventType<MouseEvent, EventTarget>,
    init: MouseEventInit = definedExternally,
) : UIEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/altKey)
     */
    val altKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button)
     */
    val button: MouseButton

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons)
     */
    val buttons: MouseButtons

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientX)
     */
    val clientX: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientY)
     */
    val clientY: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/ctrlKey)
     */
    val ctrlKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/layerX)
     */
    val layerX: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/layerY)
     */
    val layerY: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/metaKey)
     */
    val metaKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementX)
     */
    val movementX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementY)
     */
    val movementY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetX)
     */
    val offsetX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetY)
     */
    val offsetY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageX)
     */
    val pageX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageY)
     */
    val pageY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
     */
    val relatedTarget: EventTarget?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenX)
     */
    val screenX: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenY)
     */
    val screenY: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/shiftKey)
     */
    val shiftKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/x)
     */
    val x: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/y)
     */
    val y: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/getModifierState)
     */
    fun getModifierState(keyArg: ModifierKeyCode): Boolean

    @JsAlias(THIS)
    override fun asInit(): MouseEventInit

    companion object : MouseEventTypes
}
