@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import react.ComponentClass
import react.ComponentType
import react.Props
import react.ReactElement

external interface RouteProps : Props {
    var path: Array<out String>
    var exact: Boolean
    var strict: Boolean
    var component: ComponentType<*>
    var render: (props: RouteResultProps) -> ReactElement?
}

external interface RouteResultProps : Props {
    var history: History
    var location: Location
    var match: Match
}

external val Route: ComponentClass<RouteProps>

