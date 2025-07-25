// Automatically generated - do not modify!

package vscode

import kotlin.js.definedExternally

/**
 * An output channel is a container for readonly textual information.
 *
 * To get an instance of an `OutputChannel` use
 * [createOutputChannel][window.createOutputChannel].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel)
 */
external interface OutputChannel :
    DisposableLike {
    /**
     * The human-readable name of this output channel.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.name)
     */
    val name: String

    /**
     * Append the given value to the channel.
     *
     * @param value A string, falsy values will not be printed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.append)
     */
    fun append(value: String)

    /**
     * Append the given value and a line feed character
     * to the channel.
     *
     * @param value A string, falsy values will be printed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.appendLine)
     */
    fun appendLine(value: String)

    /**
     * Replaces all output from the channel with the given value.
     *
     * @param value A string, falsy values will not be printed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.replace)
     */
    fun replace(value: String)

    /**
     * Removes all output from the channel.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.clear)
     */
    fun clear()

    /**
     * Reveal this channel in the UI.
     *
     * @param preserveFocus When `true` the channel will not take focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.show)
     */
    fun show(preserveFocus: Boolean = definedExternally)

    /**
     * Hide this channel from the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.hide)
     */
    fun hide()

    /**
     * Dispose and free associated resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OutputChannel.dispose)
     */
    override fun dispose()
}
