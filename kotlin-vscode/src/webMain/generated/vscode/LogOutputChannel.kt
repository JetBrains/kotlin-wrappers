// Automatically generated - do not modify!

package vscode

import js.errors.JsError
import kotlin.js.JsAny

/**
 * A channel for containing log output.
 *
 * To get an instance of a `LogOutputChannel` use
 * [createOutputChannel][window.createOutputChannel].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel)
 */
external interface LogOutputChannel :
    OutputChannel {
    /**
     * The current log level of the channel. Defaults to [editor log level][env.logLevel].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel.logLevel)
     */
    val logLevel: LogLevel

    /**
     * An [Event] which fires when the log level of the channel changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel.onDidChangeLogLevel)
     */
    val onDidChangeLogLevel: Event<LogLevel>

    /**
     * Outputs the given trace message to the channel. Use this method to log verbose information.
     *
     * The message is only logged if the channel is configured to display [trace][LogLevel.Trace] log level.
     *
     * @param message trace message to log
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel.trace)
     */
    fun trace(
        message: String,
        vararg args: JsAny?,
    )

    /**
     * Outputs the given debug message to the channel.
     *
     * The message is only logged if the channel is configured to display [debug][LogLevel.Debug] log level or lower.
     *
     * @param message debug message to log
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel.debug)
     */
    fun debug(
        message: String,
        vararg args: JsAny?,
    )

    /**
     * Outputs the given information message to the channel.
     *
     * The message is only logged if the channel is configured to display [info][LogLevel.Info] log level or lower.
     *
     * @param message info message to log
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel.info)
     */
    fun info(
        message: String,
        vararg args: JsAny?,
    )

    /**
     * Outputs the given warning message to the channel.
     *
     * The message is only logged if the channel is configured to display [warning][LogLevel.Warning] log level or lower.
     *
     * @param message warning message to log
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel.warn)
     */
    fun warn(
        message: String,
        vararg args: JsAny?,
    )

    /**
     * Outputs the given error or error message to the channel.
     *
     * The message is only logged if the channel is configured to display [error][LogLevel.Error] log level or lower.
     *
     * @param error Error or error message to log
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LogOutputChannel.error)
     */
    fun error(
        error: String,
        vararg args: JsAny?,
    )

    fun error(
        error: JsError,
        vararg args: JsAny?,
    )
}
