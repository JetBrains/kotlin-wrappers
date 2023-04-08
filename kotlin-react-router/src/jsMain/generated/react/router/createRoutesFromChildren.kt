@file:JsModule("react-router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


/**
 * Creates a route config from a React "children" object, which is usually
 * either a `<Route>` element or an array of them. Used internally by
 * `<Routes>` to create a route config from its children.
 *
 * @see https://reactrouter.com/utils/create-routes-from-children
 */
external fun createRoutesFromChildren(children: react.ReactNode, parentPath: js.core.ReadonlyArray<Double> = definedExternally): js.core.ReadonlyArray<RouteObject>
