import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isPromiseType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text.endsWith("Promise")
    )
}

function convertAsyncMethod(node, context, render) {
    const name = karakum.escapeIdentifier(render(node.name))

    const typeParameters = node.typeParameters
        ?.map(typeParameter => render(typeParameter))
        ?.join(", ")

    const returnType = node.type && render(node.type)

    const promiseDeclaration = karakum.convertParameterDeclarations(node, context, render, {
        strategy: "function",
        template: parameters => {
            return `
@JsName("${name}")
fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}Async(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}
            `
        }
    })

    const returnTypePayload = render(node.type.typeArguments[0])

    const suspendDeclaration = karakum.convertParameterDeclarations(node, context, render, {
        strategy: "function",
        template: (parameters) => {
            return `
@seskar.js.JsAsync
suspend fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnTypePayload, it => `: ${it}`)}
                   `
        }
    })

    return `${promiseDeclaration}\n${suspendDeclaration}`
}

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("promises.d.ts")
        && ts.isMethodSignature(node)
        && node.type
        && isPromiseType(node.type)
    ) {
        return convertAsyncMethod(node, context, render)
    }

    return null
}
