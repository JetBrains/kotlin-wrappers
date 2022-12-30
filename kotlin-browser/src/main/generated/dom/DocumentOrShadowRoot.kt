// Automatically generated - do not modify!

package dom

import js.core.ReadonlyArray
import web.animations.Animation
import web.cssom.CSSStyleSheet
import web.cssom.StyleSheetList

external interface DocumentOrShadowRoot {
    /**
     * Returns the deepest element in the document through which or to which key events are being routed. This is, roughly speaking, the focused element in the document.
     *
     * For the purposes of this API, when a child browsing context is focused, its container is focused in the parent browsing context. For example, if the user moves the focus to a text control in an iframe, the iframe is the element returned by the activeElement API in the iframe's node document.
     *
     * Similarly, when the focused element is in a different node tree than documentOrShadowRoot, the element returned will be the host that's located in the same node tree as documentOrShadowRoot if documentOrShadowRoot is a shadow-including inclusive ancestor of the focused element, and null if not.
     */
    val activeElement: Element?
    var adoptedStyleSheets: ReadonlyArray<CSSStyleSheet>

    /** Returns document's fullscreen element. */
    val fullscreenElement: Element?
    val pictureInPictureElement: Element?
    val pointerLockElement: Element?

    /** Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document. */
    val styleSheets: StyleSheetList

    /**
     * Returns the element for the specified x coordinate and the specified y coordinate.
     * @param x The x-offset
     * @param y The y-offset
     */
    fun elementFromPoint(
        x: Number,
        y: Number,
    ): Element?

    fun elementsFromPoint(
        x: Number,
        y: Number,
    ): ReadonlyArray<Element>

    fun getAnimations(): ReadonlyArray<Animation>
}
