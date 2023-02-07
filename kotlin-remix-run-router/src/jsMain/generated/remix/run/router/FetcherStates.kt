@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Potential states for fetchers
 */

external interface FetcherStates<TData /* default is Any? */> {
    var Idle: FetcherStatesIdle<TData>
    var Loading: FetcherStatesLoading<TData>
    var Submitting: FetcherStatesSubmitting<TData>
}

