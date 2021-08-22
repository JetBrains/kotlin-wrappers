package react

external interface Props

external interface PropsWithChildren : Props {
    var children: Array<out ReactNode>?
}

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("PropsWithChildren", "react.PropsWithChildren"),
)
typealias RProps = PropsWithChildren

var Props.key: Key
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().key = value
    }

var Props.ref: Ref<*>
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().ref = value
    }
