@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import react.FC
import react.Props

external interface RouterProviderProps :
    Props {
    var router: Router
    var context: Any?
}

/**
 * Top-level component that renders the active route matches and provides the
 * router to the React tree via context.
 *
 * Accepts the same options as `createRouter` via props to update the router
 * instance after creation.
 *
 * [Online Documentation](https://tanstack.com/router/latest/docs/framework/react/api/router/createRouterFunction)
 */
external val RouterProvider: FC<RouterProviderProps>
