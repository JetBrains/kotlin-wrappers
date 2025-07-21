// Automatically generated - do not modify!

package web.components

import web.dom.DocumentFragment
import web.html.HTMLElement

/**
 * The **`HTMLTemplateElement`** interface enables access to the contents of an HTML template element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement)
 */
open external class HTMLTemplateElement
protected constructor() :
    HTMLElement {
    /**
     * The **`HTMLTemplateElement.content`** property returns a `<template>` element's template contents (a DocumentFragment).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/content)
     */
    val content: DocumentFragment

    /**
     * The **`shadowRootClonable`** property reflects the value of the `shadowrootclonable` attribute of the associated `<template>` element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootClonable)
     */
    var shadowRootClonable: Boolean

    /**
     * The **`shadowRootDelegatesFocus`** property of the HTMLTemplateElement interface reflects the value of the `shadowrootdelegatesfocus` attribute of the associated `<template>` element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootDelegatesFocus)
     */
    var shadowRootDelegatesFocus: Boolean

    /**
     * The **`shadowRootMode`** property of the HTMLTemplateElement interface reflects the value of the `shadowrootmode` attribute of the associated `<template>` element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootMode)
     */
    var shadowRootMode: String

    /**
     * The **`shadowRootSerializable`** property reflects the value of the `shadowrootserializable` attribute of the associated `<template>` element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootSerializable)
     */
    var shadowRootSerializable: Boolean
}
