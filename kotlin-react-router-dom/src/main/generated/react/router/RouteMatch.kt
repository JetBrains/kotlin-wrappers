// Automatically generated - do not modify!

package react.router

/**
 * A RouteMatch contains info about how a route matched a URL.
 */
external interface RouteMatch {
    /**
     * The names and values of dynamic parameters in the URL.
     */
    var params: Params

    /**
     * The portion of the URL pathname that was matched.
     */
    var pathname: String

    /**
     * The portion of the URL pathname that was matched before child routes.
     */
    var pathnameBase: String

    /**
     * The route object that was used to match.
     */
    var route: RouteObject
}
