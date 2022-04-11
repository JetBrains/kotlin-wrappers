// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TabPanel")
@file:JsNonModule

package mui.lab

import mui.material.styles.Theme
import mui.system.SxProps

external interface TabPanelProps :
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
    var classes: TabPanelClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The `value` of the corresponding `Tab`. Must use the index of the `Tab` when
     * no `value` was passed to `Tab`.
     */
    var value: String
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [TabPanel API](https://mui.com/material-ui/api/tab-panel/)
 */
@JsName("default")
external val TabPanel: react.FC<TabPanelProps>
