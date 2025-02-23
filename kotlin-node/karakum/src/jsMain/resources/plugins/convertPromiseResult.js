import ts from "typescript";

function isPromiseType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Promise"
    )
}

export default function (node, context, render) {
    if (
        ts.isUnionTypeNode(node)
        && node.types.length === 2
        && node.types.some(it => isPromiseType(it))
    ) {
        const promiseType = node.types.find(it => isPromiseType(it))
        const otherType = node.types.find(it => !isPromiseType(it))

        if (!promiseType.typeArguments) return null

        const promisePayload = render(promiseType.typeArguments[0])
        const otherPayload = render(otherType)

        if (promisePayload === otherPayload) {
            return `js.promise.PromiseResult<${promisePayload}>`
        }
    }

    return null
}
