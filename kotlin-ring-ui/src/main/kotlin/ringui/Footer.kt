@file:JsModule("@jetbrains/ring-ui/components/footer/footer")
@file:JsNonModule

package ringui

import react.ComponentClass

@JsName("default")
external val Footer: ComponentClass<FooterProps>

//It seems that FooterColumn and FooterLine are not supposed to be used outside of Footer itself (in other words, only Footer should use them)
