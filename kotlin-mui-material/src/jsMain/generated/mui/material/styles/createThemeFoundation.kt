// Automatically generated - do not modify!

package mui.material.styles

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import mui.system.Shadows
import mui.system.Union
import react.CSSProperties

external interface Opacity {
    var inputPlaceholder: Number

    var inputUnderline: Number

    var switchTrackDisabled: Number

    var switchTrack: Number
}

external interface PaletteBackgroundChannel {
    var defaultChannel: String

    var paperChannel: String
}

external interface PaletteCommonChannel {
    var background: String

    var backgroundChannel: String

    var onBackground: String

    var onBackgroundChannel: String
}

external interface PaletteColorChannel {
    var mainChannel: String

    var lightChannel: String

    var darkChannel: String

    var contrastTextChannel: String
}

external interface PaletteActionChannel {
    var activeChannel: String

    var selectedChannel: String
}

external interface PaletteTextChannel {
    var primaryChannel: String

    var secondaryChannel: String
}

external interface PaletteAlert {
    var errorColor: String

    var infoColor: String

    var successColor: String

    var warningColor: String

    var errorFilledBg: String

    var infoFilledBg: String

    var successFilledBg: String

    var warningFilledBg: String

    var errorFilledColor: String

    var infoFilledColor: String

    var successFilledColor: String

    var warningFilledColor: String

    var errorStandardBg: String

    var infoStandardBg: String

    var successStandardBg: String

    var warningStandardBg: String

    var errorIconColor: String

    var infoIconColor: String

    var successIconColor: String

    var warningIconColor: String
}

external interface PaletteAppBar {
    var defaultBg: String

    var darkBg: String

    var darkColor: String
}

external interface PaletteAvatar {
    var defaultBg: String
}

external interface PaletteButton {
    var inheritContainedBg: String

    var inheritContainedHoverBg: String
}

external interface PaletteChip {
    var defaultBorder: String

    var defaultAvatarColor: String

    var defaultIconColor: String
}

external interface PaletteFilledInput {
    var bg: String

    var hoverBg: String

    var disabledBg: String
}

external interface PaletteInput {
    var autofillWebkitBoxShadow: String
}

external interface PaletteLinearProgress {
    var primaryBg: String

    var secondaryBg: String

    var errorBg: String

    var infoBg: String

    var successBg: String

    var warningBg: String
}

external interface PaletteSkeleton {
    var bg: String
}

external interface PaletteSlider {
    var primaryTrack: String

    var secondaryTrack: String

    var errorTrack: String

    var infoTrack: String

    var successTrack: String

    var warningTrack: String
}

external interface PaletteSnackbarContent {
    var bg: String

    var color: String
}

external interface PaletteSpeedDialAction {
    var fabHoverBg: String
}

external interface PaletteStepConnector {
    var border: String
}

external interface PaletteStepContent {
    var border: String
}

external interface PaletteSwitch {
    var defaultColor: String

    var defaultDisabledColor: String

    var primaryDisabledColor: String

    var secondaryDisabledColor: String

    var errorDisabledColor: String

    var infoDisabledColor: String

    var successDisabledColor: String

    var warningDisabledColor: String
}

external interface PaletteTableCell {
    var border: String
}

external interface PaletteTooltip {
    var bg: String
}

@JsPlainObject
external interface Shape : mui.system.Shape

@JsPlainObject
external interface ShapeOptions : mui.system.ShapeOptions

@JsPlainObject
external interface ColorSystemOptions {
    val palette: PaletteOptions?

    val opacity: Any? /* Partial<Opacity> */

    val overlays: Any? /* Overlays */
}

external interface CssVarsPalette {
    var common: PaletteCommonChannel

    var primary: PaletteColorChannel

    var secondary: PaletteColorChannel

    var error: PaletteColorChannel

    var info: PaletteColorChannel

    var success: PaletteColorChannel

    var warning: PaletteColorChannel

    var text: PaletteTextChannel

    var background: PaletteBackgroundChannel

    var dividerChannel: String

    var action: PaletteActionChannel

    var Alert: PaletteAlert

    var AppBar: PaletteAppBar

    var Avatar: PaletteAvatar

    var Button: PaletteButton

    var Chip: PaletteChip

    var FilledInput: PaletteFilledInput

    var Input: PaletteInput

    var LinearProgress: PaletteLinearProgress

    var Skeleton: PaletteSkeleton

    var Slider: PaletteSlider

    var SnackbarContent: PaletteSnackbarContent

    var SpeedDialAction: PaletteSpeedDialAction

    var StepConnector: PaletteStepConnector

    var StepContent: PaletteStepContent

    var Switch: PaletteSwitch

    var TableCell: PaletteTableCell

    var Tooltip: PaletteTooltip
}

@JsPlainObject
external interface ColorSystem {
    val palette: Any? /* Palette & CssVarsPalette */

    val opacity: Any? /* Opacity */

    val overlays: Any? /* Overlays */
}

external interface ThemeVars {
    var font: Any? /* ExtractTypographyTokens<TypographyVariants> */

    var palette: Any? /* Omit<ColorSystem['palette'], 'colorScheme' | 'mode' | 'contrastThreshold' | 'tonalOffset' | 'getContrastText' | 'augmentColor' | 'action'> */

    var opacity: Any? /* Opacity */

    var overlays: Any? /* Overlays */

    var shadows: Shadows

    var shape: Shape

    var spacing: String

    var zIndex: ZIndex
}

@JsPlainObject
external interface FocusVisibleThemeMembers {
    val focusVisible: CSSProperties?

    /** The `focusVisible.insetOverrides` the theme was created with. */
    val unstable_focusVisibleInsetOverrides: CSSProperties?
}

@JsPlainObject
external interface CssVarsTheme :
    ColorSystem,
    FocusVisibleThemeMembers {
    val colorSchemes: Any? /* Partial<Record<SupportedColorScheme, ColorSystem>> */

    val rootSelector: String

    val colorSchemeSelector: Union /* 'media' | 'class' | 'data' | string */

    val cssVarPrefix: String

    val defaultColorScheme: Any? /* SupportedColorScheme */

    val vars: ThemeVars

    val getCssVar: (field: String /* ThemeCssVar */) -> String

    val getColorSchemeSelector: (colorScheme: String /* SupportedColorScheme */) -> String

    val generateThemeVars: () -> ThemeVars

    val generateStyleSheets: () -> ReadonlyArray<ReadonlyRecord<String, *>>

    val generateSpacing: () -> Any /* SystemTheme['spacing'] */

    val spacing: Any /* SystemTheme['spacing'] */

    val breakpoints: Any /* SystemTheme['breakpoints'] */

    val shape: Shape

    val typography: TypographyVariants

    val motion: Motion

    val transitions: Transitions

    val shadows: Shadows

    val mixins: Mixins

    val zIndex: ZIndex

    val direction: Any /* SystemTheme['direction'] */

    /**
     * A function to determine if the key, value should be attached as CSS Variable
     * `keys` is an array that represents the object path keys.
     *  Ex, if the theme is { foo: { bar: 'var(--test)' } }
     *  then, keys = ['foo', 'bar']
     *        value = 'var(--test)'
     */
    val shouldSkipGeneratingVar: (keys: ReadonlyArray<String>, value: Any /* String | Number */) -> Boolean

    val unstable_sxConfig: Any? /* SxConfig */

    /** The scale `enhanceDensity` resolved, in px numbers; unset until the enhancer runs. */
    val unstable_densityScale: ResolvedDensityScale?

    val unstable_sx: (props: Any /* SxProps<CssVarsTheme> */) -> Any /* CSSObject from `@mui/styled-engine` */

    val applyStyles: Any? /* ApplyStyles<SupportedColorScheme> */
}
