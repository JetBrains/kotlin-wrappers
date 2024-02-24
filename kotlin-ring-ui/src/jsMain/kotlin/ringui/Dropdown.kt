@file:JsModule("@jetbrains/ring-ui/components/dropdown/dropdown")

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName
import web.events.Event

external interface AnchorProps : PropsWithChildren, PropsWithClassName

external val Anchor: ComponentClass<AnchorProps>

external interface DropdownProps : PropsWithClassName {
    /**
     * Can be string, React element, or a function accepting an object with {active, pinned} properties and returning a React element
     * React element should render some interactive HTML element like `button` or `a`
     */
    var anchor: dynamic //: PropTypes.oneOfType([PropTypes.node, PropTypes.func]).isRequired,
    var initShown: Boolean
    var activeClassName: String
    var clickMode: Boolean
    var hoverMode: Boolean
    var hoverShowTimeOut: Int
    var hoverHideTimeOut: Int
    var onShow: () -> Unit
    var onHide: () -> Unit
    var onMouseEnter: (Event<*>) -> Unit
    var onMouseLeave: (Event<*>) -> Unit
    //'data-test': PropTypes.string
}

@JsName("default")
external val Dropdown: ComponentClass<DropdownProps>
