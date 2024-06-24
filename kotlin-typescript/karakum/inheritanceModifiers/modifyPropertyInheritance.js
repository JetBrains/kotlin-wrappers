import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "kind"
            || node.name.text === "parent"
        )

        && !(
            node.parent
            && ts.isInterfaceDeclaration(node.parent)
            && (
                node.parent.name.text === "Node"
                || node.parent.name.text === "TypePredicateBase"
                || node.parent.name.text === "CallHierarchyItem"
                || node.parent.name.text === "CommentRange"
                || node.parent.name.text === "CompletionEntry"
                || node.parent.name.text === "CompletionEntryDetails"
                || node.parent.name.text === "DefinitionInfo"
                || node.parent.name.text === "HighlightSpan"
                || node.parent.name.text === "ImplementationLocation"
                || node.parent.name.text === "InlayHint"
                || node.parent.name.text === "InvalidatedProjectBase"
                || node.parent.name.text === "NavigateToItem"
                || node.parent.name.text === "NavigationBarItem"
                || node.parent.name.text === "NavigationTree"
                || node.parent.name.text === "OutliningSpan"
                || node.parent.name.text === "PerformanceEvent"
                || node.parent.name.text === "QuickInfo"
                || node.parent.name.text === "RefactorActionInfo"
                || node.parent.name.text === "RenameInfoSuccess"
                || node.parent.name.text === "SelectionRange"
                || node.parent.name.text === "SignatureHelpCharacterTypedReason"
                || node.parent.name.text === "SignatureHelpInvokedReason"
                || node.parent.name.text === "SignatureHelpRetriggeredReason"
                || node.parent.name.text === "SymbolDisplayPart"
            )
        )
    ) {
        return "override"
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                node.name.text === "left"
                && node.parent
                && node.parent.name?.text === "ArrayDestructuringAssignment"
            )
            || (
                (
                    node.name.text === "body"
                    || node.name.text === "name"
                )
                && node.parent
                && node.parent.name?.text === "ArrowFunction"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "AssertsIdentifierTypePredicate"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "AssertsThisTypePredicate"
            )
            || (
                (
                    node.name.text === "left"
                    || node.name.text === "operatorToken"
                )
                && node.parent
                && node.parent.name?.text === "AssignmentExpression"
            )
            || (
                node.name.text === "value"
                && node.parent
                && node.parent.name?.text === "BigIntLiteralType"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "BindingElement"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ClassDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ClassElement"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ClassLikeDeclarationBase"
            )
            || (
                node.name.text === "moduleSpecifier"
                && node.parent
                && node.parent.name?.text === "CompletionEntryDataResolved"
            )
            || (
                node.name.text === "exportMapKey"
                && node.parent
                && node.parent.name?.text === "CompletionEntryDataUnresolved"
            )
            || (
                node.name.text === "body"
                && node.parent
                && node.parent.name?.text === "ConstructorDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "DeclarationStatement"
            )
            || (
                (
                    node.name.text === "file"
                    || node.name.text === "start"
                    || node.name.text === "length"
                )
                && node.parent
                && node.parent.name?.text === "DiagnosticWithLocation"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "EnumDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "EnumMember"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ExportSpecifier"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "FunctionDeclaration"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "FunctionExpression"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "FunctionOrConstructorTypeNodeBase"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "GetAccessorDeclaration"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "IdentifierTypePredicate"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                && ts.isTypeAliasDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name.text === "ImmediatelyInvokedArrowFunction"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                && ts.isTypeAliasDeclaration(node.parent.parent.parent.parent.parent.parent)
                && node.parent.parent.parent.parent.parent.parent.name.text === "ImmediatelyInvokedArrowFunction"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                && ts.isTypeAliasDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name.text === "ImmediatelyInvokedFunctionExpression"
            )
            || (
                node.name.text === "expression"
                && node.parent
                && node.parent.name?.text === "ImportCall"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ImportClause"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ImportEqualsDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ImportSpecifier"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "IndexSignatureDeclaration"
            )
            || (
                node.name.text === "operatorToken"
                && node.parent
                && node.parent.name?.text === "InstanceofExpression"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "InterfaceDeclaration"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / PropertySignature / InterfaceDeclaration
                && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)
                && node.parent.parent.parent.parent.name.text === "JSDocAugmentsTag"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "JSDocCallbackTag"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / PropertySignature / InterfaceDeclaration
                && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)
                && node.parent.parent.parent.parent.name.text === "JSDocImplementsTag"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "JSDocNamespaceDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "JSDocTypedefTag"
            )
            || (
                (
                    node.name.text === "operator"
                    || node.name.text === "operand"
                )
                && node.parent
                && node.parent.name?.text === "JsonMinusNumericLiteral"
            )
            || (
                node.name.text === "expression"
                && node.parent
                && node.parent.name?.text === "JsonObjectExpressionStatement"
            )
            || (
                node.name.text === "statements"
                && node.parent
                && node.parent.name?.text === "JsonSourceFile"
            )
            || (
                node.name.text === "expression"
                && node.parent
                && node.parent.name?.text === "JsxTagNamePropertyAccess"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "MethodDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "MethodSignature"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "MissingDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ModuleDeclaration"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "NamespaceDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "NamespaceExport"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "NamespaceExportDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "NamespaceImport"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "NamespaceImport"
            )
            || (
                node.name.text === "value"
                && node.parent
                && node.parent.name?.text === "NumberLiteralType"
            )
            || (
                node.name.text === "left"
                && node.parent
                && node.parent.name?.text === "ObjectDestructuringAssignment"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ObjectLiteralElement"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ParameterDeclaration"
            )
            || (
                node.name.text === "name"
                && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                && ts.isTypeAliasDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name.text === "ParameterPropertyDeclaration"
            )
            || (
                node.name.text === "useCaseSensitiveFileNames"
                && node.parent
                && node.parent.name?.text === "ParseConfigHost"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "expression"
                )
                && node.parent
                && node.parent.name?.text === "PropertyAccessEntityNameExpression"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "PropertyAccessExpression"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "PropertyAssignment"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "PropertyAccessChain"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "PropertyDeclaration"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "questionToken"
                )
                && node.parent
                && node.parent.name?.text === "PropertySignature"
            )
            || (
                node.name.text === "scoped"
                && node.parent
                && node.parent.name?.text === "ScopedEmitHelper"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "SetAccessorDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ScopedEmitHelper"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ShorthandPropertyAssignment"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "SignatureDeclarationBase"
            )
            || (
                node.name.text === "value"
                && node.parent
                && node.parent.name?.text === "StringLiteralType"
            )
            || (
                node.name.text === "symbol"
                && node.parent
                && node.parent.name?.text === "StringMappingType"
            )
            || (
                node.name.text === "expression"
                && node.parent
                && node.parent.name?.text === "SuperCall"
            )
            || (
                node.name.text === "expression"
                && node.parent
                && node.parent.name?.text === "SuperElementAccessExpression"
            )
            || (
                node.name.text === "expression"
                && node.parent
                && node.parent.name?.text === "SuperPropertyAccessExpression"
            )
            || (
                (
                    node.name.text === "pos"
                    || node.name.text === "end"
                )
                && node.parent
                && node.parent.name?.text === "SynthesizedComment"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "ThisTypePredicate"
            )
            || (
                node.name.text === "target"
                && node.parent
                && node.parent.name?.text === "TupleTypeReference"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "TypeAliasDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "TypeElement"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "TypeParameterDeclaration"
            )
            || (
                node.name.text === "symbol"
                && node.parent
                && node.parent.name?.text === "UniqueESSymbolType"
            )
            || (
                node.name.text === "data"
                && node.parent
                && node.parent.name?.text === "UnparsedPrepend"
            )
            || (
                node.name.text === "data"
                && node.parent
                && node.parent.name?.text === "UnparsedPrologue"
            )
            || (
                (
                    node.name.text === "scoped"
                    || node.name.text === "text"
                )
                && node.parent
                && node.parent.name?.text === "UnscopedEmitHelper"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "VariableDeclaration"
            )
        )
    ) {
        return "override"
    }

    return null
}
