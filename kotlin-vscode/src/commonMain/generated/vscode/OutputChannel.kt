// Automatically generated - do not modify!

package vscode

/**
 * An output channel is a container for readonly textual information.
 *
 * To get an instance of an `OutputChannel` use
 * {@link window.createOutputChannel createOutputChannel}.
 */
external interface OutputChannel {
    /**
     * The human-readable name of this output channel.
     */
    val name: String

    /**
     * Append the given value to the channel.
     *
     * @param value A string, falsy values will not be printed.
     */
//  append(value: string): void;

    /**
     * Append the given value and a line feed character
     * to the channel.
     *
     * @param value A string, falsy values will be printed.
     */
//  appendLine(value: string): void;

    /**
     * Replaces all output from the channel with the given value.
     *
     * @param value A string, falsy values will not be printed.
     */
//  replace(value: string): void;

    /**
     * Removes all output from the channel.
     */
//  clear(): void;

    /**
     * Reveal this channel in the UI.
     *
     * @param preserveFocus When `true` the channel will not take focus.
     */
//  show(preserveFocus?: boolean): void;

    /**
     * Reveal this channel in the UI.
     *
     * @deprecated Use the overload with just one parameter (`show(preserveFocus?: boolean): void`).
     *
     * @param column This argument is **deprecated** and will be ignored.
     * @param preserveFocus When `true` the channel will not take focus.
     */
//  show(column?: ViewColumn, preserveFocus?: boolean): void;

    /**
     * Hide this channel from the UI.
     */
//  hide(): void;

    /**
     * Dispose and free associated resources.
     */
//  dispose(): void;
}
