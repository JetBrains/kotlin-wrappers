// Automatically generated - do not modify!

package node.util

sealed external interface StyleTextOptions {
    /**
     * When true, `stream` is checked to see if it can handle colors.
     * @default true
     */
    var validateStream: Boolean?

    /**
     * A stream that will be validated if it can be colored.
     * @default process.stdout
     */
    var stream: node.WritableStream?
}
