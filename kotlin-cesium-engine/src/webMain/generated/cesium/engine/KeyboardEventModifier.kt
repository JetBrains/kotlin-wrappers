// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * This enumerated type is for representing keyboard modifiers. These are keys
 * that are held down in addition to other event types.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#KeyboardEventModifier">Online Documentation</a>
 */
sealed /* enum */
external interface KeyboardEventModifier {
    companion object {

        /**
         * Represents the shift key being held down.
         *
         * Value - `0`
         */
        val SHIFT: KeyboardEventModifier

        /**
         * Represents the control key being held down.
         *
         * Value - `1`
         */
        val CTRL: KeyboardEventModifier

        /**
         * Represents the alt key being held down.
         *
         * Value - `2`
         */
        val ALT: KeyboardEventModifier
    }
}
