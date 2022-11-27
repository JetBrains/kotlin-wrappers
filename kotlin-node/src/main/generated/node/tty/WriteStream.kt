// Automatically generated - do not modify!

@file:JsModule("node:tty")
@file:JsNonModule

package node.tty

import js.core.JsTuple2
import node.events.Event
import node.events.EventType

external class WriteStream : node.net.Socket {
    constructor(fd: Number)

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun addListener(
        event: Event.RESIZE,
        listener: () -> Unit,
    ) /* : this */

    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    fun emit(event: Event.RESIZE): Boolean
    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun on(
        event: Event.RESIZE,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun once(
        event: Event.RESIZE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependListener(
        event: Event.RESIZE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependOnceListener(
        event: Event.RESIZE,
        listener: () -> Unit,
    ) /* : this */

    /**
     * `writeStream.clearLine()` clears the current line of this `WriteStream` in a
     * direction identified by `dir`.
     * @since v0.7.7
     * @param callback Invoked once the operation completes.
     * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
     */
    fun clearLine(
        dir: Direction,
        callback: () -> Unit = definedExternally,
    ): Boolean

    /**
     * `writeStream.clearScreenDown()` clears this `WriteStream` from the current
     * cursor down.
     * @since v0.7.7
     * @param callback Invoked once the operation completes.
     * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
     */
    fun clearScreenDown(callback: () -> Unit = definedExternally): Boolean

    /**
     * `writeStream.cursorTo()` moves this `WriteStream`'s cursor to the specified
     * position.
     * @since v0.7.7
     * @param callback Invoked once the operation completes.
     * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
     */
    fun cursorTo(
        x: Number,
        y: Number = definedExternally,
        callback: () -> Unit = definedExternally,
    ): Boolean

    fun cursorTo(
        x: Number,
        callback: () -> Unit,
    ): Boolean

    /**
     * `writeStream.moveCursor()` moves this `WriteStream`'s cursor _relative_ to its
     * current position.
     * @since v0.7.7
     * @param callback Invoked once the operation completes.
     * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
     */
    fun moveCursor(
        dx: Number,
        dy: Number,
        callback: () -> Unit = definedExternally,
    ): Boolean

    /**
     * Returns:
     *
     * * `1` for 2,
     * * `4` for 16,
     * * `8` for 256,
     * * `24` for 16,777,216 colors supported.
     *
     * Use this to determine what colors the terminal supports. Due to the nature of
     * colors in terminals it is possible to either have false positives or false
     * negatives. It depends on process information and the environment variables that
     * may lie about what terminal is used.
     * It is possible to pass in an `env` object to simulate the usage of a specific
     * terminal. This can be useful to check how specific environment settings behave.
     *
     * To enforce a specific color support, use one of the below environment settings.
     *
     * * 2 colors: `FORCE_COLOR = 0` (Disables colors)
     * * 16 colors: `FORCE_COLOR = 1`
     * * 256 colors: `FORCE_COLOR = 2`
     * * 16,777,216 colors: `FORCE_COLOR = 3`
     *
     * Disabling color support is also possible by using the `NO_COLOR` and`NODE_DISABLE_COLORS` environment variables.
     * @since v9.9.0
     * @param [env=process.env] An object containing the environment variables to check. This enables simulating the usage of a specific terminal.
     */
    fun getColorDepth(env: Any = definedExternally): Number

    /**
     * Returns `true` if the `writeStream` supports at least as many colors as provided
     * in `count`. Minimum support is 2 (black and white).
     *
     * This has the same false positives and negatives as described in `writeStream.getColorDepth()`.
     *
     * ```js
     * process.stdout.hasColors();
     * // Returns true or false depending on if `stdout` supports at least 16 colors.
     * process.stdout.hasColors(256);
     * // Returns true or false depending on if `stdout` supports at least 256 colors.
     * process.stdout.hasColors({ TMUX: '1' });
     * // Returns true.
     * process.stdout.hasColors(2 ** 24, { TMUX: '1' });
     * // Returns false (the environment setting pretends to support 2 ** 8 colors).
     * ```
     * @since v11.13.0, v10.16.0
     * @param [count=16] The number of colors that are requested (minimum 2).
     * @param [env=process.env] An object containing the environment variables to check. This enables simulating the usage of a specific terminal.
     */
    fun hasColors(count: Number = definedExternally): Boolean
    fun hasColors(env: Any = definedExternally): Boolean
    fun hasColors(
        count: Number,
        env: Any = definedExternally,
    ): Boolean

    /**
     * `writeStream.getWindowSize()` returns the size of the TTY
     * corresponding to this `WriteStream`. The array is of the type`[numColumns, numRows]` where `numColumns` and `numRows` represent the number
     * of columns and rows in the corresponding TTY.
     * @since v0.7.7
     */
    fun getWindowSize(): JsTuple2<Int, Int>

    /**
     * A `number` specifying the number of columns the TTY currently has. This property
     * is updated whenever the `'resize'` event is emitted.
     * @since v0.7.7
     */
    var columns: Number

    /**
     * A `number` specifying the number of rows the TTY currently has. This property
     * is updated whenever the `'resize'` event is emitted.
     * @since v0.7.7
     */
    var rows: Number

    /**
     * A `boolean` that is always `true`.
     * @since v0.5.8
     */
    var isTTY: Boolean
}
