@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Successful defer() result from a loader or action
 */

external interface DeferredResult {
    var type: ResultType /* ResultType.deferred */
    var deferredData: DeferredData
}

