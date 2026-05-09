// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Log levels
 */
sealed /* enum */
external interface LogLevel {
    companion object {
        /**
         * No messages are logged with this level.
         */
        val Off: LogLevel // 0

        /**
         * All messages are logged with this level.
         */
        val Trace: LogLevel // 1

        /**
         * Messages with debug and higher log level are logged with this level.
         */
        val Debug: LogLevel // 2

        /**
         * Messages with info and higher log level are logged with this level.
         */
        val Info: LogLevel // 3

        /**
         * Messages with warning and higher log level are logged with this level.
         */
        val Warning: LogLevel // 4

        /**
         * Only error messages are logged with this level.
         */
        val Error: LogLevel // 5
    }
}
