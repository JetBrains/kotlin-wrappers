// Generated by Karakum - do not modify it manually!

package node.tty

/**
 * -1 - to the left from cursor
 *  0 - the entire line
 *  1 - to the right from cursor
 */
sealed external interface Direction {
    companion object {
        @seskar.js.JsRawValue("-1")
        val `-1`: Direction

        @seskar.js.JsRawValue("0")
        val `0`: Direction

        @seskar.js.JsRawValue("1")
        val `1`: Direction
    }
}
