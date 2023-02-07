package js.json

import js.core.ReadonlyArray

external object JSON {
    /**
     * Converts a JavaScript Object Notation (JSON) string into an object.
     * @param text A valid JSON string.
     * @param reviver A function that transforms the results. This function is called for each member of the object.
     * If a member contains nested objects, the nested objects are transformed before the parent object is.
     */
    fun parse(
        text: String,
        reviver: (key: String, value: Any?) -> Any? = definedExternally,
    ): dynamic

    /**
     * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
     * @param value A JavaScript value, usually an object or array, to be converted.
     * @param replacer A function that transforms the results.
     * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
     */
    fun stringify(
        value: Any?,
        replacer: (key: String, value: Any?) -> Any? = definedExternally,
        space: String = definedExternally,
    ): String

    fun stringify(
        value: Any?,
        replacer: (key: String, value: Any?) -> Any? = definedExternally,
        space: Int = definedExternally,
    ): String

    /**
     * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
     * @param value A JavaScript value, usually an object or array, to be converted.
     * @param replacer An array of strings and numbers that acts as an approved list for selecting the object properties that will be stringified.
     * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
     */
    fun stringify(
        value: Any?,
        replacer: ReadonlyArray<Any /* number | string */> = definedExternally,
        space: String = definedExternally,
    ): String

    fun stringify(
        value: Any?,
        replacer: ReadonlyArray<Any /* number | string */> = definedExternally,
        space: Int = definedExternally,
    ): String
}
