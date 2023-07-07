@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Parses a string URL path into its separate pathname, search, and hash components.
 */
external fun parsePath(path: String): Path
