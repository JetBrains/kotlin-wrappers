package remix.run.router


/**
 * The pathname, search, and hash values of a URL.
 */

sealed external interface Path {
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
