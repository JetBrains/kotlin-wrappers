@file:JsModule("@remix-run/router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Performs pattern matching on a URL pathname and returns information about
 * the match.
 *
 * @see https://reactrouter.com/utils/match-path
 */
external fun matchPath(pattern: PathPattern, pathname: String): PathMatch?

external fun matchPath(pattern: String, pathname: String): PathMatch?
