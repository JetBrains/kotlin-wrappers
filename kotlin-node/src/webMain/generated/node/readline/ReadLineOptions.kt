// Automatically generated - do not modify!

package node.readline

import web.abort.AbortSignal

sealed external interface _ReadLineOptions {
    /**
     * The [`Readable`](https://nodejs.org/docs/latest-v24.x/api/stream.html#readable-streams) stream to listen to
     */
    var input: node.ReadableStream

    /**
     * The [`Writable`](https://nodejs.org/docs/latest-v24.x/api/stream.html#writable-streams) stream to write readline data to.
     */
    var output: node.WritableStream?

    /**
     * An optional function used for Tab autocompletion.
     */
    var completer: Any? // Completer | AsyncCompleter | undefined

    /**
     * `true` if the `input` and `output` streams should be treated like a TTY,
     * and have ANSI/VT100 escape codes written to it.
     * Default: checking `isTTY` on the `output` stream upon instantiation.
     */
    var terminal: Boolean?

    /**
     * Initial list of history lines.
     * This option makes sense only if `terminal` is set to `true` by the user or by an internal `output` check,
     * otherwise the history caching mechanism is not initialized at all.
     * @default []
     */
    var history: js.array.ReadonlyArray<String>?

    /**
     * Maximum number of history lines retained.
     * To disable the history set this value to `0`.
     * This option makes sense only if `terminal` is set to `true` by the user or by an internal `output` check,
     * otherwise the history caching mechanism is not initialized at all.
     * @default 30
     */
    var historySize: Double?

    /**
     * If `true`, when a new input line added to the history list duplicates an older one,
     * this removes the older line from the list.
     * @default false
     */
    var removeHistoryDuplicates: Boolean?

    /**
     * The prompt string to use.
     * @default "> "
     */
    var prompt: String?

    /**
     * If the delay between `\r` and `\n` exceeds `crlfDelay` milliseconds,
     * both `\r` and `\n` will be treated as separate end-of-line input.
     * `crlfDelay` will be coerced to a number no less than `100`.
     * It can be set to `Infinity`, in which case
     * `\r` followed by `\n` will always be considered a single newline
     * (which may be reasonable for [reading files](https://nodejs.org/docs/latest-v24.x/api/readline.html#example-read-file-stream-line-by-line) with `\r\n` line delimiter).
     * @default 100
     */
    var crlfDelay: Double?

    /**
     * The duration `readline` will wait for a character
     * (when reading an ambiguous key sequence in milliseconds
     * one that can both form a complete key sequence using the input read so far
     * and can take additional input to complete a longer key sequence).
     * @default 500
     */
    var escapeCodeTimeout: Double?

    /**
     * The number of spaces a tab is equal to (minimum 1).
     * @default 8
     */
    var tabSize: Double?

    /**
     * Allows closing the interface using an AbortSignal.
     * Aborting the signal will internally call `close` on the interface.
     */
    var signal: AbortSignal?
}
