@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

/**
 * The pathname, search, and hash values of a URL.
 */

external interface Path {
    /**
     * A URL pathname, beginning with a /.
     */
    var pathname: String

    /**
     * A URL search string, beginning with a ?.
     */
    var search: String

    /**
     * A URL fragment identifier, beginning with a #.
     */
    var hash: String
}

