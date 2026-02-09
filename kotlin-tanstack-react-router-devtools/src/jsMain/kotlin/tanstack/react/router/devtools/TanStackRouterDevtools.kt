@file:JsModule("@tanstack/react-router-devtools")

package tanstack.react.router.devtools

import react.FC
import react.Props
import react.dom.html.ButtonHTMLAttributes
import react.dom.html.HTMLAttributes
import tanstack.react.router.Router
import web.components.ShadowRoot
import web.html.HTMLButtonElement
import web.html.HTMLDivElement

external interface TanStackRouterDevtoolsProps :
    Props {
    var router: Router?
    var initialIsOpen: Boolean?
    var panelProps: HTMLAttributes<HTMLDivElement>?
    var closeButtonProps: ButtonHTMLAttributes<HTMLButtonElement>?
    var toggleButtonProps: ButtonHTMLAttributes<HTMLButtonElement>?
    var position: Position?
    var shadowDOMTarget: ShadowRoot?
    var containerElement: Any? /* or String */
}

external val TanStackRouterDevtools: FC<TanStackRouterDevtoolsProps>
