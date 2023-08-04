package react.router.dom

import remix.run.router.HTMLFormMethod
import remix.run.router.RelativeRoutingType
import web.html.HTMLFormElement


sealed external interface FetcherFormProps : react.Props, react.dom.html.FormHTMLAttributes<HTMLFormElement> {
    /**
     * The HTTP verb to use when the form is submit. Supports "get", "post",
     * "put", "delete", "patch".
     */
    @Deprecated(message = "use routerMethod", level = DeprecationLevel.HIDDEN)
    override var method: String?

    @JsName("method")
    var routerMethod: HTMLFormMethod?

    /**
     * `<form encType>` - enhancing beyond the normal string type and limiting
     * to the built-in browser supported values
     */
    @Deprecated(message = "use routerEncType", level = DeprecationLevel.HIDDEN)
    override var encType: String?

    @JsName("encType")
    var routerEncType: FetcherFormPropsEncType?

    /**
     * Normal `<form action>` but supports React Router's relative paths.
     */
    override var action: String?

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
