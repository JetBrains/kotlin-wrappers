// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TabPanel")
@file:JsNonModule

package mui.lab

import kotlinext.js.ReadonlyArray

external interface TabPanelProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TabPanelClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

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
 * - [Tabs](https://mui.com/components/tabs/)
 *
 * API:
 *
 * - [TabPanel API](https://mui.com/api/tab-panel/)
 */
@JsName("default")
external val TabPanel: react.FC<TabPanelProps>
