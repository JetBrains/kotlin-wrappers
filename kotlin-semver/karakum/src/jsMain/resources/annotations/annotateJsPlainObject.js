import ts from "typescript"

const jsoInterfaces = [
    "RangeOptions",
    "Options",
    "CoerceOptions"
]

export default (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        && jsoInterfaces.some(name => node.name.text === name)
    ) {
        return `@js.objects.JsPlainObject`
    }

    return null
}
