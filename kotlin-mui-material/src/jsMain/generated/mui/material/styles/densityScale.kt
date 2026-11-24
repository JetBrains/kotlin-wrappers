// Automatically generated - do not modify!

package mui.material.styles

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import seskar.js.JsValue

sealed /* union */
external interface DensityKey {
    companion object {
        @JsValue("xxSmall")
        val xxSmall: DensityKey

        @JsValue("xSmall")
        val xSmall: DensityKey

        @JsValue("small")
        val small: DensityKey

        @JsValue("medium")
        val medium: DensityKey

        @JsValue("large")
        val large: DensityKey

        @JsValue("xLarge")
        val xLarge: DensityKey

        @JsValue("xxLarge")
        val xxLarge: DensityKey
    }
}

sealed /* union */
external interface DensitySizingKey {
    companion object {
        @JsValue("touchTarget")
        val touchTarget: DensitySizingKey

        @JsValue("iconSize")
        val iconSize: DensitySizingKey
    }
}

/**
 * The scale a theme ended up with, in px numbers, for code that needs the
 * values in JS (MUI X derives row heights from `touchTarget + small`). Written
 * to `theme.unstable_densityScale` by `enhanceDensity`.
 */
@JsPlainObject
external interface ResolvedDensityScale {
    val touchTarget: Double
    val iconSize: Double
    val spacing: ReadonlyRecord<DensityKey, Double>
}

/**
 * What `enhanceDensity` accepts as its second argument.
 */
@JsPlainObject
external interface DensityScaleOverrides {
    val touchTarget: Double?
    val iconSize: Double?
    val spacing: ReadonlyRecord<DensityKey, Double>?
}
