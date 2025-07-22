// Automatically generated - do not modify!

package vscode

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
 */
external interface TelemetrySender {
    /**
     * Function to send event data without a stacktrace. Used within a {@link TelemetryLogger}
     *
     * @param eventName The name of the event which you are logging
     * @param data A serializable key value pair that is being logged
     */
//  sendEventData(eventName: string, data?: Record<string, any>): void

    /**
     * Function to send an error. Used within a {@link TelemetryLogger}
     *
     * @param error The error being logged
     * @param data Any additional data to be collected with the exception
     */
//  sendErrorData(error: Error, data?: Record<string, any>): void

    /**
     * Optional flush function which will give this sender a chance to send any remaining events
     * as its {@link TelemetryLogger} is being disposed
     */
//  flush?(): void | Thenable<void>
}
