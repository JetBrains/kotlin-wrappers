@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Creates a Location object with a unique key from the given Path
 */
external fun createLocation(current: String, to: To, state: Any? = definedExternally, key: String = definedExternally): Location

external fun createLocation(current: Location, to: To, state: Any? = definedExternally, key: String = definedExternally): Location
