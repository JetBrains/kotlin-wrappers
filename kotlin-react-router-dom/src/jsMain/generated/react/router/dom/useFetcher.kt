@file:JsModule("react-router-dom")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom


/**
 * Interacts with route loaders and actions without causing a navigation. Great
 * for any interaction that stays on the same page.
 */
external fun <TData /* default is Any? */> useFetcher(): FetcherWithComponents<TData>
