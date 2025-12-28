package tanstack.router.core

import tanstack.history.ParsedHistoryState

external interface ParsedLocation {
    /**
     * The full path of the location, including pathname, search, and hash.
     * Does not include the origin. Is the equivalent of calling
     * `url.replace(url.origin, '')`
     */
    val href: String

    /**
     * @description The pathname of the location, including the leading slash.
     */
    val pathname: String

    /**
     * The parsed search parameters of the location in object form.
     */
    val search: Search

    /**
     * The search string of the location, including the leading question mark.
     */
    val searchStr: String

    /**
     * The in-memory state of the location as it *may* exist in the browser's history.
     */
    val state: ParsedHistoryState

    /**
     * The hash of the location, including the leading hash character.
     */
    val hash: String

    /**
     * The masked location of the location.
     */
    val maskedLocation: ParsedLocation?

    /**
     * Whether to unmask the location on reload.
     */
    val unmaskOnReload: Boolean?

    /**
     * @private
     * @description The public href of the location.
     * If a rewrite is applied, the `href` property will be the rewritten URL.
     */
    val publicHref: String
}
