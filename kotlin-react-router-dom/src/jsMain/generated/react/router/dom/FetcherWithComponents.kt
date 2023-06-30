@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import react.ForwardRefExoticComponent
import remix.run.router.Fetcher


sealed external interface FetcherWithComponents<TData> : Fetcher<TData> {
    var Form: ForwardRefExoticComponent<FormProps>
    var submit: FetcherSubmitFunction
    var load: (href: String) -> Unit
}
