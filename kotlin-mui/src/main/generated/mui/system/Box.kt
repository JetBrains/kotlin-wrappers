// Automatically generated - do not modify!

@file:JsModule("@mui/system/Box")
@file:JsNonModule

package mui.system

external interface BoxProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    PropsWithSx,
    mui.types.PropsWithComponent {
    override var children: react.ReactNode?

    override var component: react.ElementType<*>?

    override var sx: SxProps<Theme>?
}

external interface CustomSystemProps : react.Props


@JsName("default")
external val Box: react.FC<BoxProps>
