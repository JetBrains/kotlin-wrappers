// Automatically generated - do not modify!

@file:JsModule("@mui/material/Box")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface BoxProps : react.PropsWithChildren {
    override var children: ReadonlyArray<react.ReactNode>?

    var component: react.ElementType<*>

    var ref: react.Ref<*>

    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Box](https://mui.com/components/box/)
 *
 * API:
 *
 * - [Box API](https://mui.com/api/box/)
 */
@JsName("default")
external val Box: react.FC<BoxProps>
