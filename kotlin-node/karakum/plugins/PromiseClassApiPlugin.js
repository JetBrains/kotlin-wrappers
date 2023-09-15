import ts from "typescript";
import * as karakum from "karakum";

function isPromiseType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Promise"
    )
}

function convertAsyncProperty(name, propertyType, context, render) {
    const typeParameters = propertyType.typeParameters
        ?.map(typeParameter => render(typeParameter))
        ?.join(", ")

    const returnType = propertyType.type && render(propertyType.type)

    const promiseDeclaration = karakum.convertParameterDeclarations(propertyType, context, render, {
        strategy: "function",
        template: parameters => {
            return `
@JsName("${name}")
fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}Async(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}
                    `
        }
    })

    const returnTypePayload = render(propertyType.type.typeArguments[0])

    const suspendDeclaration = karakum.convertParameterDeclarations(propertyType, context, render, {
        strategy: "function",
        template: (parameters, signature) => {
            return `
@Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
)
suspend inline fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnTypePayload, it => `: ${it}`)} =
    ${name}Async(
        ${signature.map((it, index) => ts.isIdentifier(it.parameter.name) ? it.parameter.name.text : `param${index}`).join(", ")}
    ).await()
                    `
        }
    })

    return `${promiseDeclaration}\n${suspendDeclaration}`
}

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("promises.d.ts")
        && ts.isPropertyDeclaration(node)
        && node.type
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        const name = karakum.escapeIdentifier(render(node.name))

        const propertyType = typeScriptService?.resolveType(node.type) ?? node.type

        if (
            propertyType
            && (
                ts.isFunctionTypeNode(propertyType)
                && propertyType.type
                && isPromiseType(propertyType.type)
            )
        ) {
            return convertAsyncProperty(name, propertyType, context, render)
        }

        if (
            propertyType
            && (
                ts.isTypeLiteralNode(propertyType)
                && propertyType.members.every(member => (
                    ts.isCallSignatureDeclaration(member)
                    && member.type
                    && isPromiseType(member.type)
                ))
            )
        ) {
            return propertyType.members
                .map(member => {
                    if (ts.isCallSignatureDeclaration(member)) {
                        return convertAsyncProperty(name, member, context, render)
                    } else {
                        return ""
                    }
                })
                .join("\n")
        }

        return null
    }

    return null
}
