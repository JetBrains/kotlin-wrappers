// Automatically generated - do not modify!

@file:JsModule("@mui/system/Box")

package mui.system

external interface BoxProps :
    BoxOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface CustomSystemProps : react.Props

external interface BoxOwnProps :
    react.PropsWithChildren,
    PropsWithSx {
    override var children: react.ReactNode?

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: react.ElementType<*>?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

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
