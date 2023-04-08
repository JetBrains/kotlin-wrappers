@file:JsModule("@remix-run/router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/* import type { Location, Path, To } from "./history"; */

external val immutableRouteKeys: js.collections.ReadonlySet<ImmutableRouteKey>

/**
 * @private
 */
external val joinPaths: (paths: js.core.ReadonlyArray<String>) -> String

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

external val defer: DeferFunction

/**
 * A redirect response. Sets the status code and the `Location` header.
 * Defaults to "302 Found".
 */
external val redirect: RedirectFunction

/* export {}; */
