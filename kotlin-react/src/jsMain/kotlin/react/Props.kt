package react

import js.objects.Destructible
import js.objects.Object

@ReactDsl
@JsExternalInheritorsOnly
external interface Props :
    Destructible<Props> {

    var key: Key?
}

context(builder: Props)
inline operator fun Props?.unaryPlus() {
    Object.assign(builder, this)
}
