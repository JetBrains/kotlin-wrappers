@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Creates a Location object with a unique key from the given Path
 */
external fun createLocation(
    current: String,
    to: To,
    state: Any? = definedExternally,
    key: String = definedExternally,
): Location<*>

external fun createLocation(
    current: Location<*>,
    to: To,
    state: Any? = definedExternally,
    key: String = definedExternally,
): Location<*>
