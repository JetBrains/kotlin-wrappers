package emotion.styled

import csstype.PropertiesBuilder
import emotion.react.Theme
import js.core.jso
import js.objects.Object
import react.ElementType
import react.Props
import react.PropsWithClassName

private inline fun <T : Theme> Props.getTheme(): T =
    asDynamic().theme

fun <P : PropsWithClassName, T : Theme> ElementType<P>.styledWithTheme(
    options: StyledOptions?,
    block: PropertiesBuilder.(P, T) -> Unit,
): StyledComponent<P> {
    val style = { props: P ->
        val builder: PropertiesBuilder = jso()
        block(builder, props, props.getTheme())
        builder
    }

    val defaultOptions: StyledOptions = jso {
        target = generateId()
    }

    val finalOptions = Object.assign(defaultOptions, options)

    return styled(this, finalOptions)(style)
}

fun <P : PropsWithClassName, T : Theme> ElementType<P>.styledWithTheme(
    block: PropertiesBuilder.(P, T) -> Unit,
): StyledComponent<P> =
    styledWithTheme(null, block)

fun <P : PropsWithClassName> ElementType<P>.styled(
    options: StyledOptions?,
    block: PropertiesBuilder.(P) -> Unit,
): StyledComponent<P> =
    styledWithTheme(options) { props, _: Theme -> block(props) }

fun <P : PropsWithClassName> ElementType<P>.styled(
    block: PropertiesBuilder.(P) -> Unit,
): StyledComponent<P> =
    styled(null, block)

fun <P : PropsWithClassName> ElementType<P>.styled(): StyledComponent<P> =
    styled(block = {})
