// Generated by Karakum - do not modify it manually!

@file:JsModule("node:readline")

package node.readline

/**
 * The `readline.moveCursor()` method moves the cursor _relative_ to its current
 * position in a given [TTY](https://nodejs.org/docs/latest-v20.x/api/tty.html) `stream`.
 * @since v0.7.7
 * @param callback Invoked once the operation completes.
 * @return `false` if `stream` wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
 */
external fun moveCursor(
    stream: node.WritableStream,
    dx: Number,
    dy: Number,
    callback: () -> Unit = definedExternally,
): Boolean
