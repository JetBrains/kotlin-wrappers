@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Creates a string URL path from the given pathname, search, and hash components.
 */
external fun createPath(options: Path): String
