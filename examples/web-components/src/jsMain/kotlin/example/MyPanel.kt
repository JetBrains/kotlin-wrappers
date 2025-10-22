package example

import web.components.*
import web.console.console
import web.dom.TagName
import web.html.HTMLElement
import web.html.HtmlSource

// redundant, but required for Kotlin/JS :(
@JsExport

class MyPanel : HTMLElement(), CustomElement {
    init {
        console.log("MyPanel created!")

        attachShadow(ShadowRootInit(mode = ShadowRootMode.open))

        shadowRoot!!.innerHTML = HtmlSource("MyPanel test content!")
    }

    override val connectedCallback = {
        console.log("MyPanel connected!")
    }

    companion object : CustomElementReference<MyPanel>(MyPanel::class.js) {
        val NAME: TagName<MyPanel> = TagName("my-panel")
    }
}
