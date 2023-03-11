@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * A PathPattern is used to match on some portion of a URL pathname.
 */

external interface PathPattern {
    /**
     * A string to match against a URL pathname. May contain `:id`-style segments
     * to indicate placeholders for dynamic parameters. May also end with `&#47;*` to
     * indicate matching the rest of the URL pathname.
     */
    var path: Path

    /**
     * Should be `true` if the static portions of the `path` should be matched in
     * the same case.
     */
    var caseSensitive: Boolean?

    /**
     * Should be `true` if this pattern should match the entire URL pathname.
     */
    var end: Boolean?
}
