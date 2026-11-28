package csstype

import js.objects.Object

context(properties: Properties)
inline operator fun Properties?.unaryPlus() {
    Object.assign(properties, this)
}
