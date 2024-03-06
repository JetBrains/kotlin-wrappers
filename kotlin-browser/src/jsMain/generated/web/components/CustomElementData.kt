// Automatically generated - do not modify!

package web.components

import js.array.ReadonlyArray
import js.objects.Object
import js.objects.jso
import web.html.HTMLElement
import web.html.HtmlTagName
import kotlin.reflect.KClass

open class CustomElementData<T : HTMLElement>
protected constructor(
    val name: HtmlTagName<T>,
    val clazz: KClass<T>,
) : CustomElementCompanion {
    init {
        Object.defineProperty<_, Boolean?>(
            clazz.js,
            "formAssociated",
            jso {
                get = { this@CustomElementData.formAssociated }
            }
        )

        Object.defineProperty<_, ReadonlyArray<String>?>(
            clazz.js,
            "observedAttributes",
            jso {
                get = { this@CustomElementData.observedAttributes }
            }
        )
    }
}
