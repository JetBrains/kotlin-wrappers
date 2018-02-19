package react.dom

import kotlinext.js.*
import kotlinx.html.*
import org.w3c.dom.events.*
import react.*

class InnerHTML(
    val __html: String
)

external interface WithClassName : RProps {
    var className: String?
}

external interface DOMProps : WithClassName {
    var dangerouslySetInnerHTML: InnerHTML?
}

open class RDOMBuilder<out T : Tag>(factory: (TagConsumer<Unit>) -> T) : RBuilder() {
    fun setProp(attribute: String, value: Any?) {
        val key = fixAttributeName(attribute)
        props.asDynamic()[key] = value
    }

    val consumer = object : TagConsumer<Unit> {
        override fun onTagAttributeChange(tag: Tag, attribute: String, value: String?) {
            setProp(attribute, value)
        }

        override fun onTagContent(content: CharSequence): Unit {
            childList.add(content)
        }

        override fun onTagContentEntity(entity: Entities): Unit {
            childList.add(entity.text)
        }

        override fun onTagContentUnsafe(block: Unsafe.() -> Unit) {
            val sb = StringBuilder()
            object : Unsafe {
                override fun String.unaryPlus() {
                    sb.append(this)
                }
            }.block()
            props.dangerouslySetInnerHTML = InnerHTML(sb.toString())
        }

        override fun onTagStart(tag: Tag) {
            throw IllegalStateException("Don't nest tags inside props block")
        }

        override fun onTagEnd(tag: Tag) {
            throw IllegalStateException("Don't nest tags inside props block")
        }

        override fun onTagEvent(tag: Tag, event: String, value: (Event) -> Unit) {
            setProp(event, value)
        }

        override fun finalize() {}
    }

    val attrs: T = factory(consumer)

    operator fun Tag.get(name: String) = props.asDynamic()[name]
    operator fun Tag.set(name: String, value: Any) {
        props.asDynamic()[name] = value
    }

    // See https://facebook.github.io/react/docs/forms.html
    var INPUT.defaultChecked: Boolean
        get() = this["defaultChecked"] ?: false
        set(value) {
            this["defaultChecked"] = value
        }

    var SELECT.values: Set<String>
        get() {
            val valuesArr: Array<String> = this["value"] ?: arrayOf()
            return valuesArr.toSet()
        }
        set(value) {
            this["value"] = value.toTypedArray()
        }

    var SELECT.value: String
        get() = ""
        set(value) {
            values = setOf(value)
        }

    protected val props: DOMProps = jsObject {}

    init {
        attrs.attributesEntries.forEach { setProp(it.key, it.value) }
    }

    inline fun attrs(handler: T.() -> Unit) {
        attrs.handler()
    }

    var key: String
        get() = props.key
        set(value) {
            props.key = value
        }

    fun ref(handler: (dynamic) -> Unit) {
        props.ref = handler
    }

    open fun create(): ReactElement = createElement(attrs.tagName, props, *childList.toTypedArray())
}


