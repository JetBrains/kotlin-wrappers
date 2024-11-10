// Automatically generated - do not modify!

package web.dom.observers

import js.array.ReadonlyArray
import web.dom.Element
import web.dom.ParentNode

/**
 * provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver)
 */
open external class IntersectionObserver(
    callback: IntersectionObserverCallback,
    options: IntersectionObserverInit = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/root)
     */
    val root: ParentNode /* Element | Document */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/rootMargin)
     */
    val rootMargin: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/thresholds)
     */
    val thresholds: ReadonlyArray<Double>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/disconnect)
     */
    fun disconnect()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/observe)
     */
    fun observe(target: Element)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/takeRecords)
     */
    fun takeRecords(): ReadonlyArray<IntersectionObserverEntry>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserver/unobserve)
     */
    fun unobserve(target: Element)
}
