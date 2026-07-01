// Automatically generated - do not modify!

package mui.material.styles

import js.array.ReadonlyArray
import js.objects.Record
import mui.system.Union

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

external interface Shape

external interface ShapeOptions

external interface ColorSystemOptions {
    var palette: PaletteOptions?

    var opacity: Any? /* Partial<Opacity> */

    var overlays: Any? /* Overlays */
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

    var Alert: Any? /* PaletteAlert */

    var AppBar: Any? /* PaletteAppBar */

    var Avatar: Any? /* PaletteAvatar */

    var Button: Any? /* PaletteButton */

    var Chip: Any? /* PaletteChip */

    var FilledInput: Any? /* PaletteFilledInput */

    var LinearProgress: Any? /* PaletteLinearProgress */

    var Skeleton: Any? /* PaletteSkeleton */

    var Slider: Any? /* PaletteSlider */

    var SnackbarContent: Any? /* PaletteSnackbarContent */

    var SpeedDialAction: PaletteSpeedDialAction

    var StepConnector: Any? /* PaletteStepConnector */

    var StepContent: Any? /* PaletteStepContent */

    var Switch: Any? /* PaletteSwitch */

    var TableCell: Any? /* PaletteTableCell */

    var Tooltip: Any? /* PaletteTooltip */
}

external interface ColorSystem {
    var palette: Any? /* Palette & CssVarsPalette */

    var opacity: Any? /* Opacity */

    var overlays: Any? /* Overlays */
}

external interface ThemeVars {
    var font: Any? /* ExtractTypographyTokens<TypographyVariants> */

    var palette: Any? /* Omit<ColorSystem['palette'], 'colorScheme' | 'mode' | 'contrastThreshold' | 'tonalOffset' | 'getContrastText' | 'augmentColor'> */

    var opacity: Any? /* Opacity */

    var overlays: Any? /* Overlays */

    var shadows: Any? /* Shadows */

    var shape: Shape

    var spacing: String

    var zIndex: ZIndex
}

external interface CssVarsTheme : ColorSystem {
    var colorSchemes: Any? /* Partial<Record<SupportedColorScheme, ColorSystem>> */

    var rootSelector: String

    var colorSchemeSelector: Union /* 'media' | 'class' | 'data' | string */

    var cssVarPrefix: String

    var defaultColorScheme: Any? /* SupportedColorScheme */

    var vars: Any? /* ThemeVars */

    var getCssVar: (field: String /* ThemeCssVar */) -> String

    var getColorSchemeSelector: (colorScheme: String /* SupportedColorScheme */) -> String

    var generateThemeVars: () -> ThemeVars

    var generateStyleSheets: () -> Array<Record<String, *>>

    var generateSpacing: () -> Any /* SystemTheme['spacing'] */

    var spacing: Any /* SystemTheme['spacing'] */

    var breakpoints: Any /* SystemTheme['breakpoints'] */

    var shape: Shape

    var typography: Any? /* TypographyVariants */

    var motion: Motion

    var transitions: Transitions

    var shadows: Any? /* Shadows */

    var mixins: Mixins

    var zIndex: ZIndex

    var direction: Any /* SystemTheme['direction'] */

    /**
     * A function to determine if the key, value should be attached as CSS Variable
     * `keys` is an array that represents the object path keys.
     *  Ex, if the theme is { foo: { bar: 'var(--test)' } }
     *  then, keys = ['foo', 'bar']
     *        value = 'var(--test)'
     */
    var shouldSkipGeneratingVar: (keys: ReadonlyArray<String>, value: Any /* String | Number */) -> Boolean

    var unstable_sxConfig: Any? /* SxConfig */

    var unstable_sx: (props: Any /* SxProps<CssVarsTheme> */) -> Any /* CSSObject from `@mui/styled-engine` */

    var applyStyles: Any? /* ApplyStyles<SupportedColorScheme> */
}
