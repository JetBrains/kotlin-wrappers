// Automatically generated - do not modify!

package web.intersection

import js.array.ReadonlyArray
import js.core.JsDouble
import web.dom.Element
import web.dom.ParentNode
import kotlin.js.definedExternally

/**
 * The **`IntersectionObserver`** interface of the Intersection Observer API provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver)
 */
open external class IntersectionObserver(
    callback: IntersectionObserverCallback,
    options: IntersectionObserverInit = definedExternally,
) {
    /**
     * The IntersectionObserver interface's read-only **`root`** property identifies the Element or of the viewport for the element which is the observer's target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/root)
     */
    val root: ParentNode /* Element | Document */?

    /**
     * The IntersectionObserver interface's read-only **`rootMargin`** property is a string with syntax similar to that of the CSS margin property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/rootMargin)
     */
    val rootMargin: String

    /**
     * The IntersectionObserver interface's read-only **`thresholds`** property returns the list of intersection thresholds that was specified when the observer was instantiated with only one threshold ratio was provided when instantiating the object, this will be an array containing that single value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/thresholds)
     */
    val thresholds: ReadonlyArray<JsDouble>

    /**
     * The IntersectionObserver method **`disconnect()`** stops watching all of its target elements for visibility changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/disconnect)
     */
    fun disconnect()

    /**
     * The IntersectionObserver method **`observe()`** adds an element to the set of target elements being watched by the `IntersectionObserver`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/observe)
     */
    fun observe(target: Element)

    /**
     * The IntersectionObserver method **`takeRecords()`** returns an array of has experienced an intersection change since the last time the intersections were checked, either explicitly through a call to this method or implicitly by an automatic call to the observer's callback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/takeRecords)
     */
    fun takeRecords(): ReadonlyArray<IntersectionObserverEntry>

    /**
     * The IntersectionObserver method **`unobserve()`** instructs the `IntersectionObserver` to stop observing the specified target element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/unobserve)
     */
    fun unobserve(target: Element)
}
