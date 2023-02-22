@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * A PathMatch contains info about how a PathPattern matched on a URL pathname.
 */

external interface PathMatch {
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
     * The pattern that was used to match.
     */
    var pattern: PathPattern
}

