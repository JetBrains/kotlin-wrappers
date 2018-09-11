package styled

@JsModule("css-in-js-utils")
external object CssInJsUtils {
    // Merges deep style objects similar to Object.assign.
    fun assignStyle(base: dynamic, vararg extend: dynamic): dynamic

    // Converts the property to camelCase.
    fun camelCaseProperty(property: String): String

    // Generates a CSS declaration (property:value) string.
    fun cssifyDeclaration(property: String, value: Any): String

    // Generates a CSS string using all key-property pairs in object. It automatically removes declarations with value types other than number and string.
    fun cssifyObject(obj: dynamic): String

    // Converts the property to hyphen-case.
    fun hyphenateProperty(property: String): String

    // Checks if a property includes a vendor prefix.
    fun isPrefixedProperty(property: String): Boolean

    // Checks if a value includes vendor prefixes.
    fun isPrefixedValue(value: Any): Boolean

    // Checks if a property accepts unitless values.
    fun isUnitlessProperty(property: String): Boolean

    // Normalizes the property by unprefixing and camelCasing it.
    fun normalizeProperty(property: String): String

    // Concatenates array values to single CSS value.
    fun resolveArrayValue(property: String, value: Any): String

    // Removes the vendor prefix (if set) from the property.
    fun unprefixProperty(property: String): String

    // Removes all vendor prefixes (if any) from the value.
    fun unprefixValue(value: Any): String
}
