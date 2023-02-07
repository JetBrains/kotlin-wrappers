// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import kotlin.js.Promise

external fun <T> retry(
    name: String,
    method: () -> Promise<T>,
    getStatusCode: (arg0: T) -> Number?,
    maxAttempts: Number = definedExternally,
    delay: Number = definedExternally,
    onError: ((arg0: Error) -> T?)? = definedExternally,
): Promise<T>
