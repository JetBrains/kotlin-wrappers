@file:JsModule("react-router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router


/**
 * Given a Remix Router instance, render the appropriate UI
 */
external val RouterProvider: react.FC<RouterProviderProps>
