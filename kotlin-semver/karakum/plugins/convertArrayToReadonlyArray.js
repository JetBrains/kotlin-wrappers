import ts from "typescript";

// work-around for https://github.com/karakum-team/karakum/pull/28
export default function (node, context, render) {
    if (ts.isArrayTypeNode(node)) {
        return `js.array.ReadonlyArray<${render(node.elementType)}>`
    }

    return null
}
