package emotion.styled

import csstype.PropertiesBuilder
import emotion.react.Theme
import kotlinx.js.jso
import react.ElementType
import react.FC
import react.Props
import react.PropsWithClassName

private inline val Props.theme: Theme
    get() = asDynamic().theme

fun <P : PropsWithClassName> ElementType<P>.styled(
    block: PropertiesBuilder.(P, Theme) -> Unit,
): FC<P> {
    val style = { props: P ->
        val builder: PropertiesBuilder = jso()
        block(builder, props, props.theme)
        builder
    }

    return styled(this)(style)
}
