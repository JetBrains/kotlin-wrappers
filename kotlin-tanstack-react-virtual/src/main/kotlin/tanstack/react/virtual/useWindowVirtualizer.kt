@file:JsModule("@tanstack/react-virtual")
@file:JsNonModule

package tanstack.react.virtual

import dom.Element
import dom.html.Window
import tanstack.virtual.core.Virtualizer

external interface UseWindowVirtualizerOptions<TItemElement : Element> :
    UseVirtualizerOptions<Window, TItemElement> {

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var getScrollElement: dynamic
}

external fun <TItemElement : Element> useWindowVirtualizer(
    options: UseWindowVirtualizerOptions<TItemElement>,
): Virtualizer<Window, TItemElement>
