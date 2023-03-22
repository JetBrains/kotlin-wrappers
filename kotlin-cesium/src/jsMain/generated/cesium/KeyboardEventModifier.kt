// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * This enumerated type is for representing keyboard modifiers. These are keys
 * that are held down in addition to other event types.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#KeyboardEventModifier">Online Documentation</a>
 */
sealed external interface KeyboardEventModifier {
    companion object {

        /**
         * Represents the shift key being held down.
         */
        val SHIFT: KeyboardEventModifier

        /**
         * Represents the control key being held down.
         */
        val CTRL: KeyboardEventModifier

        /**
         * Represents the alt key being held down.
         */
        val ALT: KeyboardEventModifier
    }
}
