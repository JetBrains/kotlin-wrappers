// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * A channel for containing log output.
 *
 * To get an instance of a `LogOutputChannel` use
 * {@link window.createOutputChannel createOutputChannel}.
 */
external interface LogOutputChannel :
    OutputChannel {
    /**
     * The current log level of the channel. Defaults to {@link env.logLevel editor log level}.
     */
    val logLevel: LogLevel

    /**
     * An {@link Event} which fires when the log level of the channel changes.
     */
    val onDidChangeLogLevel: Event<LogLevel>

    /**
     * Outputs the given trace message to the channel. Use this method to log verbose information.
     *
     * The message is only logged if the channel is configured to display {@link LogLevel.Trace trace} log level.
     *
     * @param message trace message to log
     */
    fun trace(
        message: String,
        args: ReadonlyArray<Any?>,
    )

    /**
     * Outputs the given debug message to the channel.
     *
     * The message is only logged if the channel is configured to display {@link LogLevel.Debug debug} log level or lower.
     *
     * @param message debug message to log
     */
    fun debug(
        message: String,
        args: ReadonlyArray<Any?>,
    )

    /**
     * Outputs the given information message to the channel.
     *
     * The message is only logged if the channel is configured to display {@link LogLevel.Info info} log level or lower.
     *
     * @param message info message to log
     */
    fun info(
        message: String,
        args: ReadonlyArray<Any?>,
    )

    /**
     * Outputs the given warning message to the channel.
     *
     * The message is only logged if the channel is configured to display {@link LogLevel.Warning warning} log level or lower.
     *
     * @param message warning message to log
     */
    fun warn(
        message: String,
        args: ReadonlyArray<Any?>,
    )

    /**
     * Outputs the given error or error message to the channel.
     *
     * The message is only logged if the channel is configured to display {@link LogLevel.Error error} log level or lower.
     *
     * @param error Error or error message to log
     */
    fun error(
        error: Any, /* string | Error */
        args: ReadonlyArray<Any?>,
    )
}
