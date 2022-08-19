// Automatically generated - do not modify!

package node.vm

sealed external interface BaseOptions {
    /**
     * Specifies the filename used in stack traces produced by this script.
     * Default: `''`.
     */
    var filename: String?

    /**
     * Specifies the line number offset that is displayed in stack traces produced by this script.
     * Default: `0`.
     */
    var lineOffset: Number?

    /**
     * Specifies the column number offset that is displayed in stack traces produced by this script.
     * @default 0
     */
    var columnOffset: Number?
}
