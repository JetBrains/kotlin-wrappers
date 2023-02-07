@file:JsModule("css-in-js-utils")
@file:JsNonModule

package styled

/**
 * Merges deep style objects similar to `Object.assign`.
 */
external fun assignStyle(base: dynamic, vararg extend: dynamic): dynamic

/**
 * Converts the property to camelCase.
 */
external fun camelCaseProperty(property: String): String

/**
 * Generates a CSS declaration (property:value) string.
 */
external fun cssifyDeclaration(property: String, value: Any): String

/**
 * Generates a CSS string using all key-property pairs in object. It automatically removes declarations with value types other than number and string.
 */
external fun cssifyObject(obj: dynamic): String

/**
 * Converts the property to hyphen-case.
 */
external fun hyphenateProperty(property: String): String

/**
 * Checks if a property includes a vendor prefix.
 */
external fun isPrefixedProperty(property: String): Boolean

/**
 * Checks if a value includes vendor prefixes.
 */
external fun isPrefixedValue(value: Any): Boolean

/**
 * Checks if a property accepts unitless values.
 */
external fun isUnitlessProperty(property: String): Boolean

/**
 * Normalizes the property by unprefixing and camelCasing it.
 */
external fun normalizeProperty(property: String): String

/**
 * Concatenates array values to single CSS value.
 */
external fun resolveArrayValue(property: String, value: Any): String

/**
 * Removes the vendor prefix (if set) from the property.
 */
external fun unprefixProperty(property: String): String

/**
 * Removes all vendor prefixes (if any) from the value.
 */
external fun unprefixValue(value: Any): String
