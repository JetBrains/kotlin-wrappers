import ts from "typescript";

export default function (node) {
    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "_DOMEventTarget"
    ) {
        return "typealias _DOMEventTarget = web.events.EventTarget"
    }
    return null
}
