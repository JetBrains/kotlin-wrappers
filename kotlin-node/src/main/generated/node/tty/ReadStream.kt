// Automatically generated - do not modify!

@file:JsModule("node:tty")
@file:JsNonModule

package node.tty

external class ReadStream : node.net.Socket {
    constructor(
        fd: Number,
        options: node.net.SocketConstructorOpts = definedExternally,
    )

    /**
     * A `boolean` that is `true` if the TTY is currently configured to operate as a
     * raw device. Defaults to `false`.
     * @since v0.7.7
     */
    var isRaw: Boolean

    /**
     * Allows configuration of `tty.ReadStream` so that it operates as a raw device.
     *
     * When in raw mode, input is always available character-by-character, not
     * including modifiers. Additionally, all special processing of characters by the
     * terminal is disabled, including echoing input
     * characters. Ctrl+C will no longer cause a `SIGINT` when
     * in this mode.
     * @since v0.7.7
     * @param mode If `true`, configures the `tty.ReadStream` to operate as a raw device. If `false`, configures the `tty.ReadStream` to operate in its default mode. The `readStream.isRaw`
     * property will be set to the resulting mode.
     * @return The read stream instance.
     */
    fun setRawMode(mode: Boolean) /* : this */

    /**
     * A `boolean` that is always `true` for `tty.ReadStream` instances.
     * @since v0.5.8
     */
    var isTTY: Boolean
}
