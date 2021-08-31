@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.ComponentType
import react.Props
import react.ReactElement

external interface RouteProps : Props {
    var component: ComponentType<*>
    var render: (props: RouteComponentProps) -> ReactElement?
    var path: Array<out String>
    var exact: Boolean
    var sensitive: Boolean
    var strict: Boolean
}

external interface RouteComponentProps : Props {
    var history: History
    var location: Location
    var match: Match
    var staticContext: StaticContext
}

external val Route: ComponentClass<RouteProps>
