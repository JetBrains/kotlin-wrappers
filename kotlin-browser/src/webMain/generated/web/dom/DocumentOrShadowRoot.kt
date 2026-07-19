// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

import js.array.ReadonlyArray
import js.internal.InternalApi
import web.animations.Animation
import web.components.CustomElementRegistry
import web.cssom.CSSStyleSheet
import web.cssom.StyleSheetList

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface DocumentOrShadowRoot {
    /**
     * The **`activeElement`** read-only property of the Document interface returns the Element within the DOM that is receiving keyboard events such as keydown and keyup. This is usually analogous to the focused element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/activeElement)
     */
    val activeElement: Element?
        get() = definedExternally

    /**
     * The **`adoptedStyleSheets`** property of the Document interface is used for setting an array of constructed stylesheets to be used by the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptedStyleSheets)
     */
    var adoptedStyleSheets: ReadonlyArray<CSSStyleSheet>
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`customElementRegistry`** read-only property of the Document interface returns the CustomElementRegistry object associated with this document, or null if one has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/customElementRegistry)
     */
    val customElementRegistry: CustomElementRegistry?
        get() = definedExternally

    /**
     * The **`Document.fullscreenElement`** read-only property returns the Element that is currently being presented in fullscreen mode in this document, or null if fullscreen mode is not currently in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenElement)
     */
    val fullscreenElement: Element?
        get() = definedExternally

    /**
     * The read-only **`pictureInPictureElement`** property of the Document interface returns the Element that is currently being presented in picture-in-picture mode in this document, or null if picture-in-picture mode is not currently in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pictureInPictureElement)
     */
    val pictureInPictureElement: Element?
        get() = definedExternally

    /**
     * The **`pointerLockElement`** read-only property of the Document interface provides the element set as the target for mouse events while the pointer is locked. It is null if lock is pending, pointer is unlocked, or the target is in another document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/pointerLockElement)
     */
    val pointerLockElement: Element?
        get() = definedExternally

    /**
     * The **`styleSheets`** read-only property of the Document interface returns a StyleSheetList of CSSStyleSheet objects, for stylesheets explicitly linked into or embedded in a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/styleSheets)
     */
    val styleSheets: StyleSheetList
        get() = definedExternally

    /**
     * The **`elementFromPoint()`** method, available on the Document object, returns the topmost Element at the specified coordinates (relative to the viewport).
     */
    fun elementFromPoint(
        x: Double,
        y: Double,
    ): Element? = definedExternally

    /**
     * The **`elementsFromPoint()`** method of the Document interface returns an array of all elements at the specified coordinates (relative to the viewport). The elements are ordered from the topmost to the bottommost box of the viewport.
     */
    fun elementsFromPoint(
        x: Double,
        y: Double,
    ): ReadonlyArray<Element> = definedExternally

    /**
     * The **`getAnimations()`** method of the Document interface returns an array of all Animation objects currently in effect whose target elements are descendants of the document. This array includes CSS Animations, CSS Transitions, and Web Animations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getAnimations)
     */
    fun getAnimations(): ReadonlyArray<Animation> = definedExternally
}
