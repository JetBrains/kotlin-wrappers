// Automatically generated - do not modify!

package mui.material.styles

import js.array.ReadonlyArray
import js.objects.Record
import kotlinx.js.JsPlainObject
import mui.system.SxProps

@JsPlainObject
external interface ThemeOptions : mui.system.ThemeOptions {
    /**
     * Generate CSS variables for the theme (`theme.vars`), optionally with their configuration.
     */
    val cssVariables: Boolean?

    /**
     * The color schemes the theme supports, e.g. `{ light: true, dark: true }`.
     */
    val colorSchemes: Any? /* Partial<Record<DefaultColorScheme, boolean | ColorSystemOptions>> */

    /**
     * The color scheme used when none is selected.
     */
    val defaultColorScheme: DefaultColorScheme?

    override val mixins: MixinsOptions?

    override val components: Record<String, *>? /* Components<Theme> */

    val motion: MotionOptions?

    override val palette: PaletteOptions?

    override val shadows: ReadonlyArray<String>?

    override val shape: ShapeOptions?

    override val transitions: TransitionsOptions?

    override val typography: TypographyVariantsOptions?

    override val zIndex: ZIndex?

    val focusVisible: Any? /* boolean | FocusVisible */

    val unstable_strictMode: Boolean?

    override val unstable_sxConfig: Any? /* SxConfig */

    val modularCssLayers: Boolean?
}

@JsPlainObject
external interface BaseTheme : mui.system.Theme {
    override val mixins: Mixins

    val motion: Motion

    override val palette: Palette

    override val shadows: ReadonlyArray<String>

    override val shape: Shape

    override val transitions: Transitions

    override val typography: TypographyVariants

    override val zIndex: ZIndex

    val focusVisible: FocusVisible?

    val unstable_strictMode: Boolean?

    override val applyStyles: Any? /* ApplyStyles<SupportedColorScheme> */
}

@JsPlainObject
external interface Theme : BaseTheme {
    val vars: ThemeVars?

    val cssVariables: Boolean? /* false */

    override val components: Record<String, *>? /* Components<BaseTheme> */

    override val unstable_sx: (props: SxProps<Theme>) -> Any /* CSSObject from `@mui/styled-engine` */

    override val unstable_sxConfig: Any? /* SxConfig */

    val alpha: (color: String, value: Any /* Number | String */) -> String

    val lighten: (color: String, coefficient: Any /* Number | String */) -> String

    val darken: (color: String, coefficient: Any /* Number | String */) -> String
}
