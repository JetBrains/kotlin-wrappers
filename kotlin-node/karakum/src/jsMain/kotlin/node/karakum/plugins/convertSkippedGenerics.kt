package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.asArray
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isIntersectionTypeNode
import typescript.isParameter
import typescript.isPropertyAccessExpression
import typescript.isQualifiedName
import typescript.isTypeReferenceNode

val convertSkippedGenerics = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

        nullable {
            ensure(sourceFileName.endsWith("fs/promises.d.ts"))

            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "ReadableStream")
            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isQualifiedName(typeName))

            val left = typeName.left
            ensure(isIdentifier(left))
            ensure(left.text == "streamWeb")

            ensure(
                typeName.right.text == "ReadableStream"
                        || typeName.right.text == "WritableStream"
                        || typeName.right.text == "QueuingStrategy"
            )

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream/consumers.d.ts"))

            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "WebReadableStream")

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(sourceFileName.endsWith("diagnostics_channel.d.ts"))

            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Channel")

            ensure(node.typeArguments == null)

            "${render(typeName)}<*, *>"
        } ?: nullable {
            ensure(sourceFileName.endsWith("diagnostics_channel.d.ts"))

            ensure(isExpressionWithTypeArguments(node))

            val expression = node.expression
            ensure(isIdentifier(expression))
            ensure(expression.text == "TracingChannelCollection")

            ensure(node.typeArguments == null)

            "${render(expression)}<StoreType, ContextType>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isQualifiedName(typeName))
            ensure(typeName.right.text == "TypedArray")

            ensure(node.typeArguments == null)

            "${render(typeName)}<*, *, *, *>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isQualifiedName(typeName))
            ensure(typeName.right.text == "ArrayBufferView")

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(
                typeName.text == "DataView"
                    || typeName.text == "Float32Array"
                    || typeName.text == "Float64Array"
                    || typeName.text == "Int8Array"
                    || typeName.text == "Int16Array"
                    || typeName.text == "Int32Array"
                    || typeName.text == "Uint8Array"
                    || typeName.text == "Uint8ClampedArray"
                    || typeName.text == "Uint16Array"
                    || typeName.text == "Uint32Array"
                    || typeName.text == "BigInt64Array"
                    || typeName.text == "BigUint64Array"
            )

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(isExpressionWithTypeArguments(node))

            val expression = node.expression
            ensure(isIdentifier(expression))
            ensure(expression.text == "Uint8Array")

            ensure(node.typeArguments == null)

            "${render(expression)}<ArrayBufferLike>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Function")

            ensure(node.typeArguments == null)

            nullable {
                val intersection = ensureNotNull(node.getParentOrNull())
                ensure(isIntersectionTypeNode(intersection))

                "js.function.JsFunction<Nothing, Any?>"
            } ?: nullable {
                val parameter = ensureNotNull(node.getParentOrNull())
                ensure(isParameter(parameter))

                val parameterName = parameter.name
                ensure(isIdentifier(parameterName))
                ensure(parameterName.text == "listener")

                "${render(typeName)}<Unit>"
            } ?: run {
                "${render(typeName)}<*>"
            }
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(
                typeName.text == "GeneratorFunction"
                        || typeName.text == "AsyncGeneratorFunction"
            )

            ensure(node.typeArguments == null)

            "${render(typeName)}<*, *>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Generator")

            ensure(node.typeArguments == null)

            "${render(typeName)}<*, *, *>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "AsyncGenerator")

            ensure(node.typeArguments?.asArray()?.size == 2)

            val typeArguments = node.typeArguments?.asArray()?.joinToString(", ") { render(it) }

            "${render(typeName)}<${typeArguments}, *>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "MockFunctionCall")

            ensure(node.typeArguments?.asArray()?.size == 1)

            val typeArguments = node.typeArguments?.asArray()?.joinToString(", ") { render(it) }

            "${render(typeName)}<${typeArguments}, *, *>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Http2ServerResponse")

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(
                typeName.text == "Http2Server"
                        || typeName.text == "Http2SecureServer"
            )

            ensure(node.typeArguments == null)

            "${render(typeName)}<*, *, *, *>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(
                typeName.text == "ReadableOptions"
                        || typeName.text == "WritableOptions"
                        || typeName.text == "DuplexOptions"
                        || typeName.text == "TransformOptions"
            )

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isQualifiedName(typeName))

            val left = typeName.left
            ensure(isIdentifier(left))
            ensure(left.text == "stream")

            ensure(
                typeName.right.text == "ReadableOptions"
                        || typeName.right.text == "WritableOptions"
                        || typeName.right.text == "TransformOptions"
            )

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Dirent")

            ensure(node.typeArguments == null)

            "${render(typeName)}<*>"
        } ?: nullable {
            ensure(sourceFileName.endsWith("crypto.d.ts"))

            ensure(isExpressionWithTypeArguments(node))

            val expression = node.expression
            ensure(isPropertyAccessExpression(expression))

            val expressionExpression = expression.expression
            ensure(isIdentifier(expressionExpression))
            ensure(expressionExpression.text == "stream")

            val expressionName = expression.name
            ensure(isIdentifier(expressionName))
            ensure(expressionName.text == "TransformOptions")

            ensure(node.typeArguments == null)

            "${render(expression)}<node.stream.Transform>"
        } ?: nullable {
            ensure(isExpressionWithTypeArguments(node))

            val expression = node.expression
            ensure(isIdentifier(expression))
            ensure(expression.text == "OutgoingMessage")

            ensure(node.typeArguments == null)

            "${render(expression)}<IncomingMessage>"
        } ?: nullable {
            ensure(isExpressionWithTypeArguments(node))

            val expression = node.expression
            ensure(isIdentifier(expression))
            ensure(expression.text == "Function")

            ensure(node.typeArguments == null)

            "js.function.JsFunction<Nothing, Any?>"
        }
    }
}
