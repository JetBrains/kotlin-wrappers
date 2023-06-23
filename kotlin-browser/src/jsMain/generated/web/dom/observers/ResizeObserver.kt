// Automatically generated - do not modify!

package web.dom.observers

import web.dom.Element

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver) */
external class ResizeObserver(
    callback: ResizeObserverCallback,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/disconnect) */
    fun disconnect()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/observe) */
    fun observe(
        target: Element,
        options: ResizeObserverOptions = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/unobserve) */
    fun unobserve(target: Element)
}
