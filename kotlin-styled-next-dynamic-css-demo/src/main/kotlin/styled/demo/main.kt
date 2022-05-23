package styled.demo

import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.fontSize
import kotlinx.css.rem
import org.w3c.dom.events.Event
import react.*
import react.dom.client.createRoot
import styled.StyleSheet
import styled.css
import styled.styledP

fun main() {
    window.onload = {
        createRoot(document.getElementById("root")!!)
            .render(demoComponent.create())
    }
}

private val demoComponent = fc<Props> {

    val (screenSize, setScreenSize) = useState(ScreenSize.fromRawWidth(window.innerWidth))

    useEffectOnce {
        val eventListener: (Event) -> Unit = {
            setScreenSize(ScreenSize.fromRawWidth(window.innerWidth))
        }
        window.addEventListener("resize", eventListener)
        cleanup {
            window.removeEventListener("resize", eventListener)
        }
    }

    styledP {

        css(DemoComponentStyles.demoDynamicStyle(screenSize))

        +"Hi, it seems like I'm running on the ${screenSize.name.lowercase()} screen!"

    }

}

private object DemoComponentStyles : StyleSheet() {

    val demoDynamicStyle by dynamicCss<ScreenSize> {
        fontSize = when (it) {
            ScreenSize.DESKTOP -> 2.rem
            ScreenSize.TABLET  -> 1.5.rem
            ScreenSize.PHONE   -> 1.rem
        }
    }

}
