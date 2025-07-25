// Automatically generated - do not modify!

package vscode

import js.core.JsString
import js.objects.JsPlainObject
import js.objects.Record

/**
 * Options for creating a [TelemetryLogger]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLoggerOptions)
 */
@JsPlainObject
external interface TelemetryLoggerOptions {
    /**
     * Whether or not you want to avoid having the built-in common properties such as os, extension name, etc injected into the data object.
     * Defaults to `false` if not defined.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLoggerOptions.ignoreBuiltInCommonProperties)
     */
    val ignoreBuiltInCommonProperties: Boolean?

    /**
     * Whether or not unhandled errors on the extension host caused by your extension should be logged to your sender.
     * Defaults to `false` if not defined.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLoggerOptions.ignoreUnhandledErrors)
     */
    val ignoreUnhandledErrors: Boolean?

    /**
     * Any additional common properties which should be injected into the data object.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryLoggerOptions.additionalCommonProperties)
     */
    val additionalCommonProperties: Record<JsString, *>?
}
