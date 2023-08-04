package react.router.dom

import react.ForwardRefExoticComponent
import remix.run.router.Fetcher


sealed external interface FetcherWithComponents<TData> : Fetcher<TData> {
    var Form: ForwardRefExoticComponent<FetcherFormProps>
    var submit: FetcherSubmitFunction
    var load: (href: String) -> Unit
}
