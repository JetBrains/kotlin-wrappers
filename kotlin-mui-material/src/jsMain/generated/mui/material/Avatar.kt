// Automatically generated - do not modify!

@file:JsModule("@mui/material/Avatar")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import react.dom.html.ImgHTMLAttributes
import web.html.HTMLDivElement
import web.html.HTMLImageElement

external interface AvatarProps :
    AvatarOwnProps,
    AvatarSlotsAndSlotProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface AvatarSlots {
    /**
     * The component that renders the root slot.
     * @default 'div'
     */
    var root: ElementType<*>

    /**
     * The component that renders the img slot.
     * @default 'img'
     */
    var img: ElementType<*>

    /**
     * The component that renders the fallback slot.
     * @default Person icon
     */
    var fallback: ElementType<*>
}

external interface AvatarSlotProps : Props {
    /** TS: SlotProps<'div', AvatarRootSlotPropsOverrides, AvatarOwnProps> */
    var root: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<'img', AvatarImgSlotPropsOverrides, AvatarOwnProps> */
    var img: ImgHTMLAttributes<HTMLImageElement>?

    /** TS: SlotProps<React.ElementType<SvgIconProps>, AvatarFallbackSlotPropsOverrides, AvatarOwnProps> */
    var fallback: SvgIconProps?
}

external interface AvatarSlotsAndSlotProps : Props {
    var slots: AvatarSlots?

    var slotProps: AvatarSlotProps?
}

external interface AvatarOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * Used in combination with `src` or `srcSet` to
     * provide an alt attribute for the rendered `img` element.
     */
    var alt: String?

    /**
     * Used to render icon or text elements inside the Avatar if `src` is not set.
     * This can be an element, or just a string.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AvatarClasses?

    /**
     * The `sizes` attribute for the `img` element.
     */
    var sizes: String?

    /**
     * The `src` attribute for the `img` element.
     */
    var src: String?

    /**
     * The `srcSet` attribute for the `img` element.
     * Use this attribute for responsive image display.
     */
    var srcSet: String?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The shape of the avatar.
     * @default 'circular'
     */
    var variant: AvatarVariant?
}

/**
 *
 * Demos:
 *
 * - [Avatar](https://mui.com/material-ui/react-avatar/)
 *
 * API:
 *
 * - [Avatar API](https://mui.com/material-ui/api/avatar/)
 */
@JsName("default")
external val Avatar: FC<AvatarProps>
