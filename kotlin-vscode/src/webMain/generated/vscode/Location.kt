// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * Represents a location inside a resource, such as a line
 * inside a text file.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Location)
 */
open external class Location {
    /**
     * The resource identifier of this location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Location.uri)
     */
    var uri: Uri

    /**
     * The document range of this location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Location.range)
     */
    var range: Range

    /**
     * Creates a new location object.
     *
     * @param uri The resource identifier.
     * @param rangeOrPosition The range or position. Positions will be converted to an empty range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Location.constructor)
     */
    constructor(
        uri: Uri,
        rangeOrPosition: JsAny, /* Range | Position */
    )
}
