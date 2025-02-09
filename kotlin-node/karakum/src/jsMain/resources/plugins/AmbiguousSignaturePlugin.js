import ts from "typescript";
import * as karakum from "../karakum.mjs";

const isNull = (type) => ts.isLiteralTypeNode(type) && type.literal.kind === ts.SyntaxKind.NullKeyword
const isUndefined = (type) => type.kind === ts.SyntaxKind.UndefinedKeyword

export const isNullableType = (type) => isNull(type) || isUndefined(type)

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

export default {
    setup(context) {
        this.functionSymbols = new Set()
    },

    traverse(node, context) {
        if (
            ts.isFunctionDeclaration(node)
            && node.name
        ) {
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(node.name)
            if (!symbol) return null

            this.functionSymbols.add(symbol)
        }
    },

    render(node, context, next) {
        return null
    },

    generate(context, render) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
        const typeChecker = typeScriptService?.program.getTypeChecker()

        const declarations = Array.from(this.functionSymbols)
            .flatMap(symbol => {
                const declarations = (symbol.declarations ?? [])
                    .filter(declaration => ts.isFunctionDeclaration(declaration))

                const declarationMap = declarations.reduce((acc, declaration) => {
                    const parameterSymbols = declaration.parameters
                        .filter(parameter => !parameter.questionToken)
                        .map(parameter => {
                            const typeNode = parameter.type
                            if (!typeNode) return "any"

                            const type = typeChecker.getTypeFromTypeNode(typeNode)

                            return type?.symbol ?? typeScriptService?.printNode(typeNode) ?? "any"
                        })

                    if (!acc.has(parameterSymbols)) {
                        acc.set(parameterSymbols, [])
                    }

                    acc.get(parameterSymbols).push(declaration)

                    return acc
                }, new karakum.DeepMap())

                return declarationMap.values()
                    .filter(ambiguousDeclarations => {
                        if (ambiguousDeclarations.length <= 1) return false

                        const [declaration] = ambiguousDeclarations

                        const optionalIndex = declaration.parameters
                            .findIndex(parameter => Boolean(parameter.questionToken))

                        if (optionalIndex === -1) return false

                        // exclude overloads with optional parameters that have union type,
                        // because this case is handled by `convertParameterDeclarations`
                        return ambiguousDeclarations
                            .map(it => it.parameters[optionalIndex])
                            .every(parameter => {
                                if (!parameter.type) return true
                                if (!ts.isUnionTypeNode(parameter.type)) return true

                                const types = parameter.type.types
                                    .filter(type => !isNullableType(type))

                                return types.length < 2
                            })
                    })
                    .flatMap(ambiguousDeclarations => {
                        const [declaration] = ambiguousDeclarations

                        const sourceFileName = declaration.getSourceFile()?.fileName ?? "generated.d.ts"
                        const namespace = typeScriptService?.findClosest(declaration, ts.isModuleDeclaration)

                        const originalName = declaration.name?.text ?? "Anonymous"
                        let name = originalName
                        let jsName = ""

                        if (isPromiseFunction(declaration)) {
                            name = `${name}Async`
                            jsName = `@JsName("${originalName}")\n`
                        }

                        const typeParameters = declaration.typeParameters
                            ?.map(typeParameter => render(typeParameter))
                            ?.join(", ")

                        const returnType = declaration.type && render(declaration.type)

                        const coveredSignatures = new karakum.DeepMap()

                        const body = karakum.convertParameterDeclarations(declaration, context, render, {
                            strategy: "function",
                            template: (_, signature) => {
                                const types = signature
                                    .filter(it => !it.parameter.questionToken)
                                    .map(it => it.type)

                                if (coveredSignatures.has(types)) return ""
                                coveredSignatures.set(types, true)

                                const parameters = signature
                                    .filter(it => !it.parameter.questionToken)
                                    .map(it => karakum.convertParameterDeclarationWithFixedType(it.parameter, context, render, {
                                        strategy: "function",
                                        type: it.type,
                                        nullable: it.nullable,
                                    }))
                                    .join(", ")

                                return `${jsName}external fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
                            }
                        })

                        if (isPromiseFunction(declaration)) {
                            const returnTypePayload = render(declaration.type.typeArguments[0])

                            const coveredSuspendSignatures = new karakum.DeepMap()

                            const suspendBody = karakum.convertParameterDeclarations(declaration, context, render, {
                                strategy: "function",
                                defaultValue: "undefined",
                                template: (_, signature) => {
                                    // TODO: it cam be removed after conversion
                                    //  `describe`, `suite` and `it` namespaces as object
                                    if (
                                        originalName === "describe"
                                        || originalName === "suite"
                                        || originalName === "it"
                                    ) {
                                        return ""
                                    }

                                    const types = signature
                                        .filter(it => !it.parameter.questionToken)
                                        .map(it => it.type)

                                    if (coveredSuspendSignatures.has(types)) return ""
                                    coveredSuspendSignatures.set(types, true)

                                    const parameters = signature
                                        .filter(it => !it.parameter.questionToken)
                                        .map(it => karakum.convertParameterDeclarationWithFixedType(it.parameter, context, render, {
                                            strategy: "function",
                                            type: it.type,
                                            nullable: it.nullable,
                                        }))
                                        .join(", ")

                                    const parameterNames = signature
                                        .filter(it => !it.parameter.questionToken)
                                        .map((it, index) => (
                                            ts.isIdentifier(it.parameter.name)
                                                ? karakum.escapeIdentifier(render(it.parameter.name))
                                                : `param${index}`
                                        ))
                                        .join(", ")

                                    return `
@seskar.js.JsAsync
external suspend fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${originalName}(${parameters})${karakum.ifPresent(returnTypePayload, it => `: ${it}`)}
                                    `
                                }
                            })

                            return [
                                {
                                    sourceFileName,
                                    namespace,
                                    fileName: `${originalName}.kt`,
                                    body,
                                },
                                {
                                    sourceFileName,
                                    namespace,
                                    fileName: `${originalName}.suspend.kt`,
                                    body: suspendBody,
                                }
                            ]
                        } else {
                            return [{
                                sourceFileName,
                                namespace,
                                fileName: `${name}.kt`,
                                body,
                            }]
                        }
                    })
            })

        return karakum.generateDerivedDeclarations(declarations, context);
    }
}
