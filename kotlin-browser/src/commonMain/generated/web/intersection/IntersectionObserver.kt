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
     * The **`root`** read-only property of the IntersectionObserver interface identifies the Element or Document whose bounds are treated as the bounding box of the viewport for the element which is the observer's target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/root)
     */
    val root: ParentNode /* Element | Document */?

    /**
     * The **`rootMargin`** read-only property of the IntersectionObserver interface is a string with syntax similar to that of the CSS margin property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/rootMargin)
     */
    val rootMargin: String

    /**
     * The **`scrollMargin`** read-only property of the IntersectionObserver interface adds a margin to all nested scroll container within the root element, including the root element if it is a scroll container.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/scrollMargin)
     */
    val scrollMargin: String

    /**
     * The **`thresholds`** read-only property of the IntersectionObserver interface returns the list of intersection thresholds that was specified when the observer was instantiated with IntersectionObserver.IntersectionObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/thresholds)
     */
    val thresholds: ReadonlyArray<JsDouble>

    /**
     * The **`disconnect()`** method of the IntersectionObserver interface stops the observer watching all of its target elements for visibility changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/disconnect)
     */
    fun disconnect()

    /**
     * The **`observe()`** method of the IntersectionObserver interface adds an element to the set of target elements being watched by the `IntersectionObserver`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/observe)
     */
    fun observe(target: Element)

    /**
     * The **`takeRecords()`** method of the IntersectionObserver interface returns an array of IntersectionObserverEntry objects, one for each targeted element which has experienced an intersection change since the last time the intersections were checked, either explicitly through a call to this method or implicitly by an automatic call to the observer's callback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/takeRecords)
     */
    fun takeRecords(): ReadonlyArray<IntersectionObserverEntry>

    /**
     * The **`unobserve()`** method of the IntersectionObserver interface instructs the `IntersectionObserver` to stop observing the specified target element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/unobserve)
     */
    fun unobserve(target: Element)
}
