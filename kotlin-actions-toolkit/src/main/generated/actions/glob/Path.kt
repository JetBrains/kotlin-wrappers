// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import js.core.ReadonlyArray

external class Path {
    var segments: ReadonlyArray<String>

    /**
     * Constructs a Path
     * @param itemPath Path or array of segments
     */
    constructor(itemPath: String)

    constructor(itemPath: ReadonlyArray<String>)

    /**
     * Converts the path to it's string representation
     */
    override fun toString(): String
}
