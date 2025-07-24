// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * A channel for containing log output.
 *
 * To get an instance of a `LogOutputChannel` use
 * [createOutputChannel][window.createOutputChannel].
 */
external interface LogOutputChannel :
    OutputChannel {
    /**
     * The current log level of the channel. Defaults to [editor log level][env.logLevel].
     */
    val logLevel: LogLevel

    /**
     * An [Event] which fires when the log level of the channel changes.
     */
    val onDidChangeLogLevel: Event<LogLevel>

    /**
     * Outputs the given trace message to the channel. Use this method to log verbose information.
     *
     * The message is only logged if the channel is configured to display [trace][LogLevel.Trace] log level.
     *
     * @param message trace message to log
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
     */
    fun error(
        error: JsAny, /* string | Error */
        vararg args: JsAny?,
    )
}
