@file:JsModule("node:readline")

package node.readline

import node.events.Abortable
import node.events.EventEmitter

/**
 * Instances of the `readline.Interface` class are constructed using the`readline.createInterface()` method. Every instance is associated with a
 * single `input` `Readable` stream and a single `output` `Writable` stream.
 * The `output` stream is used to print prompts for user input that arrives on,
 * and is read from, the `input` stream.
 * @since v0.1.104
 */

@JsName("Interface")

open external class _Interface : EventEmitter {
    /**
     * NOTE: According to the documentation:
     *
     * > Instances of the `readline.Interface` class are constructed using the
     * > `readline.createInterface()` method.
     *
     * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
     */
    constructor (
        input: node.ReadableStream,
        output: node.WritableStream = definedExternally,
        completer: Completer = definedExternally,
        terminal: Boolean = definedExternally,
    )

    constructor (
        input: node.ReadableStream,
        output: node.WritableStream = definedExternally,
        completer: AsyncCompleter = definedExternally,
        terminal: Boolean = definedExternally,
    )

    /**
     * NOTE: According to the documentation:
     *
     * > Instances of the `readline.Interface` class are constructed using the
     * > `readline.createInterface()` method.
     *
     * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
     */
    constructor (options: ReadLineOptions)

    val terminal: Boolean

    /**
     * The current input data being processed by node.
     *
     * This can be used when collecting input from a TTY stream to retrieve the
     * current value that has been processed thus far, prior to the `line` event
     * being emitted. Once the `line` event has been emitted, this property will
     * be an empty string.
     *
     * Be aware that modifying the value during the instance runtime may have
     * unintended consequences if `rl.cursor` is not also controlled.
     *
     * **If not using a TTY stream for input, use the `'line'` event.**
     *
     * One possible use case would be as follows:
     *
     * ```js
     * const values = ['lorem ipsum', 'dolor sit amet'];
     * const rl = readline.createInterface(process.stdin);
     * const showResults = debounce(() => {
     *   console.log(
     *     '\n',
     *     values.filter((val) => val.startsWith(rl.line)).join(' ')
     *   );
     * }, 300);
     * process.stdin.on('keypress', (c, k) => {
     *   showResults();
     * });
     * ```
     * @since v0.1.98
     */
    val line: String

    /**
     * The cursor position relative to `rl.line`.
     *
     * This will track where the current cursor lands in the input string, when
     * reading input from a TTY stream. The position of cursor determines the
     * portion of the input string that will be modified as input is processed,
     * as well as the column where the terminal caret will be rendered.
     * @since v0.1.98
     */
    val cursor: Double

    /**
     * The `rl.getPrompt()` method returns the current prompt used by `rl.prompt()`.
     * @since v15.3.0
     * @return the current prompt string
     */
    fun getPrompt(): String

    /**
     * The `rl.setPrompt()` method sets the prompt that will be written to `output`whenever `rl.prompt()` is called.
     * @since v0.1.98
     */
    fun setPrompt(prompt: String): Unit

    /**
     * The `rl.prompt()` method writes the `readline.Interface` instances configured`prompt` to a new line in `output` in order to provide a user with a new
     * location at which to provide input.
     *
     * When called, `rl.prompt()` will resume the `input` stream if it has been
     * paused.
     *
     * If the `readline.Interface` was created with `output` set to `null` or`undefined` the prompt is not written.
     * @since v0.1.98
     * @param preserveCursor If `true`, prevents the cursor placement from being reset to `0`.
     */
    fun prompt(preserveCursor: Boolean = definedExternally): Unit

    /**
     * The `rl.question()` method displays the `query` by writing it to the `output`,
     * waits for user input to be provided on `input`, then invokes the `callback`function passing the provided input as the first argument.
     *
     * When called, `rl.question()` will resume the `input` stream if it has been
     * paused.
     *
     * If the `readline.Interface` was created with `output` set to `null` or`undefined` the `query` is not written.
     *
     * The `callback` function passed to `rl.question()` does not follow the typical
     * pattern of accepting an `Error` object or `null` as the first argument.
     * The `callback` is called with the provided answer as the only argument.
     *
     * Example usage:
     *
     * ```js
     * rl.question('What is your favorite food? ', (answer) => {
     *   console.log(`Oh, so your favorite food is ${answer}`);
     * });
     * ```
     *
     * Using an `AbortController` to cancel a question.
     *
     * ```js
     * const ac = new AbortController();
     * const signal = ac.signal;
     *
     * rl.question('What is your favorite food? ', { signal }, (answer) => {
     *   console.log(`Oh, so your favorite food is ${answer}`);
     * });
     *
     * signal.addEventListener('abort', () => {
     *   console.log('The food question timed out');
     * }, { once: true });
     *
     * setTimeout(() => ac.abort(), 10000);
     * ```
     *
     * If this method is invoked as it's util.promisify()ed version, it returns a
     * Promise that fulfills with the answer. If the question is canceled using
     * an `AbortController` it will reject with an `AbortError`.
     *
     * ```js
     * const util = require('util');
     * const question = util.promisify(rl.question).bind(rl);
     *
     * async function questionExample() {
     *   try {
     *     const answer = await question('What is you favorite food? ');
     *     console.log(`Oh, so your favorite food is ${answer}`);
     *   } catch (err) {
     *     console.error('Question rejected', err);
     *   }
     * }
     * questionExample();
     * ```
     * @since v0.3.3
     * @param query A statement or query to write to `output`, prepended to the prompt.
     * @param callback A callback function that is invoked with the user's input in response to the `query`.
     */
    fun question(query: String, callback: (answer: String) -> Unit): Unit
    fun question(query: String, options: Abortable, callback: (answer: String) -> Unit): Unit

    /**
     * The `rl.pause()` method pauses the `input` stream, allowing it to be resumed
     * later if necessary.
     *
     * Calling `rl.pause()` does not immediately pause other events (including`'line'`) from being emitted by the `readline.Interface` instance.
     * @since v0.3.4
     */
    fun pause(): Unit /* this */

    /**
     * The `rl.resume()` method resumes the `input` stream if it has been paused.
     * @since v0.3.4
     */
    fun resume(): Unit /* this */

    /**
     * The `rl.close()` method closes the `readline.Interface` instance and
     * relinquishes control over the `input` and `output` streams. When called,
     * the `'close'` event will be emitted.
     *
     * Calling `rl.close()` does not immediately stop other events (including `'line'`)
     * from being emitted by the `readline.Interface` instance.
     * @since v0.1.98
     */
    fun close(): Unit

    /**
     * The `rl.write()` method will write either `data` or a key sequence identified
     * by `key` to the `output`. The `key` argument is supported only if `output` is
     * a `TTY` text terminal. See `TTY keybindings` for a list of key
     * combinations.
     *
     * If `key` is specified, `data` is ignored.
     *
     * When called, `rl.write()` will resume the `input` stream if it has been
     * paused.
     *
     * If the `readline.Interface` was created with `output` set to `null` or`undefined` the `data` and `key` are not written.
     *
     * ```js
     * rl.write('Delete this!');
     * // Simulate Ctrl+U to delete the line written previously
     * rl.write(null, { ctrl: true, name: 'u' });
     * ```
     *
     * The `rl.write()` method will write the data to the `readline` `Interface`'s`input`_as if it were provided by the user_.
     * @since v0.1.98
     */
    fun write(data: String, key: Key = definedExternally): Unit

    fun write(data: node.buffer.Buffer, key: Key = definedExternally): Unit
    fun write(data: String?, key: Key): Unit

    fun write(data: node.buffer.Buffer?, key: Key): Unit

    /**
     * Returns the real position of the cursor in relation to the input
     * prompt + string. Long input (wrapping) strings, as well as multiple
     * line prompts are included in the calculations.
     * @since v13.5.0, v12.16.0
     */
    fun getCursorPos(): CursorPos

    /**
     * events.EventEmitter
     * 1. close
     * 2. line
     * 3. pause
     * 4. resume
     * 5. SIGCONT
     * 6. SIGINT
     * 7. SIGTSTP
     * 8. history
     */
    fun addListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun addListener(event: InterfaceEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: InterfaceEvent.LINE, listener: (input: String) -> Unit): Unit /* this */
    fun addListener(event: InterfaceEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: InterfaceEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun addListener(event: InterfaceEvent.SIGCONT, listener: () -> Unit): Unit /* this */
    fun addListener(event: InterfaceEvent.SIGINT, listener: () -> Unit): Unit /* this */
    fun addListener(event: InterfaceEvent.SIGTSTP, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: InterfaceEvent.HISTORY,
        listener: (history: js.core.ReadonlyArray<String>) -> Unit,
    ): Unit /* this */

    fun emit(event: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean

    fun emit(event: js.core.Symbol, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Boolean
    fun emit(event: InterfaceEvent.CLOSE): Boolean
    fun emit(event: InterfaceEvent.LINE, input: String): Boolean
    fun emit(event: InterfaceEvent.PAUSE): Boolean
    fun emit(event: InterfaceEvent.RESUME): Boolean
    fun emit(event: InterfaceEvent.SIGCONT): Boolean
    fun emit(event: InterfaceEvent.SIGINT): Boolean
    fun emit(event: InterfaceEvent.SIGTSTP): Boolean
    fun emit(event: InterfaceEvent.HISTORY, history: js.core.ReadonlyArray<String>): Boolean
    fun on(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun on(event: InterfaceEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: InterfaceEvent.LINE, listener: (input: String) -> Unit): Unit /* this */
    fun on(event: InterfaceEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun on(event: InterfaceEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun on(event: InterfaceEvent.SIGCONT, listener: () -> Unit): Unit /* this */
    fun on(event: InterfaceEvent.SIGINT, listener: () -> Unit): Unit /* this */
    fun on(event: InterfaceEvent.SIGTSTP, listener: () -> Unit): Unit /* this */
    fun on(event: InterfaceEvent.HISTORY, listener: (history: js.core.ReadonlyArray<String>) -> Unit): Unit /* this */
    fun once(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun once(event: InterfaceEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: InterfaceEvent.LINE, listener: (input: String) -> Unit): Unit /* this */
    fun once(event: InterfaceEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun once(event: InterfaceEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun once(event: InterfaceEvent.SIGCONT, listener: () -> Unit): Unit /* this */
    fun once(event: InterfaceEvent.SIGINT, listener: () -> Unit): Unit /* this */
    fun once(event: InterfaceEvent.SIGTSTP, listener: () -> Unit): Unit /* this */
    fun once(event: InterfaceEvent.HISTORY, listener: (history: js.core.ReadonlyArray<String>) -> Unit): Unit /* this */
    fun prependListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(event: InterfaceEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: InterfaceEvent.LINE, listener: (input: String) -> Unit): Unit /* this */
    fun prependListener(event: InterfaceEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: InterfaceEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun prependListener(event: InterfaceEvent.SIGCONT, listener: () -> Unit): Unit /* this */
    fun prependListener(event: InterfaceEvent.SIGINT, listener: () -> Unit): Unit /* this */
    fun prependListener(event: InterfaceEvent.SIGTSTP, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: InterfaceEvent.HISTORY,
        listener: (history: js.core.ReadonlyArray<String>) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: String, listener: Function<Any?> /* (...args: any[]) => void */): Unit /* this */
    fun prependOnceListener(event: InterfaceEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: InterfaceEvent.LINE, listener: (input: String) -> Unit): Unit /* this */
    fun prependOnceListener(event: InterfaceEvent.PAUSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: InterfaceEvent.RESUME, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: InterfaceEvent.SIGCONT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: InterfaceEvent.SIGINT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: InterfaceEvent.SIGTSTP, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: InterfaceEvent.HISTORY,
        listener: (history: js.core.ReadonlyArray<String>) -> Unit,
    ): Unit /* this */
}
