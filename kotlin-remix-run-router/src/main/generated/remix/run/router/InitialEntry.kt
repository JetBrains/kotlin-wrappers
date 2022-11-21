@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * A user-supplied object that describes a location. Used when providing
 * entries to `createMemoryHistory` via its `initialEntries` option.
 */
typealias InitialEntry = Any /* string | Partial<Location> */
