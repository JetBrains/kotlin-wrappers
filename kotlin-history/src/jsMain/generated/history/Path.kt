// Automatically generated - do not modify!

package history

/**
 * The pathname, search, and hash values of a URL.
 */
external interface Path {
    /**
     * A URL pathname, beginning with a /.
     *
     * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.pathname
     */
    var pathname: Pathname

    /**
     * A URL search string, beginning with a ?.
     *
     * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.search
     */
    var search: Search

    /**
     * A URL fragment identifier, beginning with a #.
     *
     * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.hash
     */
    var hash: Hash
}
