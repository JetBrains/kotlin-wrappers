// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSFontPaletteValuesRule`** interface represents an @font-palette-values at-rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule)
 */
open external class CSSFontPaletteValuesRule
private constructor() :
    CSSRule {
    /**
     * The read-only **`basePalette`** property of the CSSFontPaletteValuesRule interface indicates the base palette associated with the rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/basePalette)
     */
    val basePalette: String

    /**
     * The read-only **`fontFamily`** property of the CSSFontPaletteValuesRule interface lists the font families the rule can be applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/fontFamily)
     */
    val fontFamily: String

    /**
     * The read-only **`name`** property of the CSSFontPaletteValuesRule interface represents the name identifying the associated @font-palette-values at-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/name)
     */
    val name: String

    /**
     * The read-only **`overrideColors`** property of the CSSFontPaletteValuesRule interface is a string containing a list of color index and color pair that are to be used instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/overrideColors)
     */
    val overrideColors: String
}
