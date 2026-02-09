@file:JsModule("@tanstack/react-router-devtools")

package tanstack.react.router.devtools

import react.FC
import react.Props
import tanstack.react.router.Router
import web.components.ShadowRoot

external interface TanStackRouterDevtoolsProps :
    Props {
    var router: Router?
    var initialIsOpen: Boolean?
    var panelProps: Props?
    var closeButtonProps: Props?
    var toggleButtonProps: Props?
    var position: Position?
    var shadowDOMTarget: ShadowRoot?
    var containerElement: Any? /* or String */
}

external val TanStackRouterDevtools: FC<TanStackRouterDevtoolsProps>
