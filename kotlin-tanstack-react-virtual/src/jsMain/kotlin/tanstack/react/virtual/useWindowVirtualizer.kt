@file:JsModule("@tanstack/react-virtual")

package tanstack.react.virtual

import tanstack.virtual.core.Virtualizer
import web.dom.Element
import web.window.Window

external interface UseWindowVirtualizerOptions<TItemElement : Element> :
    UseVirtualizerOptions<Window, TItemElement> {

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var getScrollElement: dynamic
}

external fun <TItemElement : Element> useWindowVirtualizer(
    options: UseWindowVirtualizerOptions<TItemElement>,
): Virtualizer<Window, TItemElement>
