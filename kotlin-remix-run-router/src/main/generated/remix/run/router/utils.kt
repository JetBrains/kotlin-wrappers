@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/* import type { Location, Path, To } from "./history"; */

/**
 * @private
 */
external val joinPaths: (paths: Array<String>) -> String

/**
 * @private
 */
external val normalizePathname: (pathname: String) -> String

/**
 * @private
 */
external val normalizeSearch: (search: String) -> String

/**
 * @private
 */
external val normalizeHash: (hash: String) -> String

/**
 * This is a shortcut for creating `application/json` responses. Converts `data`
 * to JSON and sets the `Content-Type` header.
 */
external val json: JsonFunction<*>

/**
 * A redirect response. Sets the status code and the `Location` header.
 * Defaults to "302 Found".
 */
external val redirect: RedirectFunction

/* export {}; */
