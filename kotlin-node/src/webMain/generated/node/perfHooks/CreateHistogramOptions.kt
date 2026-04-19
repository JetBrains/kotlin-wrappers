// Automatically generated - do not modify!

package node.perfHooks

@kotlinx.js.JsPlainObject
external interface CreateHistogramOptions {
    /**
     * The lowest discernible value. Must be an integer value greater than 0.
     * @default 1
     */
    var lowest: Any? // number | bigint | undefined

    /**
     * The highest recordable value. Must be an integer value that is equal to
     * or greater than two times `lowest`.
     * @default Number.MAX_SAFE_INTEGER
     */
    var highest: Any? // number | bigint | undefined

    /**
     * The number of accuracy digits. Must be a number between `1` and `5`.
     * @default 3
     */
    var figures: Double?
}
