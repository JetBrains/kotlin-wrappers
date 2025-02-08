@file:JsModule("@tanstack/react-virtual")

package tanstack.react.virtual

import tanstack.virtual.core.Virtualizer
import web.dom.Element
import web.window.Window

external fun <TItemElement : Element> useWindowVirtualizer(
    options: UseWindowVirtualizerOptions<TItemElement>,
): Virtualizer<Window, TItemElement>
