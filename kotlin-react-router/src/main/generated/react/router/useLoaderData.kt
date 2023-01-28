@file:JsModule("react-router/hooks")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


/**
 * Returns the loader data for the nearest ancestor Route loader
 */
external fun useLoaderData(): Any?
