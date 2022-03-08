package emotion.styled

import csstype.PropertiesBuilder
import emotion.react.Theme
import kotlinx.js.jso
import react.ElementType
import react.FC
import react.Props
import react.PropsWithClassName

external interface PropsWithTheme : Props {
    val theme: Theme
}

fun <P : PropsWithClassName> ElementType<P>.styled(
    options: StyledOptions? = null,
    block: PropertiesBuilder.(P, Theme) -> Unit,
): FC<P> {
    val style = { props: P ->
        jso<PropertiesBuilder> {
            block(props, props.unsafeCast<PropsWithTheme>().theme)
        }
    }

    return styled(this, options ?: undefined)(style)
}
