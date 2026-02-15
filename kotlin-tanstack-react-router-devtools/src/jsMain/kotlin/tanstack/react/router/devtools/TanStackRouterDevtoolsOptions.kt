package tanstack.react.router.devtools

import react.Props
import react.dom.html.ButtonHTMLAttributes
import react.dom.html.HTMLAttributes
import tanstack.react.router.Router
import web.components.ShadowRoot
import web.html.HTMLButtonElement
import web.html.HTMLDivElement

external interface TanStackRouterDevtoolsOptions :
    Props {
    /**
     * Set this true if you want the dev tools to default to being open
     */
    var initialIsOpen: Boolean?

    /**
     * Use this to add props to the panel. For example, you can add className, style (merge and override default style), etc.
     */
    var panelProps: HTMLAttributes<HTMLDivElement>?

    /**
     * Use this to add props to the close button. For example, you can add className, style (merge and override default style), onClick (extend default handler), etc.
     */
    var closeButtonProps: ButtonHTMLAttributes<HTMLButtonElement>?

    /**
     * Use this to add props to the toggle button. For example, you can add className, style (merge and override default style), onClick (extend default handler), etc.
     */
    var toggleButtonProps: ButtonHTMLAttributes<HTMLButtonElement>?

    /**
     * The position of the TanStack Router logo to open and close the devtools panel.
     * Defaults to 'bottom-left'.
     */
    var position: Position?

    /**
     * Use this to render the devtools inside a different type of container element for a11y purposes.
     * Any string which corresponds to a valid intrinsic JSX element is allowed.
     * Defaults to 'footer'.
     */
    var containerElement: Any?

    /**
     * The router instance to use for the devtools.
     */
    var router: Router?

    /**
     * Use this to attach the devtool's styles to specific element in the DOM.
     */
    var shadowDOMTarget: ShadowRoot?
}
