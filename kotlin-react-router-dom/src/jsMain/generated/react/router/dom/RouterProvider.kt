@file:JsModule("react-router-dom")

package react.router.dom

import react.router.RouterProviderProps

/**
 * Given a Remix Router instance, render the appropriate UI
 */
external val RouterProvider: react.FC<RouterProviderProps>
