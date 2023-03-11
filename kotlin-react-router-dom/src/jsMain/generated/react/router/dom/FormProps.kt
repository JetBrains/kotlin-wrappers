@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import react.router.RelativeRoutingType
import remix.run.router.FormMethod
import web.html.HTMLFormElement


external interface FormProps : react.Props, react.PropsWithRef<HTMLFormElement>, react.dom.html.FormHTMLAttributes<HTMLFormElement> {
    /**
     * The HTTP verb to use when the form is submit. Supports "get", "post",
     * "put", "delete", "patch".
     */
    @Deprecated(message = "use routerMethod", level = DeprecationLevel.HIDDEN)
    override var method: String?

    @JsName("method")
    var routerMethod: FormMethod?

    /**
     * Normal `<form action>` but supports React Router's relative paths.
     */
    override var action: String?

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
     * Determines whether the form action is relative to the route hierarchy or
     * the pathname.  Use this if you want to opt out of navigating the route
     * hierarchy and want to instead route based on /-delimited URL segments
     */
    var relative: RelativeRoutingType?

    /**
     * Prevent the scroll position from resetting to the top of the viewport on
     * completion of the navigation when using the <ScrollRestoration> component
     */
    var preventScrollReset: Boolean?

    /**
     * A function to call when the form is submitted. If you call
     * `event.preventDefault()` then this form will not do anything.
     */
    override var onSubmit: react.dom.events.FormEventHandler<HTMLFormElement>?
}
