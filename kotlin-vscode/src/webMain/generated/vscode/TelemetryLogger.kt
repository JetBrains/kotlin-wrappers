// Automatically generated - do not modify!

package vscode

import js.errors.JsError
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * A telemetry logger which can be used by extensions to log usage and error telemetry.
 *
 * A logger wraps around an [sender][TelemetrySender] but it guarantees that
 * - user settings to disable or tweak telemetry are respected, and that
 * - potential sensitive data is removed
 *
 * It also enables an "echo UI" that prints whatever data is send and it allows the editor
 * to forward unhandled errors to the respective extensions.
 *
 * To get an instance of a `TelemetryLogger`, use
 * [`createTelemetryLogger`][env.createTelemetryLogger].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger)
 */
external interface TelemetryLogger :
    DisposableLike {
    /**
     * An [Event] which fires when the enablement state of usage or error telemetry changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger.onDidChangeEnableStates)
     */
    val onDidChangeEnableStates: Event<TelemetryLogger>

    /**
     * Whether or not usage telemetry is enabled for this logger.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger.isUsageEnabled)
     */
    val isUsageEnabled: Boolean

    /**
     * Whether or not error telemetry is enabled for this logger.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger.isErrorsEnabled)
     */
    val isErrorsEnabled: Boolean

    /**
     * Log a usage event.
     *
     * After completing cleaning, telemetry setting checks, and data mix-in calls `TelemetrySender.sendEventData` to log the event.
     * Automatically supports echoing to extension telemetry output channel.
     * @param eventName The event name to log
     * @param data The data to log
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger.logUsage)
     */
    fun logUsage(
        eventName: String,
        data: JsAny /* Record<string, any | TelemetryTrustedValue> */ = definedExternally,
    )

    /**
     * Log an error event.
     *
     * After completing cleaning, telemetry setting checks, and data mix-in calls `TelemetrySender.sendEventData` to log the event. Differs from `logUsage` in that it will log the event if the telemetry setting is Error+.
     * Automatically supports echoing to extension telemetry output channel.
     * @param eventName The event name to log
     * @param data The data to log
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger.logError)
     */
    fun logError(
        eventName: String,
        data: JsAny /* Record<string, any | TelemetryTrustedValue> */ = definedExternally,
    )

    /**
     * Log an error event.
     *
     * Calls `TelemetrySender.sendErrorData`. Does cleaning, telemetry checks, and data mix-in.
     * Automatically supports echoing to extension telemetry output channel.
     * Will also automatically log any exceptions thrown within the extension host process.
     * @param error The error object which contains the stack trace cleaned of PII
     * @param data Additional data to log alongside the stack trace
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger.logError)
     */
    fun logError(
        error: JsError,
        data: JsAny /* Record<string, any | TelemetryTrustedValue> */ = definedExternally,
    )

    /**
     * Dispose this object and free resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLogger.dispose)
     */
    override fun dispose()
}
