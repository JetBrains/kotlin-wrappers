// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TabPanel")

package mui.lab

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface TabPanelProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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
    var value: Any /* String or Number */

    /**
     * Always keep the children in the DOM.
     * @default false
     */
    var keepMounted: Boolean?
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://v6.mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [TabPanel API](https://v6.mui.com/material-ui/api/tab-panel/)
 */
@JsName("default")
external val TabPanel: FC<TabPanelProps>
