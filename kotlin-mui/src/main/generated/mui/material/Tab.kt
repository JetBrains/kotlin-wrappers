// Automatically generated - do not modify!

@file:JsModule("@mui/material/Tab")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface TabProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    /**
     * This prop isn't supported.
     * Use the `component` prop if you need to change the children structure.
     */
    var children: Nothing?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TabClasses

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * If `true`, the  keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean

    /**
     * The icon to display.
     */
    var icon: dynamic

    /**
     * The label element.
     */
    var label: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * You can provide your own value. Otherwise, we fallback to the child position index.
     */
    var value: Any

    /**
     * Tab labels appear in a single row.
     * They can use a second line if needed.
     * @default false
     */
    var wrapped: Boolean
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/components/tabs/)
 *
 * API:
 *
 * - [Tab API](https://mui.com/api/tab/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val Tab: react.FC<TabProps>
