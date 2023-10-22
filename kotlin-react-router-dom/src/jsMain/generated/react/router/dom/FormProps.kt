package react.router.dom

import web.html.HTMLFormElement


sealed external interface FormProps : react.Props, react.PropsWithRef<HTMLFormElement>, FetcherFormProps {
    /**
     * Forces a full document navigation instead of a fetch.
     */
    var reloadDocument: Boolean?

    /**
     * Replaces the current entry in the browser history stack when the form
     * navigates. Use this if you don't want the user to be able to click "back"
     * to the page with the form on it.
     */
    var replace: Boolean?

    /**
     * State object to add to the history stack entry for this navigation
     */
    var state: Any?

    /**
     * Enable view transitions on this Form navigation
     */
    var unstable_viewTransition: Boolean?
}
