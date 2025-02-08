package tanstack.react.virtual

import web.dom.Element
import web.window.Window

external interface UseWindowVirtualizerOptions<TItemElement : Element> :
    UseVirtualizerOptions<Window, TItemElement> {

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var getScrollElement: dynamic
}
