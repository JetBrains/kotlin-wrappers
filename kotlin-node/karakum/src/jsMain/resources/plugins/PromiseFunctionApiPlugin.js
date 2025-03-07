import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isPromiseType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text.endsWith("Promise")
    )
}

function isPromiseFunction(node) {
    return (
        ts.isFunctionDeclaration(node)

        && node.type
        && isPromiseType(node.type)
    )
}

function isConflictingOverload(node, signature) {
    return (
        (
            node.name.text === "mkdir"

            && (
                signature.length === 1
                || (
                    signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "Mode"
                )
            )

            && node.type
            && isPromiseType(node.type)
            && ts.isUnionTypeNode(node.type.typeArguments[0])
        )
        || (
            (
                node.name.text === "mkdtemp"
                || node.name.text === "realpath"
            )

            && (
                signature.length === 1
                || (
                    signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && (
                        signature[1].type.typeName.text === "ObjectEncodingOptions"
                        || signature[1].type.typeName.text === "BufferEncoding"
                    )
                )
            )

            && node.type
            && isPromiseType(node.type)
            && ts.isUnionTypeNode(node.type.typeArguments[0])
        )
        || (
            node.name.text === "readlink"

            && (
                signature.length === 1
                || (
                    signature[1]
                    && ts.isTypeReferenceNode(signature[1].type)
                    && ts.isIdentifier(signature[1].type.typeName)
                    && signature[1].type.typeName.text === "ObjectEncodingOptions"
                )
            )

            && node.type
            && isPromiseType(node.type)
            && ts.isUnionTypeNode(node.type.typeArguments[0])
        )
        || (
            node.name.text === "readdir"

            && (
                signature.length === 1
                || (
                    signature[1]
                    && (
                        (
                            ts.isTypeReferenceNode(signature[1].type)
                            && ts.isIdentifier(signature[1].type.typeName)
                            && signature[1].type.typeName.text === "BufferEncoding"
                        )
                        || (
                            ts.isIntersectionTypeNode(signature[1].type)
                            && signature[1].type.types[0]
                            && ts.isTypeReferenceNode(signature[1].type.types[0])
                            && ts.isIdentifier(signature[1].type.types[0].typeName)
                            && signature[1].type.types[0].typeName.text === "ObjectEncodingOptions"
                        )
                    )
                )
            )

            && node.type
            && isPromiseType(node.type)
            && ts.isUnionTypeNode(node.type.typeArguments[0])
        )
    )
}

export default {
    setup(context) {
        this.promiseApiDeclarations = []
    },

    traverse() {
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            isPromiseFunction(node)
            && node.name
        ) {
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

            const namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)

            const name = node.name.text

            const typeParameters = node.typeParameters
                ?.map(typeParameter => next(typeParameter))
                ?.join(", ")

            const returnType = next(node.type)
            let returnTypePayload = next(node.type.typeArguments[0])
            if (
                ts.isTypeReferenceNode(node.type)
                && ts.isIdentifier(node.type.typeName)
                && node.type.typeName.text === "PipelinePromise"
            ) {
                returnTypePayload = "Any?"
            }

            const body = karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: (parameters, signature) => {
                    if (isConflictingOverload(node, signature)) {
                        return ""
                    }

                    return `
@seskar.js.JsAsync
external suspend fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnTypePayload, it => `: ${it}`)}
                    `
                }
            })

            const nodeInfo = {
                sourceFileName,
                namespace,
                fileName: `${name}.suspend.kt`,
                body,
            }

            this.promiseApiDeclarations.push(nodeInfo)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: (parameters, signature) => {
                    if (isConflictingOverload(node, signature)) {
                        return ""
                    }

                    return `
@JsName("${node.name.text}")
external fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}Async(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}
                    `
                }
            })
        }

        return null
    },

    generate(context) {
        return karakum.generateDerivedDeclarations(this.promiseApiDeclarations, context);
    },
}
