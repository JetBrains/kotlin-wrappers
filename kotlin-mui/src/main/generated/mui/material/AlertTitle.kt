// Automatically generated - do not modify!

@file:JsModule("@mui/material/AlertTitle")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import kotlinext.js.ReadonlyArray

external interface AlertTitleProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AlertTitleClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Alert](https://mui.com/components/alert/)
 *
 * API:
 *
 * - [AlertTitle API](https://mui.com/api/alert-title/)
 */
@JsName("default")
external val AlertTitle: react.FC<AlertTitleProps>
