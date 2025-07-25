// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * A special value wrapper denoting a value that is safe to not clean.
 * This is to be used when you can guarantee no identifiable information is contained in the value and the cleaning is improperly redacting it.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryTrustedValue)
 */
open external class TelemetryTrustedValue<T : JsAny?> {
    /**
     * The value that is trusted to not contain PII.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryTrustedValue.value)
     */
    val value: T

    /**
     * Creates a new telemetry trusted value.
     *
     * @param value A value to trust
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TelemetryTrustedValue.constructor)
     */
    constructor(value: T)
}
