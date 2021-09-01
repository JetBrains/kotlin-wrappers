@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.*

external interface RouteProps : PropsWithChildren, MatchOptions {
    var component: ComponentType<*>
    @Deprecated(
        message = "Use component or children props with hooks",
    )
    var render: (props: RouteComponentProps) -> ReactElement?
}

external interface RouteComponentProps : Props {
    var history: History
    var location: Location
    var match: Match
    var staticContext: StaticContext
}

external val Route: ComponentClass<RouteProps>
