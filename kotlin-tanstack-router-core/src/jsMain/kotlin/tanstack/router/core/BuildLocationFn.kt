package tanstack.router.core

typealias BuildLocationFn = (
    options: BuildLocationOptions,
) -> ParsedLocation

external interface BuildLocationOptions :
    ToOptions {
    var leaveParams: Boolean?
}
