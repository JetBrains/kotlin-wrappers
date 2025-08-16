package web.components

import js.core.JsAny
import kotlin.js.definedExternally

external interface CustomElement {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#connectedcallback)
     */
    val connectedCallback: (() -> Unit)?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#disconnectedcallback)
     */
    val disconnectedCallback: (() -> Unit)?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#adoptedcallback)
     */
    val adoptedCallback: (() -> Unit)?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#attributechangedcallback)
     */
    val attributeChangedCallback: AttributeChangedCallback?
        get() = definedExternally
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components#attributechangedcallback)
 */
typealias AttributeChangedCallback = (
    name: String,
    oldValue: JsAny?,
    newValue: JsAny?,
) -> Unit
