package react.dom

import kotlinext.js.jso
import kotlinx.html.*
import org.w3c.dom.events.Event
import react.*

external interface InnerHTML {
    var __html: String
}

external interface DOMProps : PropsWithChildren, PropsWithClassName {
    var dangerouslySetInnerHTML: InnerHTML?
}

@ReactDsl
interface RDOMBuilder<out T : Tag> : RBuilder {
    val consumer: TagConsumer<Unit>
    val attrs: T

    operator fun Tag.get(name: String) = domProps.asDynamic()[name]
    operator fun Tag.set(name: String, value: Any) {
        domProps.asDynamic()[name] = value
    }

    // See https://facebook.github.io/react/docs/forms.html
    var INPUT.defaultChecked: Boolean
        get() = this["defaultChecked"] ?: false
        set(value) {
            this["defaultChecked"] = value
        }

    var SELECT.values: Set<String>
        get() = (this["value"] ?: arrayOf<String>()).toSet()
        set(value) {
            this["value"] = value.toTypedArray()
        }

    var SELECT.value: String
        get() = get("value")
        set(value) {
            set("value", value)
        }

    val domProps: DOMProps

    var key: Key?
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            domProps.key = value
        }

    var ref: Ref<*>?
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get() = error("")
        set(value) {
            domProps.ref = value
        }

    fun create(): ReactElement = createElement(attrs.tagName, domProps, *childList.toTypedArray())

    companion object {
        operator fun <T : Tag> invoke(factory: (TagConsumer<Unit>) -> T): RDOMBuilder<T> = RDOMBuilderImpl(factory)
    }
}

inline fun <T : Tag> RDOMBuilder<T>.attrs(handler: T.() -> Unit) {
    attrs.handler()
}

open class RDOMBuilderImpl<out T : Tag>(factory: (TagConsumer<Unit>) -> T) : RDOMBuilder<T>, RBuilderImpl() {
    final override val consumer = object : TagConsumer<Unit> {
        override fun onTagAttributeChange(tag: Tag, attribute: String, value: String?) {
            if (attribute == jsStyleMarker) {
                setProp("style", attrs.jsStyle)
            } else {
                setProp(attribute, value)
            }
        }

        override fun onTagComment(content: CharSequence) {
            throw IllegalStateException("Comments are not supported")
        }

        override fun onTagContent(content: CharSequence) {
            +content.toString()
        }

        override fun onTagContentEntity(entity: Entities) {
            +ReactNode(entity.text)
        }

        override fun onTagContentUnsafe(block: Unsafe.() -> Unit) {
            val sb = StringBuilder()
            object : Unsafe {
                override fun String.unaryPlus() {
                    sb.append(this)
                }
            }.block()
            domProps.dangerouslySetInnerHTML = jso {
                __html = sb.toString()
            }
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

    final override val attrs: T = factory(consumer)
    final override val domProps: DOMProps = jso()

    init {
        attrs.attributesEntries
            .filter { it.key != jsStyleMarker }
            .forEach { setProp(it.key, it.value) }

        val jsStyle = attrs.jsStyle
        if (jsStyle != undefined) {
            setProp("style", jsStyle)
        }
    }
}

fun <T : Tag> RDOMBuilder<T>.setProp(attribute: String, value: Any?) {
    val key = fixAttributeName(attribute)
    domProps.asDynamic()[key] = value
}
