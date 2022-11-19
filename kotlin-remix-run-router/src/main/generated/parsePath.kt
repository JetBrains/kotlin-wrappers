@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Parses a string URL path into its separate pathname, search, and hash components.
 */
external fun parsePath(path: String): Path
