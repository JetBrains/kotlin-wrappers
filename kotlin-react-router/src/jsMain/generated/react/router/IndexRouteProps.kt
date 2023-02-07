@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.ActionFunction
import remix.run.router.LoaderFunction
import remix.run.router.ShouldRevalidateFunction


external interface IndexRouteProps : react.Props {
    var caseSensitive: Boolean?
    var path: String?
    var id: String?
    var loader: LoaderFunction?
    var action: ActionFunction?
    var hasErrorBoundary: Boolean?
    var shouldRevalidate: ShouldRevalidateFunction?
    var handle: Any?
    var index: Boolean
    var children: Any? /* some expression */
    var element: react.ReactNode?
    var errorElement: react.ReactNode?
}

