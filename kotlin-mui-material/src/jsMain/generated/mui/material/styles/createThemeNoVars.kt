// Automatically generated - do not modify!

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material.styles

import js.array.ReadonlyArray
import mui.system.SxProps

external interface ThemeOptions : mui.system.ThemeOptions {
    /**
     * Generate CSS variables for the theme (`theme.vars`), optionally with their configuration.
     */
    var cssVariables: Boolean?

    /**
     * The color schemes the theme supports, e.g. `{ light: true, dark: true }`.
     */
    var colorSchemes: Any? /* Partial<Record<DefaultColorScheme, boolean | ColorSystemOptions>> */

    /**
     * The color scheme used when none is selected.
     */
    var defaultColorScheme: DefaultColorScheme?

    override var mixins: MixinsOptions?

    override var components: Any? /* Components<Theme> */

    var motion: MotionOptions?

    override var palette: PaletteOptions?

    override var shadows: ReadonlyArray<String>?

    override var shape: ShapeOptions?

    override var transitions: TransitionsOptions?

    override var typography: TypographyVariantsOptions?

    override var zIndex: ZIndex?

    var focusVisible: Any? /* boolean | FocusVisible */

    var unstable_strictMode: Boolean?

    override var unstable_sxConfig: Any? /* SxConfig */

    var modularCssLayers: Boolean?
}

external interface BaseTheme : mui.system.Theme {
    override var mixins: Mixins

    var motion: Motion

    override var palette: Palette

    override var shadows: ReadonlyArray<String>

    override var shape: Shape

    override var transitions: Transitions

    override var typography: TypographyVariants

    override var zIndex: ZIndex

    var focusVisible: FocusVisible?

    var unstable_strictMode: Boolean?

    override var applyStyles: Any? /* ApplyStyles<SupportedColorScheme> */
}

external interface Theme : BaseTheme {
    var vars: ThemeVars?

    var cssVariables: Boolean? /* false */

    override var components: Any? /* Components<BaseTheme> */

    override var unstable_sx: (props: SxProps<Theme>) -> Any /* CSSObject from `@mui/styled-engine` */

    override var unstable_sxConfig: Any? /* SxConfig */

    var alpha: (color: String, value: Any /* Number | String */) -> String

    var lighten: (color: String, coefficient: Any /* Number | String */) -> String

    var darken: (color: String, coefficient: Any /* Number | String */) -> String
}
