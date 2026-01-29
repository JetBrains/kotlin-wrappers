package example.react

import kotlinx.coroutines.flow.first
import react.FC
import react.dom.html.ReactHTML.span
import react.use.useConstant
import react.useEffect
import react.useState
import web.animations.FrameRequestId
import web.animations.awaitAnimationFrame
import web.animations.cancelAnimationFrame
import web.animations.requestAnimationFrame
import web.dom.document
import web.dom.loadEvent
import web.events.addHandler
import web.events.invoke
import web.html.HTMLScriptElement
import web.html.HtmlTagName.input
import web.html.HtmlTagName.script
import web.html.changeEvent

val SubscribeExample = FC {
    val myInput = document.createElement(input)
    var myText by useState("")

    // before (callback mode)
    useEffect(myInput) {
        val removeHandler = myInput.changeEvent.addHandler { event ->
            myText = event.currentTarget.value
        }

        awaitCleanup(removeHandler)
    }

    // after
    useEffect(myInput) {
        myInput.changeEvent()
            .collect { myText = it.currentTarget.value }
    }
}

private fun createScript(): HTMLScriptElement =
    document.createElement(script)

val OnceExample = FC {
    val script = useConstant(::createScript)
    var status by useState("initialization")

    // before (callback mode)
    useEffect(script) {
        val removeHandler = script.loadEvent.addHandler {
            status = "loaded"
        }

        awaitCleanup(removeHandler)
    }

    // after
    useEffect(script) {
        script.loadEvent().first()
        status = "loaded"
    }
}

val AwaitAnimationFrameExample = FC {
    val (frameCount, setFrameCount) = useState(0)


    // before (callback mode)
    useEffect {
        lateinit var frameRequestId: FrameRequestId

        fun wait() {
            frameRequestId = requestAnimationFrame {
                setFrameCount { it + 1 }
                wait()
            }
        }

        wait()

        awaitCleanup {
            cancelAnimationFrame(frameRequestId)
        }
    }

    // after
    useEffect {
        while (true) {
            awaitAnimationFrame()

            setFrameCount { it + 1 }
        }
    }

    span {
        +"Frame count: $frameCount"
    }
}
