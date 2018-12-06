package kotlinext.js

inline fun <T : Any> jsObject(builder: T.() -> Unit): T {
    val obj: T = js("({})")
    return obj.apply {
        builder()
    }
}

inline fun js(builder: dynamic.() -> Unit): dynamic = jsObject(builder)

fun <T : Any> clone(obj: T) = objectAssign(jsObject<T> {}, obj)

inline fun <T : Any> assign(obj: T, builder: T.() -> Unit) = clone(obj).apply(builder)

fun <T, R : T> assign(dest: R, src: T): R {
    console.warn("kotlinext.js.assign is deprecated, use kotlinext.js.objectAssign instead")
    return objectAssign(dest, src)
}

fun toPlainObjectStripNull(obj: Any) = js {
    for (key in Object.keys(obj)) {
        val value = obj.asDynamic()[key]
        if (value != null) this[key] = value
    }
}
