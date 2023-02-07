package emotion.styled

external interface StyledOptions {
    var label: String?
    var shouldForwardProp: ((propName: String) -> Boolean)?
    var target: String?
}
