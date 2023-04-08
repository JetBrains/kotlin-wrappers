@file:JsModule("react-router-dom")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom


/**
 * Interacts with route loaders and actions without causing a navigation. Great
 * for any interaction that stays on the same page.
 */
external fun <TData /* default is Any? */> useFetcher(): FetcherWithComponents<TData>
