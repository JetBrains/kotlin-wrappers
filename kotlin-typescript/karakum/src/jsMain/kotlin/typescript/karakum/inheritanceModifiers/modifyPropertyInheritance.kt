package typescript.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature
import typescript.isTypeAliasDeclaration

fun modifyPropertyInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable {
            ensure(
                name.text == "kind"
                        || name.text == "parent"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(
                interfaceNode.name.text != "Node"
                        && interfaceNode.name.text != "TypePredicateBase"
                        && interfaceNode.name.text != "CallHierarchyItem"
                        && interfaceNode.name.text != "CommentRange"
                        && interfaceNode.name.text != "CompletionEntry"
                        && interfaceNode.name.text != "CompletionEntryDetails"
                        && interfaceNode.name.text != "DefinitionInfo"
                        && interfaceNode.name.text != "HighlightSpan"
                        && interfaceNode.name.text != "ImplementationLocation"
                        && interfaceNode.name.text != "InlayHint"
                        && interfaceNode.name.text != "InvalidatedProjectBase"
                        && interfaceNode.name.text != "NavigateToItem"
                        && interfaceNode.name.text != "NavigationBarItem"
                        && interfaceNode.name.text != "NavigationTree"
                        && interfaceNode.name.text != "OutliningSpan"
                        && interfaceNode.name.text != "PerformanceEvent"
                        && interfaceNode.name.text != "QuickInfo"
                        && interfaceNode.name.text != "RefactorActionInfo"
                        && interfaceNode.name.text != "RenameInfoSuccess"
                        && interfaceNode.name.text != "SelectionRange"
                        && interfaceNode.name.text != "SignatureHelpCharacterTypedReason"
                        && interfaceNode.name.text != "SignatureHelpInvokedReason"
                        && interfaceNode.name.text != "SignatureHelpRetriggeredReason"
                        && interfaceNode.name.text != "SymbolDisplayPart"
            )

            "override"
        } ?: nullable {
            ensure(name.text == "left")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ArrayDestructuringAssignment")

            "override"
        } ?: nullable {
            ensure(
                name.text == "body"
                        || name.text == "name"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ArrowFunction")

            "override"
        } ?: nullable {
            ensure(name.text == "type")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "AssertsIdentifierTypePredicate")

            "override"
        } ?: nullable {
            ensure(name.text == "type")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "AssertsThisTypePredicate")

            "override"
        } ?: nullable {
            ensure(
                name.text == "left"
                        || name.text == "operatorToken"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "AssignmentExpression")

            "override"
        } ?: nullable {
            ensure(name.text == "value")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "BigIntLiteralType")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "BindingElement")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ClassDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ClassElement")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ClassLikeDeclarationBase")

            "override"
        } ?: nullable {
            ensure(name.text == "moduleSpecifier")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "CompletionEntryDataResolved")

            "override"
        } ?: nullable {
            ensure(name.text == "exportMapKey")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "CompletionEntryDataUnresolved")

            "override"
        } ?: nullable {
            ensure(name.text == "body")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ConstructorDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "DeclarationStatement")

            "override"
        } ?: nullable {
            ensure(
                name.text == "file"
                        || name.text == "start"
                        || name.text == "length"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "DiagnosticWithLocation")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "EnumDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "EnumMember")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ExportSpecifier")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "body"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "FunctionDeclaration")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "body"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "FunctionExpression")

            "override"
        } ?: nullable {
            ensure(name.text == "type")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "FunctionOrConstructorTypeNodeBase")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "body"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "GetAccessorDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "type")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "IdentifierTypePredicate")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val typeAlias = node
                .getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // TypeAliasDeclaration
                .let { ensureNotNull(it) }
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "ImmediatelyInvokedArrowFunction")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val typeAlias = node
                .getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // PropertySignature
                ?.getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // TypeAliasDeclaration
                .let { ensureNotNull(it) }
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "ImmediatelyInvokedArrowFunction")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val typeAlias = node
                .getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // TypeAliasDeclaration
                .let { ensureNotNull(it) }
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "ImmediatelyInvokedFunctionExpression")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ImportCall")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ImportClause")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ImportEqualsDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ImportSpecifier")

            "override"
        } ?: nullable {
            ensure(name.text == "type")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "IndexSignatureDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "operatorToken")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "InstanceofExpression")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "InterfaceDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = node
                .getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // PropertySignature
                ?.getParentOrNull() // InterfaceDeclaration
                .let { ensureNotNull(it) }
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JSDocAugmentsTag")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = node
                .getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // PropertySignature
                ?.getParentOrNull() // InterfaceDeclaration
                .let { ensureNotNull(it) }
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JSDocImplementsTag")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JSDocCallbackTag")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "body"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JSDocNamespaceDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JSDocTypedefTag")

            "override"
        } ?: nullable {
            ensure(
                name.text == "operator"
                        || name.text == "operand"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JsonMinusNumericLiteral")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JsonObjectExpressionStatement")

            "override"
        } ?: nullable {
            ensure(name.text == "statements")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JsonSourceFile")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "JsxTagNamePropertyAccess")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "body"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "MethodDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "MethodSignature")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "MissingDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ModuleDeclaration")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "body"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "NamespaceDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "NamespaceExport")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "NamespaceExportDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "NamespaceImport")

            "override"
        } ?: nullable {
            ensure(name.text == "value")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "NumberLiteralType")

            "override"
        } ?: nullable {
            ensure(name.text == "left")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ObjectDestructuringAssignment")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ObjectLiteralElement")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ParameterDeclaration")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "parent"
            )

            val typeAlias = node
                .getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // TypeAliasDeclaration
                .let { ensureNotNull(it) }
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "ParameterPropertyDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "useCaseSensitiveFileNames")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ParseConfigHost")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "expression"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "PropertyAccessEntityNameExpression")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "PropertyAccessExpression")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "PropertyAssignment")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "PropertyAccessChain")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "PropertyDeclaration")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "questionToken"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "PropertySignature")

            "override"
        } ?: nullable {
            ensure(name.text == "scoped")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ScopedEmitHelper")

            "override"
        } ?: nullable {
            ensure(
                name.text == "name"
                        || name.text == "body"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "SetAccessorDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ShorthandPropertyAssignment")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "SignatureDeclarationBase")

            "override"
        } ?: nullable {
            ensure(name.text == "value")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "StringLiteralType")

            "override"
        } ?: nullable {
            ensure(name.text == "symbol")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "StringMappingType")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "SuperCall")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "SuperElementAccessExpression")

            "override"
        } ?: nullable {
            ensure(name.text == "expression")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "SuperPropertyAccessExpression")

            "override"
        } ?: nullable {
            ensure(
                name.text == "pos"
                        || name.text == "end"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "SynthesizedComment")

            "override"
        } ?: nullable {
            ensure(name.text == "type")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ThisTypePredicate")

            "override"
        } ?: nullable {
            ensure(name.text == "target")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "TupleTypeReference")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "TypeAliasDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "TypeElement")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "TypeParameterDeclaration")

            "override"
        } ?: nullable {
            ensure(name.text == "symbol")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "UniqueESSymbolType")

            "override"
        } ?: nullable {
            ensure(name.text == "data")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "UnparsedPrepend")

            "override"
        } ?: nullable {
            ensure(name.text == "data")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "UnparsedPrologue")

            "override"
        } ?: nullable {
            ensure(
                name.text == "scoped"
                        || name.text == "text"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "UnscopedEmitHelper")

            "override"
        } ?: nullable {
            ensure(name.text == "name")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "VariableDeclaration")

            "override"
        }
    }
}
