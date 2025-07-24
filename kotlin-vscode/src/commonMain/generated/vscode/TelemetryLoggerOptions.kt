// Automatically generated - do not modify!

package vscode

import js.core.JsString
import js.objects.Record

/**
 * Options for creating a {@link TelemetryLogger}
 */
external interface TelemetryLoggerOptions {
    /**
     * Whether or not you want to avoid having the built-in common properties such as os, extension name, etc injected into the data object.
     * Defaults to `false` if not defined.
     */
    val ignoreBuiltInCommonProperties: Boolean?

    /**
     * Whether or not unhandled errors on the extension host caused by your extension should be logged to your sender.
     * Defaults to `false` if not defined.
     */
    val ignoreUnhandledErrors: Boolean?

    /**
     * Any additional common properties which should be injected into the data object.
     */
    val additionalCommonProperties: Record<JsString, *>?
}
