// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tab")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.ReactNode
import react.dom.html.ButtonHTMLAttributes
import web.html.HTMLButtonElement

external interface TabProps :
    TabOwnProps,
    ButtonHTMLAttributes<HTMLButtonElement>,
    PropsWithComponent

external interface TabOwnProps :
    PropsWithSx,
    ButtonHTMLAttributes<HTMLButtonElement> {
    /**
     * This prop isn't supported.
     * Use the `component` prop if you need to change the children structure.
     */
    var children: Nothing?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TabClasses?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the  keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean?

    /**
     * The icon to display.
     */
    var icon: Any? /* string | React.ReactElement<unknown> */

    /**
     * The position of the icon relative to the label.
     * @default 'top'
     */
    var iconPosition: IconPosition?

    /**
     * The label element.
     */
    var label: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * You can provide your own value. Otherwise, we fallback to the child position index.
     */
    override var value: Any?

    /**
     * Tab labels appear in a single row.
     * They can use a second line if needed.
     * @default false
     */
    var wrapped: Boolean?
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://v6.mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [Tab API](https://v6.mui.com/material-ui/api/tab/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val Tab: FC<TabProps>
