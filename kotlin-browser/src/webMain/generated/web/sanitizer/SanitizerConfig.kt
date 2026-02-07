// Automatically generated - do not modify!

package web.sanitizer

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SanitizerConfig {
    var attributes: ReadonlyArray<SanitizerAttribute>?
    var comments: Boolean?
    var dataAttributes: Boolean?
    var elements: ReadonlyArray<SanitizerElementWithAttributes>?
    var removeAttributes: ReadonlyArray<SanitizerAttribute>?
    var removeElements: ReadonlyArray<SanitizerElement>?
    var replaceWithChildrenElements: ReadonlyArray<SanitizerElement>?
}
