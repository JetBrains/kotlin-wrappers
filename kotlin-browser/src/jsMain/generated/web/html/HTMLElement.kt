// Automatically generated - do not modify!

package web.html

import web.cssom.ElementCSSInlineStyle
import web.dom.Element
import web.dom.GlobalEventHandlers
import web.dom.HTMLOrSVGElement

/**
 * Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement)
 */
abstract external class HTMLElement :
    Element,
    ElementCSSInlineStyle,
    ElementContentEditable,
    GlobalEventHandlers,
    HTMLOrSVGElement {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKey) */
    var accessKey: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKeyLabel) */
    val accessKeyLabel: String
    var autocapitalize: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dir) */
    var dir: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/draggable) */
    var draggable: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidden) */
    var hidden: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inert) */
    var inert: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/innerText) */
    var innerText: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lang) */
    var lang: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetHeight) */
    val offsetHeight: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetLeft) */
    val offsetLeft: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetParent) */
    val offsetParent: Element?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetTop) */
    val offsetTop: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetWidth) */
    val offsetWidth: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/outerText) */
    var outerText: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/popover) */
    var popover: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/spellcheck) */
    var spellcheck: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/title) */
    var title: String
    var translate: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/attachInternals) */
    fun attachInternals(): ElementInternals

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/click) */
    fun click()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidePopover) */
    fun hidePopover()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/showPopover) */
    fun showPopover()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover) */
    fun togglePopover(force: Boolean = definedExternally): Boolean
}
