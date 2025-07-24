// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * Represents a location inside a resource, such as a line
 * inside a text file.
 */
open external class Location {
    /**
     * The resource identifier of this location.
     */
    var uri: Uri

    /**
     * The document range of this location.
     */
    var range: Range

    /**
     * Creates a new location object.
     *
     * @param uri The resource identifier.
     * @param rangeOrPosition The range or position. Positions will be converted to an empty range.
     */
    constructor(
        uri: Uri,
        rangeOrPosition: JsAny, /* Range | Position */
    )
}
