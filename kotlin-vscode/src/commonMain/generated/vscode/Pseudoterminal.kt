// Automatically generated - do not modify!

package vscode

import js.core.JsInt
import js.core.JsString

/**
 * Defines the interface of a terminal pty, enabling extensions to control a terminal.
 */
external interface Pseudoterminal {
    /**
     * An event that when fired will write data to the terminal. Unlike
     * {@link Terminal.sendText} which sends text to the underlying child
     * pseudo-device (the child), this will write the text to parent pseudo-device (the
     * _terminal_ itself).
     *
     * Note writing `\n` will just move the cursor down 1 row, you need to write `\r` as well
     * to move the cursor to the left-most cell.
     *
     * Events fired before {@link Pseudoterminal.open} is called will be be ignored.
     *
     * **Example:** Write red text to the terminal
     * ```typescript
     * const writeEmitter = new vscode.EventEmitter<string>();
     * const pty: vscode.Pseudoterminal = {
     *   onDidWrite: writeEmitter.event,
     *   open: () => writeEmitter.fire('\x1b[31mHello world\x1b[0m'),
     *   close: () => {}
     * };
     * vscode.window.createTerminal({ name: 'My terminal', pty });
     * ```
     *
     * **Example:** Move the cursor to the 10th row and 20th column and write an asterisk
     * ```typescript
     * writeEmitter.fire('\x1b[10;20H*');
     * ```
     */
    var onDidWrite: Event<JsString>

    /**
     * An event that when fired allows overriding the {@link Pseudoterminal.setDimensions dimensions} of the
     * terminal. Note that when set, the overridden dimensions will only take effect when they
     * are lower than the actual dimensions of the terminal (ie. there will never be a scroll
     * bar). Set to `undefined` for the terminal to go back to the regular dimensions (fit to
     * the size of the panel).
     *
     * Events fired before {@link Pseudoterminal.open} is called will be be ignored.
     *
     * **Example:** Override the dimensions of a terminal to 20 columns and 10 rows
     * ```typescript
     * const dimensionsEmitter = new vscode.EventEmitter<vscode.TerminalDimensions>();
     * const pty: vscode.Pseudoterminal = {
     *   onDidWrite: writeEmitter.event,
     *   onDidOverrideDimensions: dimensionsEmitter.event,
     *   open: () => {
     *     dimensionsEmitter.fire({
     *       columns: 20,
     *       rows: 10
     *     });
     *   },
     *   close: () => {}
     * };
     * vscode.window.createTerminal({ name: 'My terminal', pty });
     * ```
     */
    var onDidOverrideDimensions: Event<TerminalDimensions?>?

    /**
     * An event that when fired will signal that the pty is closed and dispose of the terminal.
     *
     * Events fired before {@link Pseudoterminal.open} is called will be be ignored.
     *
     * A number can be used to provide an exit code for the terminal. Exit codes must be
     * positive and a non-zero exit codes signals failure which shows a notification for a
     * regular terminal and allows dependent tasks to proceed when used with the
     * `CustomExecution` API.
     *
     * **Example:** Exit the terminal when "y" is pressed, otherwise show a notification.
     * ```typescript
     * const writeEmitter = new vscode.EventEmitter<string>();
     * const closeEmitter = new vscode.EventEmitter<void>();
     * const pty: vscode.Pseudoterminal = {
     *   onDidWrite: writeEmitter.event,
     *   onDidClose: closeEmitter.event,
     *   open: () => writeEmitter.fire('Press y to exit successfully'),
     *   close: () => {},
     *   handleInput: data => {
     *     if (data !== 'y') {
     *       vscode.window.showInformationMessage('Something went wrong');
     *     }
     *     closeEmitter.fire();
     *   }
     * };
     * const terminal = vscode.window.createTerminal({ name: 'Exit example', pty });
     * terminal.show(true);
     * ```
     */
    var onDidClose: Event<JsInt?>?

    /**
     * An event that when fired allows changing the name of the terminal.
     *
     * Events fired before {@link Pseudoterminal.open} is called will be be ignored.
     *
     * **Example:** Change the terminal name to "My new terminal".
     * ```typescript
     * const writeEmitter = new vscode.EventEmitter<string>();
     * const changeNameEmitter = new vscode.EventEmitter<string>();
     * const pty: vscode.Pseudoterminal = {
     *   onDidWrite: writeEmitter.event,
     *   onDidChangeName: changeNameEmitter.event,
     *   open: () => changeNameEmitter.fire('My new terminal'),
     *   close: () => {}
     * };
     * vscode.window.createTerminal({ name: 'My terminal', pty });
     * ```
     */
    var onDidChangeName: Event<JsString>?

    /**
     * Implement to handle when the pty is open and ready to start firing events.
     *
     * @param initialDimensions The dimensions of the terminal, this will be undefined if the
     * terminal panel has not been opened before this is called.
     */
    fun open(initialDimensions: TerminalDimensions?)

    /**
     * Implement to handle when the terminal is closed by an act of the user.
     */
    fun close()

    /**
     * Implement to handle incoming keystrokes in the terminal or when an extension calls
     * {@link Terminal.sendText}. `data` contains the keystrokes/text serialized into
     * their corresponding VT sequence representation.
     *
     * @param data The incoming data.
     *
     * **Example:** Echo input in the terminal. The sequence for enter (`\r`) is translated to
     * CRLF to go to a new line and move the cursor to the start of the line.
     * ```typescript
     * const writeEmitter = new vscode.EventEmitter<string>();
     * const pty: vscode.Pseudoterminal = {
     *   onDidWrite: writeEmitter.event,
     *   open: () => {},
     *   close: () => {},
     *   handleInput: data => writeEmitter.fire(data === '\r' ? '\r\n' : data)
     * };
     * vscode.window.createTerminal({ name: 'Local echo', pty });
     * ```
     */
    var handleInput: ((data: String) -> Unit)?

    /**
     * Implement to handle when the number of rows and columns that fit into the terminal panel
     * changes, for example when font size changes or when the panel is resized. The initial
     * state of a terminal's dimensions should be treated as `undefined` until this is triggered
     * as the size of a terminal isn't known until it shows up in the user interface.
     *
     * When dimensions are overridden by
     * {@link Pseudoterminal.onDidOverrideDimensions onDidOverrideDimensions}, `setDimensions` will
     * continue to be called with the regular panel dimensions, allowing the extension continue
     * to react dimension changes.
     *
     * @param dimensions The new dimensions.
     */
    var setDimensions: ((dimensions: TerminalDimensions) -> Unit)?
}
