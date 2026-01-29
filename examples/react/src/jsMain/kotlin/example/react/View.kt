package example.react

import js.objects.unsafeJso
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import react.FC
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.span
import react.useEffect
import react.useState
import web.cssom.Display
import web.cssom.px

internal val View = FC {
    val (a, setA) = useState(0)
    val (b, setB) = useState(0)
    val (c, setC) = useState(0)

    useEffect(a) {
        launch {
            delay(1000)
            throw RuntimeException("Error in 'A' effect!")
        }

        awaitCleanup {
            setC { it + 100 }
        }
    }

    useEffect(b) {
        awaitCleanup {
            setC { it + 13 }
        }
    }

    div {
        style = unsafeJso {
            display = Display.flex
            gap = 20.px
        }

        button {
            +"Change A"

            onClick = { setA { it + 1 } }
        }

        span {
            +"A: $a"
        }

        button {
            +"Change B"

            onClick = { setB { it + 1 } }
        }

        span {
            +"B: $b"
        }

        span {
            +"C: $c"
        }
    }
}
