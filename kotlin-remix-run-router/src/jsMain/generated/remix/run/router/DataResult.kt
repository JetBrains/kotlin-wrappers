@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Result from a loader or action - potentially successful or unsuccessful
 */
typealias DataResult = Any /* SuccessResult | DeferredResult | RedirectResult | ErrorResult */
