// Automatically generated - do not modify!

@file:JsModule("@mui/system/Box")

package mui.system

import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface BoxProps :
    BoxOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface CustomSystemProps

external interface BoxOwnProps :
    PropsWithChildren,
    PropsWithSx {
    override var children: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Box (Joy UI)](https://mui.com/joy-ui/react-box/)
 * - [Box (Material UI)](https://mui.com/material-ui/react-box/)
 * - [Box (MUI System)](https://mui.com/system/react-box/)
 *
 * API:
 *
 * - [Box API](https://mui.com/system/api/box/)
 */
@JsName("default")
external val Box: FC<BoxProps>
