@file:JsModule("react-virtual")
@file:JsNonModule

package react.virtual

import org.w3c.dom.Window
import react.RefObject

external interface ScrollOptions<T : Any> {
    var parentRef: RefObject<T>?
    var windowRef: RefObject<Window>?
    var horizontal: Boolean?
    var useObserver: SizeObserver<T>?
    var useWindowObserver: SizeObserver<Window>?
    var initialRect: Size?
}

external interface ScrollInstance {
    var outerSize: Int
    var scrollOffset: Int
    var scrollToFn: (
        offset: Int,
        reason: ScrollReason,
    ) -> Unit
}

external fun <T : Any> useDefaultScroll(
    options: ScrollOptions<T>,
): ScrollInstance
