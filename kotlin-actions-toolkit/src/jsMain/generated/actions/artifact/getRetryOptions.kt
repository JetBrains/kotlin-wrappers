// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.objects.ReadonlyRecord

external fun getRetryOptions(
    defaultOptions: ReadonlyRecord<String, Any>, /* OctokitOptions */
    retries: Number = definedExternally,
    exemptStatusCodes: ReadonlyArray<Number> = definedExternally,
): JsTuple2<RetryOptions, ReadonlyRecord<String, Any>? /* RequestRequestOptions? */>
