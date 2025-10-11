// Automatically generated - do not modify!

package vscode

import js.core.Void
import js.errors.JsError
import js.objects.ReadonlyRecord
import js.promise.PromiseLike
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The telemetry sender is the contract between a telemetry logger and some telemetry service. **Note** that extensions must NOT
 * call the methods of their sender directly as the logger provides extra guards and cleaning.
 *
 * ```js
 * const sender: vscode.TelemetrySender = {...};
 * const logger = vscode.env.createTelemetryLogger(sender);
 *
 * // GOOD - uses the logger
 * logger.logUsage('myEvent', { myData: 'myValue' });
 *
 * // BAD - uses the sender directly: no data cleansing, ignores user settings, no echoing to the telemetry output channel etc
 * sender.logEvent('myEvent', { myData: 'myValue' });
 * ```
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetrySender)
 */
external interface TelemetrySender {
    /**
     * Function to send event data without a stacktrace. Used within a [TelemetryLogger]
     *
     * @param eventName The name of the event which you are logging
     * @param data A serializable key value pair that is being logged
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetrySender.sendEventData)
     */
    fun sendEventData(
        eventName: String,
        data: ReadonlyRecord<JsString, *> = definedExternally,
    )

    /**
     * Function to send an error. Used within a [TelemetryLogger]
     *
     * @param error The error being logged
     * @param data Any additional data to be collected with the exception
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetrySender.sendErrorData)
     */
    fun sendErrorData(
        error: JsError,
        data: ReadonlyRecord<JsString, *> = definedExternally,
    )

    /**
     * Optional flush function which will give this sender a chance to send any remaining events
     * as its [TelemetryLogger] is being disposed
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetrySender.flush)
     */
    var flush: (() -> PromiseLike<Void>?)?
}
