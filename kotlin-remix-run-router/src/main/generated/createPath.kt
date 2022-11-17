@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

/**
 * Creates a string URL path from the given pathname, search, and hash components.
 */
external fun createPath(param: Path): String
