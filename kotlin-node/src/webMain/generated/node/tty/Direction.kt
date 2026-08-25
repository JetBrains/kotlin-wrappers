// Automatically generated - do not modify!

package node.tty

/**
 * -1 - to the left from cursor
 *  0 - the entire line
 *  1 - to the right from cursor
 */
@js.union.JsUnion
sealed external interface Direction

inline val Direction.Companion.`-1`: Direction
    get() = js.reflect.unsafeCast(-1)

inline val Direction.Companion.`0`: Direction
    get() = js.reflect.unsafeCast(0)

inline val Direction.Companion.`1`: Direction
    get() = js.reflect.unsafeCast(1)
