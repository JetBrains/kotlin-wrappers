@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.ComponentType
import react.Props
import react.ReactElement

external interface RouteProps : Props, MatchOptions {
    var component: ComponentType<*>
    var render: (props: RouteResultProps) -> ReactElement?
}

external interface RouteComponentProps : Props {
    var history: History
    var location: Location
    var match: Match
    var staticContext: StaticContext
}

external val Route: ComponentClass<RouteProps>
