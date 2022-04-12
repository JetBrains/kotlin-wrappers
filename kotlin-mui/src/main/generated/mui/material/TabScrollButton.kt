// Automatically generated - do not modify!

@file:JsModule("@mui/material/TabScrollButton")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TabScrollButtonProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TabScrollButtonClasses?

    /**
     * The direction the button should indicate.
     */
    var direction: TabScrollButtonDirection

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    /**
     * The component orientation (layout flow direction).
     */
    var orientation: mui.material.Orientation

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [TabScrollButton API](https://mui.com/material-ui/api/tab-scroll-button/)
 */
@JsName("default")
external val TabScrollButton: react.FC<TabScrollButtonProps>
