// Automatically generated - do not modify!

@file:JsModule("@mui/material/TabScrollButton")
@file:JsNonModule

package mui.material

external interface TabScrollButtonProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
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
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/components/tabs/)
 *
 * API:
 *
 * - [TabScrollButton API](https://mui.com/api/tab-scroll-button/)
 */
@JsName("default")
external val TabScrollButton: react.FC<TabScrollButtonProps>
