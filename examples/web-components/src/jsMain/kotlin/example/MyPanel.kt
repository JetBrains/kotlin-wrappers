package example

import web.components.*
import web.console.console
import web.dom.TagName
import web.html.HTMLElement

// redundant, but required for Kotlin/JS :(
@JsExport

class MyPanel : HTMLElement(), CustomElement {
    init {
        console.log("MyPanel created!")

        this.attachShadow(ShadowRootInit(mode = ShadowRootMode.open))

        this.shadowRoot!!.innerHTML = "MyPanel test content!"
    }

    override val connectedCallback = {
        console.log("MyPanel connected!")
    }

    companion object : CustomElementReference<MyPanel>(MyPanel::class.js) {
        val NAME: TagName<MyPanel> = TagName("my-panel")
    }
}
