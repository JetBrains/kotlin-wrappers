// Automatically generated - do not modify!

@file:JsModule("@mui/system/Box")

package mui.system

external interface BoxProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    PropsWithSx,
    mui.types.PropsWithComponent {
    override var children: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface CustomSystemProps : react.Props

/**
 *
 * Demos:
 *
 * - [Box (Material UI)](https://mui.com/material-ui/react-box/)
 * - [Box (MUI System)](https://mui.com/system/react-box/)
 *
 * API:
 *
 * - [Box API](https://mui.com/system/api/box/)
 */
@JsName("default")
external val Box: react.FC<BoxProps>
