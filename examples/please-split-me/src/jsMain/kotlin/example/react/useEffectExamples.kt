package example.react

import react.FC
import react.dom.html.ReactHTML.span
import react.use.useConstant
import react.useEffect
import react.useEffectWithCleanup
import react.useState
import web.animations.FrameRequestId
import web.animations.awaitAnimationFrame
import web.animations.cancelAnimationFrame
import web.animations.requestAnimationFrame
import web.dom.document
import web.dom.loadEvent
import web.events.addHandler
import web.events.once
import web.events.subscribe
import web.html.HTML.input
import web.html.HTML.script
import web.html.HTMLScriptElement
import web.html.changeEvent

val SubscribeExample = FC {
    val myInput = document.createElement(input)
    var myText by useState("")

    // before
    useEffectWithCleanup(myInput) {
        val removeHandler = myInput.changeEvent.addHandler { event ->
            myText = event.currentTarget.value
        }

        onCleanup(removeHandler)
    }

    // after
    useEffect(myInput) {
        myInput.changeEvent.subscribe { event ->
            myText = event.currentTarget.value
        }
    }
}

private fun createScript(): HTMLScriptElement =
    document.createElement(script)

val OnceExample = FC {
    val script = useConstant(::createScript)
    var status by useState("initialization")

    // before
    useEffectWithCleanup(script) {
        val removeHandler = script.loadEvent.addHandler {
            status = "loaded"
        }

        onCleanup(removeHandler)
    }

    // after
    useEffect(script) {
        script.loadEvent.once()
        status = "loaded"
    }
}

val AwaitAnimationFrameExample = FC {
    val (frameCount, setFrameCount) = useState(0)


    // before
    useEffectWithCleanup {
        lateinit var frameRequestId: FrameRequestId

        fun wait() {
            frameRequestId = requestAnimationFrame {
                setFrameCount { it + 1 }
                wait()
            }
        }

        wait()

        onCleanup {
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
