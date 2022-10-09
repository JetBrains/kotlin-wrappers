@file:JsModule("@tanstack/react-virtual")
@file:JsNonModule

package tanstack.react.virtual

import dom.html.Window
import tanstack.virtual.core.Virtualizer

external interface UseWindowVirtualizerOptions<TItemElement> :
    UseVirtualizerOptions<Window, TItemElement> {

    @Deprecated(message = "Excluded property", level = DeprecationLevel.HIDDEN)
    override var getScrollElement: dynamic
}

external fun <TItemElement : Any> useWindowVirtualizer(
    options: UseWindowVirtualizerOptions<TItemElement>,
): Virtualizer<Window, TItemElement>
