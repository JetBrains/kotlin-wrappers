// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.errors.JsError
import js.promise.Promise

external class RetryHelper {
    constructor(
        maxAttempts: Number,
        minSeconds: Number,
        maxSeconds: Number,
    )

    fun <T> execute(
        action: () -> Promise<T>,
        isRetryable: (e: JsError) -> Boolean = definedExternally,
    ): Promise<T>
}
