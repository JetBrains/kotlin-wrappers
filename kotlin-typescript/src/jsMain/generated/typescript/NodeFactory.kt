// Automatically generated - do not modify!

package typescript

sealed external interface NodeFactory {
    fun <T : Node> createNodeArray(
        elements: js.array.ReadonlyArray<T> = definedExternally,
        hasTrailingComma: Boolean = definedExternally,
    ): NodeArray<T>

    fun createNumericLiteral(value: String, numericLiteralFlags: TokenFlags = definedExternally): NumericLiteral

    fun createNumericLiteral(value: Double, numericLiteralFlags: TokenFlags = definedExternally): NumericLiteral
    fun createBigIntLiteral(value: String): BigIntLiteral

    fun createBigIntLiteral(value: PseudoBigInt): BigIntLiteral
    fun createStringLiteral(text: String, isSingleQuote: Boolean = definedExternally): StringLiteral
    fun createStringLiteralFromNode(
        sourceNode: PropertyNameLiteral,
        isSingleQuote: Boolean = definedExternally,
    ): StringLiteral

    fun createStringLiteralFromNode(
        sourceNode: PrivateIdentifier,
        isSingleQuote: Boolean = definedExternally,
    ): StringLiteral

    fun createRegularExpressionLiteral(text: String): RegularExpressionLiteral
    fun createIdentifier(text: String): Identifier

    /**
     * Create a unique temporary variable.
     * @param recordTempVariable An optional callback used to record the temporary variable name. This
     * should usually be a reference to `hoistVariableDeclaration` from a `TransformationContext`, but
     * can be `undefined` if you plan to record the temporary variable manually.
     * @param reservedInNestedScopes When `true`, reserves the temporary variable name in all nested scopes
     * during emit so that the variable can be referenced in a nested function body. This is an alternative to
     * setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
     */
    fun createTempVariable(
        recordTempVariable: ((node: Identifier) -> Unit)?,
        reservedInNestedScopes: Boolean = definedExternally,
    ): Identifier

    /**
     * Create a unique temporary variable for use in a loop.
     * @param reservedInNestedScopes When `true`, reserves the temporary variable name in all nested scopes
     * during emit so that the variable can be referenced in a nested function body. This is an alternative to
     * setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
     */
    fun createLoopVariable(reservedInNestedScopes: Boolean = definedExternally): Identifier

    /** Create a unique name based on the supplied text. */
    fun createUniqueName(text: String, flags: GeneratedIdentifierFlags = definedExternally): Identifier

    /** Create a unique name generated for a node. */
    fun getGeneratedNameForNode(node: Node?, flags: GeneratedIdentifierFlags = definedExternally): Identifier
    fun createPrivateIdentifier(text: String): PrivateIdentifier
    fun createUniquePrivateName(text: String = definedExternally): PrivateIdentifier
    fun getGeneratedPrivateNameForNode(node: Node): PrivateIdentifier
    fun createToken(token: SyntaxKind.SuperKeyword): SuperExpression
    fun createToken(token: SyntaxKind.ThisKeyword): ThisExpression
    fun createToken(token: SyntaxKind.NullKeyword): NullLiteral
    fun createToken(token: SyntaxKind.TrueKeyword): TrueLiteral
    fun createToken(token: SyntaxKind.FalseKeyword): FalseLiteral
    fun createToken(token: SyntaxKind.EndOfFileToken): EndOfFileToken
    fun createToken(token: SyntaxKind.Unknown): Token<SyntaxKind.Unknown>
    fun <TKind : PunctuationSyntaxKind> createToken(token: TKind): PunctuationToken<TKind>
    fun <TKind : KeywordTypeSyntaxKind> createToken(token: TKind): KeywordTypeNode<TKind>
    fun <TKind : ModifierSyntaxKind> createToken(token: TKind): ModifierToken<TKind>
    fun <TKind : KeywordSyntaxKind> createToken(token: TKind): KeywordToken<TKind>
    fun createSuper(): SuperExpression
    fun createThis(): ThisExpression
    fun createNull(): NullLiteral
    fun createTrue(): TrueLiteral
    fun createFalse(): FalseLiteral
    fun <T : ModifierSyntaxKind> createModifier(kind: T): ModifierToken<T>
    fun createModifiersFromModifierFlags(flags: ModifierFlags): js.array.ReadonlyArray<Modifier>?
    fun createQualifiedName(left: EntityName, right: String): QualifiedName

    fun createQualifiedName(left: EntityName, right: Identifier): QualifiedName
    fun updateQualifiedName(node: QualifiedName, left: EntityName, right: Identifier): QualifiedName
    fun createComputedPropertyName(expression: Expression): ComputedPropertyName
    fun updateComputedPropertyName(node: ComputedPropertyName, expression: Expression): ComputedPropertyName
    fun createTypeParameterDeclaration(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: String,
        constraint: TypeNode = definedExternally,
        defaultType: TypeNode = definedExternally,
    ): TypeParameterDeclaration

    fun createTypeParameterDeclaration(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: Identifier,
        constraint: TypeNode = definedExternally,
        defaultType: TypeNode = definedExternally,
    ): TypeParameterDeclaration

    fun updateTypeParameterDeclaration(
        node: TypeParameterDeclaration,
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: Identifier,
        constraint: TypeNode?,
        defaultType: TypeNode?,
    ): TypeParameterDeclaration

    fun createParameterDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        dotDotDotToken: DotDotDotToken?,
        name: String,
        questionToken: QuestionToken = definedExternally,
        type: TypeNode = definedExternally,
        initializer: Expression = definedExternally,
    ): ParameterDeclaration

    fun createParameterDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        dotDotDotToken: DotDotDotToken?,
        name: BindingName,
        questionToken: QuestionToken = definedExternally,
        type: TypeNode = definedExternally,
        initializer: Expression = definedExternally,
    ): ParameterDeclaration

    fun updateParameterDeclaration(
        node: ParameterDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        dotDotDotToken: DotDotDotToken?,
        name: String,
        questionToken: QuestionToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): ParameterDeclaration

    fun updateParameterDeclaration(
        node: ParameterDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        dotDotDotToken: DotDotDotToken?,
        name: BindingName,
        questionToken: QuestionToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): ParameterDeclaration

    fun createDecorator(expression: Expression): Decorator
    fun updateDecorator(node: Decorator, expression: Expression): Decorator
    fun createPropertySignature(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: PropertyName,
        questionToken: QuestionToken?,
        type: TypeNode?,
    ): PropertySignature

    fun createPropertySignature(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: String,
        questionToken: QuestionToken?,
        type: TypeNode?,
    ): PropertySignature

    fun updatePropertySignature(
        node: PropertySignature,
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: PropertyName,
        questionToken: QuestionToken?,
        type: TypeNode?,
    ): PropertySignature

    fun createPropertyDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        questionOrExclamationToken: QuestionToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun createPropertyDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        questionOrExclamationToken: ExclamationToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun createPropertyDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        questionOrExclamationToken: QuestionToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun createPropertyDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        questionOrExclamationToken: ExclamationToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun updatePropertyDeclaration(
        node: PropertyDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        questionOrExclamationToken: QuestionToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun updatePropertyDeclaration(
        node: PropertyDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        questionOrExclamationToken: ExclamationToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun updatePropertyDeclaration(
        node: PropertyDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        questionOrExclamationToken: QuestionToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun updatePropertyDeclaration(
        node: PropertyDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        questionOrExclamationToken: ExclamationToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun createMethodSignature(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: String,
        questionToken: QuestionToken?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): MethodSignature

    fun createMethodSignature(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: PropertyName,
        questionToken: QuestionToken?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): MethodSignature

    fun updateMethodSignature(
        node: MethodSignature,
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        name: PropertyName,
        questionToken: QuestionToken?,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode?,
    ): MethodSignature

    fun createMethodDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        asteriskToken: AsteriskToken?,
        name: String,
        questionToken: QuestionToken?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): MethodDeclaration

    fun createMethodDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        asteriskToken: AsteriskToken?,
        name: PropertyName,
        questionToken: QuestionToken?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): MethodDeclaration

    fun updateMethodDeclaration(
        node: MethodDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        asteriskToken: AsteriskToken?,
        name: PropertyName,
        questionToken: QuestionToken?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): MethodDeclaration

    fun createConstructorDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): ConstructorDeclaration

    fun updateConstructorDeclaration(
        node: ConstructorDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): ConstructorDeclaration

    fun createGetAccessorDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): GetAccessorDeclaration

    fun createGetAccessorDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): GetAccessorDeclaration

    fun updateGetAccessorDeclaration(
        node: GetAccessorDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): GetAccessorDeclaration

    fun createSetAccessorDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): SetAccessorDeclaration

    fun createSetAccessorDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): SetAccessorDeclaration

    fun updateSetAccessorDeclaration(
        node: SetAccessorDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: PropertyName,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): SetAccessorDeclaration

    fun createCallSignature(
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): CallSignatureDeclaration

    fun updateCallSignature(
        node: CallSignatureDeclaration,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode?,
    ): CallSignatureDeclaration

    fun createConstructSignature(
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): ConstructSignatureDeclaration

    fun updateConstructSignature(
        node: ConstructSignatureDeclaration,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode?,
    ): ConstructSignatureDeclaration

    fun createIndexSignature(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): IndexSignatureDeclaration

    fun updateIndexSignature(
        node: IndexSignatureDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): IndexSignatureDeclaration

    fun createTemplateLiteralTypeSpan(type: TypeNode, literal: TemplateMiddle): TemplateLiteralTypeSpan

    fun createTemplateLiteralTypeSpan(type: TypeNode, literal: TemplateTail): TemplateLiteralTypeSpan
    fun updateTemplateLiteralTypeSpan(
        node: TemplateLiteralTypeSpan,
        type: TypeNode,
        literal: TemplateMiddle,
    ): TemplateLiteralTypeSpan

    fun updateTemplateLiteralTypeSpan(
        node: TemplateLiteralTypeSpan,
        type: TypeNode,
        literal: TemplateTail,
    ): TemplateLiteralTypeSpan

    fun createClassStaticBlockDeclaration(body: Block): ClassStaticBlockDeclaration
    fun updateClassStaticBlockDeclaration(node: ClassStaticBlockDeclaration, body: Block): ClassStaticBlockDeclaration
    fun <TKind : KeywordTypeSyntaxKind> createKeywordTypeNode(kind: TKind): KeywordTypeNode<TKind>
    fun createTypePredicateNode(
        assertsModifier: AssertsKeyword?,
        parameterName: Identifier,
        type: TypeNode?,
    ): TypePredicateNode

    fun createTypePredicateNode(
        assertsModifier: AssertsKeyword?,
        parameterName: ThisTypeNode,
        type: TypeNode?,
    ): TypePredicateNode

    fun createTypePredicateNode(
        assertsModifier: AssertsKeyword?,
        parameterName: String,
        type: TypeNode?,
    ): TypePredicateNode

    fun updateTypePredicateNode(
        node: TypePredicateNode,
        assertsModifier: AssertsKeyword?,
        parameterName: Identifier,
        type: TypeNode?,
    ): TypePredicateNode

    fun updateTypePredicateNode(
        node: TypePredicateNode,
        assertsModifier: AssertsKeyword?,
        parameterName: ThisTypeNode,
        type: TypeNode?,
    ): TypePredicateNode

    fun createTypeReferenceNode(
        typeName: String,
        typeArguments: js.array.ReadonlyArray<TypeNode> = definedExternally,
    ): TypeReferenceNode

    fun createTypeReferenceNode(
        typeName: EntityName,
        typeArguments: js.array.ReadonlyArray<TypeNode> = definedExternally,
    ): TypeReferenceNode

    fun updateTypeReferenceNode(
        node: TypeReferenceNode,
        typeName: EntityName,
        typeArguments: NodeArray<TypeNode>?,
    ): TypeReferenceNode

    fun createFunctionTypeNode(
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): FunctionTypeNode

    fun updateFunctionTypeNode(
        node: FunctionTypeNode,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode,
    ): FunctionTypeNode

    fun createConstructorTypeNode(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): ConstructorTypeNode

    fun updateConstructorTypeNode(
        node: ConstructorTypeNode,
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode,
    ): ConstructorTypeNode

    fun createTypeQueryNode(
        exprName: EntityName,
        typeArguments: js.array.ReadonlyArray<TypeNode> = definedExternally,
    ): TypeQueryNode

    fun updateTypeQueryNode(
        node: TypeQueryNode,
        exprName: EntityName,
        typeArguments: js.array.ReadonlyArray<TypeNode> = definedExternally,
    ): TypeQueryNode

    fun createTypeLiteralNode(members: (js.array.ReadonlyArray<TypeElement>)?): TypeLiteralNode
    fun updateTypeLiteralNode(node: TypeLiteralNode, members: NodeArray<TypeElement>): TypeLiteralNode
    fun createArrayTypeNode(elementType: TypeNode): ArrayTypeNode
    fun updateArrayTypeNode(node: ArrayTypeNode, elementType: TypeNode): ArrayTypeNode
    fun createTupleTypeNode(elements: js.array.ReadonlyArray<(NodeFactoryCreateTupleTypeNodeElementsItem)>): TupleTypeNode
    fun updateTupleTypeNode(
        node: TupleTypeNode,
        elements: js.array.ReadonlyArray<(NodeFactoryUpdateTupleTypeNodeElementsItem)>,
    ): TupleTypeNode

    fun createNamedTupleMember(
        dotDotDotToken: DotDotDotToken?,
        name: Identifier,
        questionToken: QuestionToken?,
        type: TypeNode,
    ): NamedTupleMember

    fun updateNamedTupleMember(
        node: NamedTupleMember,
        dotDotDotToken: DotDotDotToken?,
        name: Identifier,
        questionToken: QuestionToken?,
        type: TypeNode,
    ): NamedTupleMember

    fun createOptionalTypeNode(type: TypeNode): OptionalTypeNode
    fun updateOptionalTypeNode(node: OptionalTypeNode, type: TypeNode): OptionalTypeNode
    fun createRestTypeNode(type: TypeNode): RestTypeNode
    fun updateRestTypeNode(node: RestTypeNode, type: TypeNode): RestTypeNode
    fun createUnionTypeNode(types: js.array.ReadonlyArray<TypeNode>): UnionTypeNode
    fun updateUnionTypeNode(node: UnionTypeNode, types: NodeArray<TypeNode>): UnionTypeNode
    fun createIntersectionTypeNode(types: js.array.ReadonlyArray<TypeNode>): IntersectionTypeNode
    fun updateIntersectionTypeNode(node: IntersectionTypeNode, types: NodeArray<TypeNode>): IntersectionTypeNode
    fun createConditionalTypeNode(
        checkType: TypeNode,
        extendsType: TypeNode,
        trueType: TypeNode,
        falseType: TypeNode,
    ): ConditionalTypeNode

    fun updateConditionalTypeNode(
        node: ConditionalTypeNode,
        checkType: TypeNode,
        extendsType: TypeNode,
        trueType: TypeNode,
        falseType: TypeNode,
    ): ConditionalTypeNode

    fun createInferTypeNode(typeParameter: TypeParameterDeclaration): InferTypeNode
    fun updateInferTypeNode(node: InferTypeNode, typeParameter: TypeParameterDeclaration): InferTypeNode
    fun createImportTypeNode(
        argument: TypeNode,
        attributes: ImportAttributes = definedExternally,
        qualifier: EntityName = definedExternally,
        typeArguments: js.array.ReadonlyArray<TypeNode> = definedExternally,
        isTypeOf: Boolean = definedExternally,
    ): ImportTypeNode

    fun updateImportTypeNode(
        node: ImportTypeNode,
        argument: TypeNode,
        attributes: ImportAttributes?,
        qualifier: EntityName?,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        isTypeOf: Boolean = definedExternally,
    ): ImportTypeNode

    fun createParenthesizedType(type: TypeNode): ParenthesizedTypeNode
    fun updateParenthesizedType(node: ParenthesizedTypeNode, type: TypeNode): ParenthesizedTypeNode
    fun createThisTypeNode(): ThisTypeNode
    fun createTypeOperatorNode(operator: SyntaxKind.KeyOfKeyword, type: TypeNode): TypeOperatorNode

    fun createTypeOperatorNode(operator: SyntaxKind.UniqueKeyword, type: TypeNode): TypeOperatorNode

    fun createTypeOperatorNode(operator: SyntaxKind.ReadonlyKeyword, type: TypeNode): TypeOperatorNode
    fun updateTypeOperatorNode(node: TypeOperatorNode, type: TypeNode): TypeOperatorNode
    fun createIndexedAccessTypeNode(objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode
    fun updateIndexedAccessTypeNode(
        node: IndexedAccessTypeNode,
        objectType: TypeNode,
        indexType: TypeNode,
    ): IndexedAccessTypeNode

    fun createMappedTypeNode(
        readonlyToken: ReadonlyKeyword?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: QuestionToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: ReadonlyKeyword?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: PlusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: ReadonlyKeyword?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: MinusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: PlusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: QuestionToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: PlusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: PlusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: PlusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: MinusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: MinusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: QuestionToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: MinusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: PlusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createMappedTypeNode(
        readonlyToken: MinusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: MinusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: ReadonlyKeyword?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: QuestionToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: ReadonlyKeyword?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: PlusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: ReadonlyKeyword?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: MinusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: PlusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: QuestionToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: PlusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: PlusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: PlusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: MinusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: MinusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: QuestionToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: MinusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: PlusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: MinusToken?,
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: MinusToken?,
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createLiteralTypeNode(literal: NodeFactoryCreateLiteralTypeNodeLiteral): LiteralTypeNode
    fun updateLiteralTypeNode(node: LiteralTypeNode, literal: NodeFactoryUpdateLiteralTypeNodeLiteral): LiteralTypeNode
    fun createTemplateLiteralType(
        head: TemplateHead,
        templateSpans: js.array.ReadonlyArray<TemplateLiteralTypeSpan>,
    ): TemplateLiteralTypeNode

    fun updateTemplateLiteralType(
        node: TemplateLiteralTypeNode,
        head: TemplateHead,
        templateSpans: js.array.ReadonlyArray<TemplateLiteralTypeSpan>,
    ): TemplateLiteralTypeNode

    fun createObjectBindingPattern(elements: js.array.ReadonlyArray<BindingElement>): ObjectBindingPattern
    fun updateObjectBindingPattern(
        node: ObjectBindingPattern,
        elements: js.array.ReadonlyArray<BindingElement>,
    ): ObjectBindingPattern

    fun createArrayBindingPattern(elements: js.array.ReadonlyArray<ArrayBindingElement>): ArrayBindingPattern
    fun updateArrayBindingPattern(
        node: ArrayBindingPattern,
        elements: js.array.ReadonlyArray<ArrayBindingElement>,
    ): ArrayBindingPattern

    fun createBindingElement(
        dotDotDotToken: DotDotDotToken?,
        propertyName: String?,
        name: String,
        initializer: Expression = definedExternally,
    ): BindingElement

    fun createBindingElement(
        dotDotDotToken: DotDotDotToken?,
        propertyName: String?,
        name: BindingName,
        initializer: Expression = definedExternally,
    ): BindingElement

    fun createBindingElement(
        dotDotDotToken: DotDotDotToken?,
        propertyName: PropertyName?,
        name: String,
        initializer: Expression = definedExternally,
    ): BindingElement

    fun createBindingElement(
        dotDotDotToken: DotDotDotToken?,
        propertyName: PropertyName?,
        name: BindingName,
        initializer: Expression = definedExternally,
    ): BindingElement

    fun updateBindingElement(
        node: BindingElement,
        dotDotDotToken: DotDotDotToken?,
        propertyName: PropertyName?,
        name: BindingName,
        initializer: Expression?,
    ): BindingElement

    fun createArrayLiteralExpression(
        elements: js.array.ReadonlyArray<Expression> = definedExternally,
        multiLine: Boolean = definedExternally,
    ): ArrayLiteralExpression

    fun updateArrayLiteralExpression(
        node: ArrayLiteralExpression,
        elements: js.array.ReadonlyArray<Expression>,
    ): ArrayLiteralExpression

    fun createObjectLiteralExpression(
        properties: js.array.ReadonlyArray<ObjectLiteralElementLike> = definedExternally,
        multiLine: Boolean = definedExternally,
    ): ObjectLiteralExpression

    fun updateObjectLiteralExpression(
        node: ObjectLiteralExpression,
        properties: js.array.ReadonlyArray<ObjectLiteralElementLike>,
    ): ObjectLiteralExpression

    fun createPropertyAccessExpression(expression: Expression, name: String): PropertyAccessExpression

    fun createPropertyAccessExpression(expression: Expression, name: MemberName): PropertyAccessExpression
    fun updatePropertyAccessExpression(
        node: PropertyAccessExpression,
        expression: Expression,
        name: MemberName,
    ): PropertyAccessExpression

    fun createPropertyAccessChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        name: String,
    ): PropertyAccessChain

    fun createPropertyAccessChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        name: MemberName,
    ): PropertyAccessChain

    fun updatePropertyAccessChain(
        node: PropertyAccessChain,
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        name: MemberName,
    ): PropertyAccessChain

    fun createElementAccessExpression(expression: Expression, index: Double): ElementAccessExpression

    fun createElementAccessExpression(expression: Expression, index: Expression): ElementAccessExpression
    fun updateElementAccessExpression(
        node: ElementAccessExpression,
        expression: Expression,
        argumentExpression: Expression,
    ): ElementAccessExpression

    fun createElementAccessChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        index: Double,
    ): ElementAccessChain

    fun createElementAccessChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        index: Expression,
    ): ElementAccessChain

    fun updateElementAccessChain(
        node: ElementAccessChain,
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        argumentExpression: Expression,
    ): ElementAccessChain

    fun createCallExpression(
        expression: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        argumentsArray: (js.array.ReadonlyArray<Expression>)?,
    ): CallExpression

    fun updateCallExpression(
        node: CallExpression,
        expression: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        argumentsArray: js.array.ReadonlyArray<Expression>,
    ): CallExpression

    fun createCallChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        argumentsArray: (js.array.ReadonlyArray<Expression>)?,
    ): CallChain

    fun updateCallChain(
        node: CallChain,
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        argumentsArray: js.array.ReadonlyArray<Expression>,
    ): CallChain

    fun createNewExpression(
        expression: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        argumentsArray: (js.array.ReadonlyArray<Expression>)?,
    ): NewExpression

    fun updateNewExpression(
        node: NewExpression,
        expression: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        argumentsArray: (js.array.ReadonlyArray<Expression>)?,
    ): NewExpression

    fun createTaggedTemplateExpression(
        tag: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        template: TemplateLiteral,
    ): TaggedTemplateExpression

    fun updateTaggedTemplateExpression(
        node: TaggedTemplateExpression,
        tag: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        template: TemplateLiteral,
    ): TaggedTemplateExpression

    fun createTypeAssertion(type: TypeNode, expression: Expression): TypeAssertion
    fun updateTypeAssertion(node: TypeAssertion, type: TypeNode, expression: Expression): TypeAssertion
    fun createParenthesizedExpression(expression: Expression): ParenthesizedExpression
    fun updateParenthesizedExpression(node: ParenthesizedExpression, expression: Expression): ParenthesizedExpression
    fun createFunctionExpression(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        asteriskToken: AsteriskToken?,
        name: String?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: (js.array.ReadonlyArray<ParameterDeclaration>)?,
        type: TypeNode?,
        body: Block,
    ): FunctionExpression

    fun createFunctionExpression(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        asteriskToken: AsteriskToken?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: (js.array.ReadonlyArray<ParameterDeclaration>)?,
        type: TypeNode?,
        body: Block,
    ): FunctionExpression

    fun updateFunctionExpression(
        node: FunctionExpression,
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        asteriskToken: AsteriskToken?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block,
    ): FunctionExpression

    fun createArrowFunction(
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        equalsGreaterThanToken: EqualsGreaterThanToken?,
        body: ConciseBody,
    ): ArrowFunction

    fun updateArrowFunction(
        node: ArrowFunction,
        modifiers: (js.array.ReadonlyArray<Modifier>)?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        equalsGreaterThanToken: EqualsGreaterThanToken,
        body: ConciseBody,
    ): ArrowFunction

    fun createDeleteExpression(expression: Expression): DeleteExpression
    fun updateDeleteExpression(node: DeleteExpression, expression: Expression): DeleteExpression
    fun createTypeOfExpression(expression: Expression): TypeOfExpression
    fun updateTypeOfExpression(node: TypeOfExpression, expression: Expression): TypeOfExpression
    fun createVoidExpression(expression: Expression): VoidExpression
    fun updateVoidExpression(node: VoidExpression, expression: Expression): VoidExpression
    fun createAwaitExpression(expression: Expression): AwaitExpression
    fun updateAwaitExpression(node: AwaitExpression, expression: Expression): AwaitExpression
    fun createPrefixUnaryExpression(operator: PrefixUnaryOperator, operand: Expression): PrefixUnaryExpression
    fun updatePrefixUnaryExpression(node: PrefixUnaryExpression, operand: Expression): PrefixUnaryExpression
    fun createPostfixUnaryExpression(operand: Expression, operator: PostfixUnaryOperator): PostfixUnaryExpression
    fun updatePostfixUnaryExpression(node: PostfixUnaryExpression, operand: Expression): PostfixUnaryExpression
    fun createBinaryExpression(left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression

    fun createBinaryExpression(left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression
    fun updateBinaryExpression(
        node: BinaryExpression,
        left: Expression,
        operator: BinaryOperator,
        right: Expression,
    ): BinaryExpression

    fun updateBinaryExpression(
        node: BinaryExpression,
        left: Expression,
        operator: BinaryOperatorToken,
        right: Expression,
    ): BinaryExpression

    fun createConditionalExpression(
        condition: Expression,
        questionToken: QuestionToken?,
        whenTrue: Expression,
        colonToken: ColonToken?,
        whenFalse: Expression,
    ): ConditionalExpression

    fun updateConditionalExpression(
        node: ConditionalExpression,
        condition: Expression,
        questionToken: QuestionToken,
        whenTrue: Expression,
        colonToken: ColonToken,
        whenFalse: Expression,
    ): ConditionalExpression

    fun createTemplateExpression(
        head: TemplateHead,
        templateSpans: js.array.ReadonlyArray<TemplateSpan>,
    ): TemplateExpression

    fun updateTemplateExpression(
        node: TemplateExpression,
        head: TemplateHead,
        templateSpans: js.array.ReadonlyArray<TemplateSpan>,
    ): TemplateExpression

    fun createTemplateHead(
        text: String,
        rawText: String = definedExternally,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateHead

    fun createTemplateHead(text: String?, rawText: String, templateFlags: TokenFlags = definedExternally): TemplateHead
    fun createTemplateMiddle(
        text: String,
        rawText: String = definedExternally,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateMiddle

    fun createTemplateMiddle(
        text: String?,
        rawText: String,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateMiddle

    fun createTemplateTail(
        text: String,
        rawText: String = definedExternally,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateTail

    fun createTemplateTail(text: String?, rawText: String, templateFlags: TokenFlags = definedExternally): TemplateTail
    fun createNoSubstitutionTemplateLiteral(
        text: String,
        rawText: String = definedExternally,
    ): NoSubstitutionTemplateLiteral

    fun createNoSubstitutionTemplateLiteral(text: String?, rawText: String): NoSubstitutionTemplateLiteral
    fun createYieldExpression(asteriskToken: AsteriskToken, expression: Expression): YieldExpression
    fun createYieldExpression(asteriskToken: Nothing?, expression: Expression?): YieldExpression
    fun updateYieldExpression(
        node: YieldExpression,
        asteriskToken: AsteriskToken?,
        expression: Expression?,
    ): YieldExpression

    fun createSpreadElement(expression: Expression): SpreadElement
    fun updateSpreadElement(node: SpreadElement, expression: Expression): SpreadElement
    fun createClassExpression(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<ClassElement>,
    ): ClassExpression

    fun createClassExpression(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<ClassElement>,
    ): ClassExpression

    fun updateClassExpression(
        node: ClassExpression,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<ClassElement>,
    ): ClassExpression

    fun createOmittedExpression(): OmittedExpression
    fun createExpressionWithTypeArguments(
        expression: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
    ): ExpressionWithTypeArguments

    fun updateExpressionWithTypeArguments(
        node: ExpressionWithTypeArguments,
        expression: Expression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
    ): ExpressionWithTypeArguments

    fun createAsExpression(expression: Expression, type: TypeNode): AsExpression
    fun updateAsExpression(node: AsExpression, expression: Expression, type: TypeNode): AsExpression
    fun createNonNullExpression(expression: Expression): NonNullExpression
    fun updateNonNullExpression(node: NonNullExpression, expression: Expression): NonNullExpression
    fun createNonNullChain(expression: Expression): NonNullChain
    fun updateNonNullChain(node: NonNullChain, expression: Expression): NonNullChain
    fun createMetaProperty(keywordToken: NodeFactoryCreateMetaPropertyKeywordToken, name: Identifier): MetaProperty
    fun updateMetaProperty(node: MetaProperty, name: Identifier): MetaProperty
    fun createSatisfiesExpression(expression: Expression, type: TypeNode): SatisfiesExpression
    fun updateSatisfiesExpression(
        node: SatisfiesExpression,
        expression: Expression,
        type: TypeNode,
    ): SatisfiesExpression

    fun createTemplateSpan(expression: Expression, literal: TemplateMiddle): TemplateSpan

    fun createTemplateSpan(expression: Expression, literal: TemplateTail): TemplateSpan
    fun updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateMiddle): TemplateSpan

    fun updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateTail): TemplateSpan
    fun createSemicolonClassElement(): SemicolonClassElement
    fun createBlock(statements: js.array.ReadonlyArray<Statement>, multiLine: Boolean = definedExternally): Block
    fun updateBlock(node: Block, statements: js.array.ReadonlyArray<Statement>): Block
    fun createVariableStatement(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        declarationList: VariableDeclarationList,
    ): VariableStatement

    fun createVariableStatement(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        declarationList: js.array.ReadonlyArray<VariableDeclaration>,
    ): VariableStatement

    fun updateVariableStatement(
        node: VariableStatement,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        declarationList: VariableDeclarationList,
    ): VariableStatement

    fun createEmptyStatement(): EmptyStatement
    fun createExpressionStatement(expression: Expression): ExpressionStatement
    fun updateExpressionStatement(node: ExpressionStatement, expression: Expression): ExpressionStatement
    fun createIfStatement(
        expression: Expression,
        thenStatement: Statement,
        elseStatement: Statement = definedExternally,
    ): IfStatement

    fun updateIfStatement(
        node: IfStatement,
        expression: Expression,
        thenStatement: Statement,
        elseStatement: Statement?,
    ): IfStatement

    fun createDoStatement(statement: Statement, expression: Expression): DoStatement
    fun updateDoStatement(node: DoStatement, statement: Statement, expression: Expression): DoStatement
    fun createWhileStatement(expression: Expression, statement: Statement): WhileStatement
    fun updateWhileStatement(node: WhileStatement, expression: Expression, statement: Statement): WhileStatement
    fun createForStatement(
        initializer: ForInitializer?,
        condition: Expression?,
        incrementor: Expression?,
        statement: Statement,
    ): ForStatement

    fun updateForStatement(
        node: ForStatement,
        initializer: ForInitializer?,
        condition: Expression?,
        incrementor: Expression?,
        statement: Statement,
    ): ForStatement

    fun createForInStatement(initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement
    fun updateForInStatement(
        node: ForInStatement,
        initializer: ForInitializer,
        expression: Expression,
        statement: Statement,
    ): ForInStatement

    fun createForOfStatement(
        awaitModifier: AwaitKeyword?,
        initializer: ForInitializer,
        expression: Expression,
        statement: Statement,
    ): ForOfStatement

    fun updateForOfStatement(
        node: ForOfStatement,
        awaitModifier: AwaitKeyword?,
        initializer: ForInitializer,
        expression: Expression,
        statement: Statement,
    ): ForOfStatement

    fun createContinueStatement(): ContinueStatement

    fun createContinueStatement(label: String = definedExternally): ContinueStatement

    fun createContinueStatement(label: Identifier = definedExternally): ContinueStatement
    fun updateContinueStatement(node: ContinueStatement, label: Identifier?): ContinueStatement
    fun createBreakStatement(): BreakStatement

    fun createBreakStatement(label: String = definedExternally): BreakStatement

    fun createBreakStatement(label: Identifier = definedExternally): BreakStatement
    fun updateBreakStatement(node: BreakStatement, label: Identifier?): BreakStatement
    fun createReturnStatement(expression: Expression = definedExternally): ReturnStatement
    fun updateReturnStatement(node: ReturnStatement, expression: Expression?): ReturnStatement
    fun createWithStatement(expression: Expression, statement: Statement): WithStatement
    fun updateWithStatement(node: WithStatement, expression: Expression, statement: Statement): WithStatement
    fun createSwitchStatement(expression: Expression, caseBlock: CaseBlock): SwitchStatement
    fun updateSwitchStatement(node: SwitchStatement, expression: Expression, caseBlock: CaseBlock): SwitchStatement
    fun createLabeledStatement(label: String, statement: Statement): LabeledStatement

    fun createLabeledStatement(label: Identifier, statement: Statement): LabeledStatement
    fun updateLabeledStatement(node: LabeledStatement, label: Identifier, statement: Statement): LabeledStatement
    fun createThrowStatement(expression: Expression): ThrowStatement
    fun updateThrowStatement(node: ThrowStatement, expression: Expression): ThrowStatement
    fun createTryStatement(tryBlock: Block, catchClause: CatchClause?, finallyBlock: Block?): TryStatement
    fun updateTryStatement(
        node: TryStatement,
        tryBlock: Block,
        catchClause: CatchClause?,
        finallyBlock: Block?,
    ): TryStatement

    fun createDebuggerStatement(): DebuggerStatement
    fun createVariableDeclaration(
        name: String,
        exclamationToken: ExclamationToken = definedExternally,
        type: TypeNode = definedExternally,
        initializer: Expression = definedExternally,
    ): VariableDeclaration

    fun createVariableDeclaration(
        name: BindingName,
        exclamationToken: ExclamationToken = definedExternally,
        type: TypeNode = definedExternally,
        initializer: Expression = definedExternally,
    ): VariableDeclaration

    fun updateVariableDeclaration(
        node: VariableDeclaration,
        name: BindingName,
        exclamationToken: ExclamationToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): VariableDeclaration

    fun createVariableDeclarationList(
        declarations: js.array.ReadonlyArray<VariableDeclaration>,
        flags: NodeFlags = definedExternally,
    ): VariableDeclarationList

    fun updateVariableDeclarationList(
        node: VariableDeclarationList,
        declarations: js.array.ReadonlyArray<VariableDeclaration>,
    ): VariableDeclarationList

    fun createFunctionDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        asteriskToken: AsteriskToken?,
        name: String?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): FunctionDeclaration

    fun createFunctionDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        asteriskToken: AsteriskToken?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): FunctionDeclaration

    fun updateFunctionDeclaration(
        node: FunctionDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        asteriskToken: AsteriskToken?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): FunctionDeclaration

    fun createClassDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<ClassElement>,
    ): ClassDeclaration

    fun createClassDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<ClassElement>,
    ): ClassDeclaration

    fun updateClassDeclaration(
        node: ClassDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier?,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<ClassElement>,
    ): ClassDeclaration

    fun createInterfaceDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<TypeElement>,
    ): InterfaceDeclaration

    fun createInterfaceDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<TypeElement>,
    ): InterfaceDeclaration

    fun updateInterfaceDeclaration(
        node: InterfaceDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        heritageClauses: (js.array.ReadonlyArray<HeritageClause>)?,
        members: js.array.ReadonlyArray<TypeElement>,
    ): InterfaceDeclaration

    fun createTypeAliasDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        type: TypeNode,
    ): TypeAliasDeclaration

    fun createTypeAliasDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        type: TypeNode,
    ): TypeAliasDeclaration

    fun updateTypeAliasDeclaration(
        node: TypeAliasDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier,
        typeParameters: (js.array.ReadonlyArray<TypeParameterDeclaration>)?,
        type: TypeNode,
    ): TypeAliasDeclaration

    fun createEnumDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: String,
        members: js.array.ReadonlyArray<EnumMember>,
    ): EnumDeclaration

    fun createEnumDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier,
        members: js.array.ReadonlyArray<EnumMember>,
    ): EnumDeclaration

    fun updateEnumDeclaration(
        node: EnumDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: Identifier,
        members: js.array.ReadonlyArray<EnumMember>,
    ): EnumDeclaration

    fun createModuleDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: ModuleName,
        body: ModuleBody?,
        flags: NodeFlags = definedExternally,
    ): ModuleDeclaration

    fun updateModuleDeclaration(
        node: ModuleDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        name: ModuleName,
        body: ModuleBody?,
    ): ModuleDeclaration

    fun createModuleBlock(statements: js.array.ReadonlyArray<Statement>): ModuleBlock
    fun updateModuleBlock(node: ModuleBlock, statements: js.array.ReadonlyArray<Statement>): ModuleBlock
    fun createCaseBlock(clauses: js.array.ReadonlyArray<CaseOrDefaultClause>): CaseBlock
    fun updateCaseBlock(node: CaseBlock, clauses: js.array.ReadonlyArray<CaseOrDefaultClause>): CaseBlock
    fun createNamespaceExportDeclaration(name: String): NamespaceExportDeclaration

    fun createNamespaceExportDeclaration(name: Identifier): NamespaceExportDeclaration
    fun updateNamespaceExportDeclaration(node: NamespaceExportDeclaration, name: Identifier): NamespaceExportDeclaration
    fun createImportEqualsDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        isTypeOnly: Boolean,
        name: String,
        moduleReference: ModuleReference,
    ): ImportEqualsDeclaration

    fun createImportEqualsDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        isTypeOnly: Boolean,
        name: Identifier,
        moduleReference: ModuleReference,
    ): ImportEqualsDeclaration

    fun updateImportEqualsDeclaration(
        node: ImportEqualsDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        isTypeOnly: Boolean,
        name: Identifier,
        moduleReference: ModuleReference,
    ): ImportEqualsDeclaration

    fun createImportDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        importClause: ImportClause?,
        moduleSpecifier: Expression,
        attributes: ImportAttributes = definedExternally,
    ): ImportDeclaration

    fun updateImportDeclaration(
        node: ImportDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        importClause: ImportClause?,
        moduleSpecifier: Expression,
        attributes: ImportAttributes?,
    ): ImportDeclaration

    fun createImportClause(isTypeOnly: Boolean, name: Identifier?, namedBindings: NamedImportBindings?): ImportClause
    fun updateImportClause(
        node: ImportClause,
        isTypeOnly: Boolean,
        name: Identifier?,
        namedBindings: NamedImportBindings?,
    ): ImportClause

    /** @deprecated */
    fun createAssertClause(elements: NodeArray<AssertEntry>, multiLine: Boolean = definedExternally): AssertClause

    /** @deprecated */
    fun updateAssertClause(
        node: AssertClause,
        elements: NodeArray<AssertEntry>,
        multiLine: Boolean = definedExternally,
    ): AssertClause

    /** @deprecated */
    fun createAssertEntry(name: AssertionKey, value: Expression): AssertEntry

    /** @deprecated */
    fun updateAssertEntry(node: AssertEntry, name: AssertionKey, value: Expression): AssertEntry

    /** @deprecated */
    fun createImportTypeAssertionContainer(
        clause: AssertClause,
        multiLine: Boolean = definedExternally,
    ): ImportTypeAssertionContainer

    /** @deprecated */
    fun updateImportTypeAssertionContainer(
        node: ImportTypeAssertionContainer,
        clause: AssertClause,
        multiLine: Boolean = definedExternally,
    ): ImportTypeAssertionContainer

    fun createImportAttributes(
        elements: NodeArray<ImportAttribute>,
        multiLine: Boolean = definedExternally,
    ): ImportAttributes

    fun updateImportAttributes(
        node: ImportAttributes,
        elements: NodeArray<ImportAttribute>,
        multiLine: Boolean = definedExternally,
    ): ImportAttributes

    fun createImportAttribute(name: ImportAttributeName, value: Expression): ImportAttribute
    fun updateImportAttribute(node: ImportAttribute, name: ImportAttributeName, value: Expression): ImportAttribute
    fun createNamespaceImport(name: Identifier): NamespaceImport
    fun updateNamespaceImport(node: NamespaceImport, name: Identifier): NamespaceImport
    fun createNamespaceExport(name: Identifier): NamespaceExport
    fun updateNamespaceExport(node: NamespaceExport, name: Identifier): NamespaceExport
    fun createNamedImports(elements: js.array.ReadonlyArray<ImportSpecifier>): NamedImports
    fun updateNamedImports(node: NamedImports, elements: js.array.ReadonlyArray<ImportSpecifier>): NamedImports
    fun createImportSpecifier(isTypeOnly: Boolean, propertyName: Identifier?, name: Identifier): ImportSpecifier
    fun updateImportSpecifier(
        node: ImportSpecifier,
        isTypeOnly: Boolean,
        propertyName: Identifier?,
        name: Identifier,
    ): ImportSpecifier

    fun createExportAssignment(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        isExportEquals: Boolean?,
        expression: Expression,
    ): ExportAssignment

    fun updateExportAssignment(
        node: ExportAssignment,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        expression: Expression,
    ): ExportAssignment

    fun createExportDeclaration(
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        isTypeOnly: Boolean,
        exportClause: NamedExportBindings?,
        moduleSpecifier: Expression = definedExternally,
        attributes: ImportAttributes = definedExternally,
    ): ExportDeclaration

    fun updateExportDeclaration(
        node: ExportDeclaration,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
        isTypeOnly: Boolean,
        exportClause: NamedExportBindings?,
        moduleSpecifier: Expression?,
        attributes: ImportAttributes?,
    ): ExportDeclaration

    fun createNamedExports(elements: js.array.ReadonlyArray<ExportSpecifier>): NamedExports
    fun updateNamedExports(node: NamedExports, elements: js.array.ReadonlyArray<ExportSpecifier>): NamedExports
    fun createExportSpecifier(isTypeOnly: Boolean, propertyName: String?, name: String): ExportSpecifier

    fun createExportSpecifier(isTypeOnly: Boolean, propertyName: String?, name: Identifier): ExportSpecifier

    fun createExportSpecifier(isTypeOnly: Boolean, propertyName: Identifier?, name: String): ExportSpecifier

    fun createExportSpecifier(isTypeOnly: Boolean, propertyName: Identifier?, name: Identifier): ExportSpecifier
    fun updateExportSpecifier(
        node: ExportSpecifier,
        isTypeOnly: Boolean,
        propertyName: Identifier?,
        name: Identifier,
    ): ExportSpecifier

    fun createExternalModuleReference(expression: Expression): ExternalModuleReference
    fun updateExternalModuleReference(node: ExternalModuleReference, expression: Expression): ExternalModuleReference
    fun createJSDocAllType(): JSDocAllType
    fun createJSDocUnknownType(): JSDocUnknownType
    fun createJSDocNonNullableType(type: TypeNode, postfix: Boolean = definedExternally): JSDocNonNullableType
    fun updateJSDocNonNullableType(node: JSDocNonNullableType, type: TypeNode): JSDocNonNullableType
    fun createJSDocNullableType(type: TypeNode, postfix: Boolean = definedExternally): JSDocNullableType
    fun updateJSDocNullableType(node: JSDocNullableType, type: TypeNode): JSDocNullableType
    fun createJSDocOptionalType(type: TypeNode): JSDocOptionalType
    fun updateJSDocOptionalType(node: JSDocOptionalType, type: TypeNode): JSDocOptionalType
    fun createJSDocFunctionType(
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): JSDocFunctionType

    fun updateJSDocFunctionType(
        node: JSDocFunctionType,
        parameters: js.array.ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): JSDocFunctionType

    fun createJSDocVariadicType(type: TypeNode): JSDocVariadicType
    fun updateJSDocVariadicType(node: JSDocVariadicType, type: TypeNode): JSDocVariadicType
    fun createJSDocNamepathType(type: TypeNode): JSDocNamepathType
    fun updateJSDocNamepathType(node: JSDocNamepathType, type: TypeNode): JSDocNamepathType
    fun createJSDocTypeExpression(type: TypeNode): JSDocTypeExpression
    fun updateJSDocTypeExpression(node: JSDocTypeExpression, type: TypeNode): JSDocTypeExpression
    fun createJSDocNameReference(name: EntityName): JSDocNameReference

    fun createJSDocNameReference(name: JSDocMemberName): JSDocNameReference
    fun updateJSDocNameReference(node: JSDocNameReference, name: EntityName): JSDocNameReference

    fun updateJSDocNameReference(node: JSDocNameReference, name: JSDocMemberName): JSDocNameReference
    fun createJSDocMemberName(left: EntityName, right: Identifier): JSDocMemberName

    fun createJSDocMemberName(left: JSDocMemberName, right: Identifier): JSDocMemberName
    fun updateJSDocMemberName(node: JSDocMemberName, left: EntityName, right: Identifier): JSDocMemberName

    fun updateJSDocMemberName(node: JSDocMemberName, left: JSDocMemberName, right: Identifier): JSDocMemberName
    fun createJSDocLink(name: EntityName?, text: String): JSDocLink

    fun createJSDocLink(name: JSDocMemberName?, text: String): JSDocLink
    fun updateJSDocLink(node: JSDocLink, name: EntityName?, text: String): JSDocLink

    fun updateJSDocLink(node: JSDocLink, name: JSDocMemberName?, text: String): JSDocLink
    fun createJSDocLinkCode(name: EntityName?, text: String): JSDocLinkCode

    fun createJSDocLinkCode(name: JSDocMemberName?, text: String): JSDocLinkCode
    fun updateJSDocLinkCode(node: JSDocLinkCode, name: EntityName?, text: String): JSDocLinkCode

    fun updateJSDocLinkCode(node: JSDocLinkCode, name: JSDocMemberName?, text: String): JSDocLinkCode
    fun createJSDocLinkPlain(name: EntityName?, text: String): JSDocLinkPlain

    fun createJSDocLinkPlain(name: JSDocMemberName?, text: String): JSDocLinkPlain
    fun updateJSDocLinkPlain(node: JSDocLinkPlain, name: EntityName?, text: String): JSDocLinkPlain

    fun updateJSDocLinkPlain(node: JSDocLinkPlain, name: JSDocMemberName?, text: String): JSDocLinkPlain
    fun createJSDocTypeLiteral(
        jsDocPropertyTags: js.array.ReadonlyArray<JSDocPropertyLikeTag> = definedExternally,
        isArrayType: Boolean = definedExternally,
    ): JSDocTypeLiteral

    fun updateJSDocTypeLiteral(
        node: JSDocTypeLiteral,
        jsDocPropertyTags: (js.array.ReadonlyArray<JSDocPropertyLikeTag>)?,
        isArrayType: Boolean?,
    ): JSDocTypeLiteral

    fun createJSDocSignature(
        typeParameters: (js.array.ReadonlyArray<JSDocTemplateTag>)?,
        parameters: js.array.ReadonlyArray<JSDocParameterTag>,
        type: JSDocReturnTag = definedExternally,
    ): JSDocSignature

    fun updateJSDocSignature(
        node: JSDocSignature,
        typeParameters: (js.array.ReadonlyArray<JSDocTemplateTag>)?,
        parameters: js.array.ReadonlyArray<JSDocParameterTag>,
        type: JSDocReturnTag?,
    ): JSDocSignature

    fun createJSDocTemplateTag(
        tagName: Identifier?,
        constraint: JSDocTypeExpression?,
        typeParameters: js.array.ReadonlyArray<TypeParameterDeclaration>,
    ): JSDocTemplateTag

    fun createJSDocTemplateTag(
        tagName: Identifier?,
        constraint: JSDocTypeExpression?,
        typeParameters: js.array.ReadonlyArray<TypeParameterDeclaration>,
        comment: String = definedExternally,
    ): JSDocTemplateTag

    fun createJSDocTemplateTag(
        tagName: Identifier?,
        constraint: JSDocTypeExpression?,
        typeParameters: js.array.ReadonlyArray<TypeParameterDeclaration>,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocTemplateTag

    fun updateJSDocTemplateTag(
        node: JSDocTemplateTag,
        tagName: Identifier?,
        constraint: JSDocTypeExpression?,
        typeParameters: js.array.ReadonlyArray<TypeParameterDeclaration>,
        comment: String?,
    ): JSDocTemplateTag

    fun updateJSDocTemplateTag(
        node: JSDocTemplateTag,
        tagName: Identifier?,
        constraint: JSDocTypeExpression?,
        typeParameters: js.array.ReadonlyArray<TypeParameterDeclaration>,
        comment: NodeArray<JSDocComment>?,
    ): JSDocTemplateTag

    fun createJSDocTypedefTag(tagName: Identifier?): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression = definedExternally,
        fullName: Identifier = definedExternally,
        comment: String = definedExternally,
    ): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression = definedExternally,
        fullName: Identifier = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression = definedExternally,
        fullName: JSDocNamespaceDeclaration = definedExternally,
        comment: String = definedExternally,
    ): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression = definedExternally,
        fullName: JSDocNamespaceDeclaration = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral = definedExternally,
        fullName: Identifier = definedExternally,
        comment: String = definedExternally,
    ): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral = definedExternally,
        fullName: Identifier = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral = definedExternally,
        fullName: JSDocNamespaceDeclaration = definedExternally,
        comment: String = definedExternally,
    ): JSDocTypedefTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral = definedExternally,
        fullName: JSDocNamespaceDeclaration = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        fullName: Identifier?,
        comment: String?,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        fullName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        fullName: JSDocNamespaceDeclaration?,
        comment: String?,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        fullName: JSDocNamespaceDeclaration?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral?,
        fullName: Identifier?,
        comment: String?,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral?,
        fullName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral?,
        fullName: JSDocNamespaceDeclaration?,
        comment: String?,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeLiteral?,
        fullName: JSDocNamespaceDeclaration?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocTypedefTag

    fun createJSDocParameterTag(
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression = definedExternally,
        isNameFirst: Boolean = definedExternally,
        comment: String = definedExternally,
    ): JSDocParameterTag

    fun createJSDocParameterTag(
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression = definedExternally,
        isNameFirst: Boolean = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocParameterTag

    fun updateJSDocParameterTag(
        node: JSDocParameterTag,
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression?,
        isNameFirst: Boolean,
        comment: String?,
    ): JSDocParameterTag

    fun updateJSDocParameterTag(
        node: JSDocParameterTag,
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression?,
        isNameFirst: Boolean,
        comment: NodeArray<JSDocComment>?,
    ): JSDocParameterTag

    fun createJSDocPropertyTag(
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression = definedExternally,
        isNameFirst: Boolean = definedExternally,
        comment: String = definedExternally,
    ): JSDocPropertyTag

    fun createJSDocPropertyTag(
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression = definedExternally,
        isNameFirst: Boolean = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocPropertyTag

    fun updateJSDocPropertyTag(
        node: JSDocPropertyTag,
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression?,
        isNameFirst: Boolean,
        comment: String?,
    ): JSDocPropertyTag

    fun updateJSDocPropertyTag(
        node: JSDocPropertyTag,
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression?,
        isNameFirst: Boolean,
        comment: NodeArray<JSDocComment>?,
    ): JSDocPropertyTag

    fun createJSDocTypeTag(tagName: Identifier?, typeExpression: JSDocTypeExpression): JSDocTypeTag

    fun createJSDocTypeTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: String = definedExternally,
    ): JSDocTypeTag

    fun createJSDocTypeTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocTypeTag

    fun updateJSDocTypeTag(
        node: JSDocTypeTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: String?,
    ): JSDocTypeTag

    fun updateJSDocTypeTag(
        node: JSDocTypeTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: NodeArray<JSDocComment>?,
    ): JSDocTypeTag

    fun createJSDocSeeTag(tagName: Identifier?, nameExpression: JSDocNameReference?): JSDocSeeTag

    fun createJSDocSeeTag(
        tagName: Identifier?,
        nameExpression: JSDocNameReference?,
        comment: String = definedExternally,
    ): JSDocSeeTag

    fun createJSDocSeeTag(
        tagName: Identifier?,
        nameExpression: JSDocNameReference?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocSeeTag

    fun updateJSDocSeeTag(node: JSDocSeeTag, tagName: Identifier?, nameExpression: JSDocNameReference?): JSDocSeeTag

    fun updateJSDocSeeTag(
        node: JSDocSeeTag,
        tagName: Identifier?,
        nameExpression: JSDocNameReference?,
        comment: String = definedExternally,
    ): JSDocSeeTag

    fun updateJSDocSeeTag(
        node: JSDocSeeTag,
        tagName: Identifier?,
        nameExpression: JSDocNameReference?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocSeeTag

    fun createJSDocReturnTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression = definedExternally,
        comment: String = definedExternally,
    ): JSDocReturnTag

    fun createJSDocReturnTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocReturnTag

    fun updateJSDocReturnTag(
        node: JSDocReturnTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: String?,
    ): JSDocReturnTag

    fun updateJSDocReturnTag(
        node: JSDocReturnTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocReturnTag

    fun createJSDocThisTag(tagName: Identifier?, typeExpression: JSDocTypeExpression): JSDocThisTag

    fun createJSDocThisTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: String = definedExternally,
    ): JSDocThisTag

    fun createJSDocThisTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocThisTag

    fun updateJSDocThisTag(
        node: JSDocThisTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: String?,
    ): JSDocThisTag

    fun updateJSDocThisTag(
        node: JSDocThisTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocThisTag

    fun createJSDocEnumTag(tagName: Identifier?, typeExpression: JSDocTypeExpression): JSDocEnumTag

    fun createJSDocEnumTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: String = definedExternally,
    ): JSDocEnumTag

    fun createJSDocEnumTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocEnumTag

    fun updateJSDocEnumTag(
        node: JSDocEnumTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: String?,
    ): JSDocEnumTag

    fun updateJSDocEnumTag(
        node: JSDocEnumTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: NodeArray<JSDocComment>?,
    ): JSDocEnumTag

    fun createJSDocCallbackTag(tagName: Identifier?, typeExpression: JSDocSignature): JSDocCallbackTag

    fun createJSDocCallbackTag(
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: Identifier = definedExternally,
        comment: String = definedExternally,
    ): JSDocCallbackTag

    fun createJSDocCallbackTag(
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: Identifier = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocCallbackTag

    fun createJSDocCallbackTag(
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: JSDocNamespaceDeclaration = definedExternally,
        comment: String = definedExternally,
    ): JSDocCallbackTag

    fun createJSDocCallbackTag(
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: JSDocNamespaceDeclaration = definedExternally,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocCallbackTag

    fun updateJSDocCallbackTag(
        node: JSDocCallbackTag,
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: Identifier?,
        comment: String?,
    ): JSDocCallbackTag

    fun updateJSDocCallbackTag(
        node: JSDocCallbackTag,
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocCallbackTag

    fun updateJSDocCallbackTag(
        node: JSDocCallbackTag,
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: JSDocNamespaceDeclaration?,
        comment: String?,
    ): JSDocCallbackTag

    fun updateJSDocCallbackTag(
        node: JSDocCallbackTag,
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: JSDocNamespaceDeclaration?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocCallbackTag

    fun createJSDocOverloadTag(tagName: Identifier?, typeExpression: JSDocSignature): JSDocOverloadTag

    fun createJSDocOverloadTag(
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        comment: String = definedExternally,
    ): JSDocOverloadTag

    fun createJSDocOverloadTag(
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocOverloadTag

    fun updateJSDocOverloadTag(
        node: JSDocOverloadTag,
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        comment: String?,
    ): JSDocOverloadTag

    fun updateJSDocOverloadTag(
        node: JSDocOverloadTag,
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        comment: NodeArray<JSDocComment>?,
    ): JSDocOverloadTag

    fun createJSDocAugmentsTag(tagName: Identifier?, className: JSDocAugmentsTagClass): JSDocAugmentsTag

    fun createJSDocAugmentsTag(
        tagName: Identifier?,
        className: JSDocAugmentsTagClass,
        comment: String = definedExternally,
    ): JSDocAugmentsTag

    fun createJSDocAugmentsTag(
        tagName: Identifier?,
        className: JSDocAugmentsTagClass,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocAugmentsTag

    fun updateJSDocAugmentsTag(
        node: JSDocAugmentsTag,
        tagName: Identifier?,
        className: JSDocAugmentsTagClass,
        comment: String?,
    ): JSDocAugmentsTag

    fun updateJSDocAugmentsTag(
        node: JSDocAugmentsTag,
        tagName: Identifier?,
        className: JSDocAugmentsTagClass,
        comment: NodeArray<JSDocComment>?,
    ): JSDocAugmentsTag

    fun createJSDocImplementsTag(tagName: Identifier?, className: JSDocImplementsTagClass): JSDocImplementsTag

    fun createJSDocImplementsTag(
        tagName: Identifier?,
        className: JSDocImplementsTagClass,
        comment: String = definedExternally,
    ): JSDocImplementsTag

    fun createJSDocImplementsTag(
        tagName: Identifier?,
        className: JSDocImplementsTagClass,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocImplementsTag

    fun updateJSDocImplementsTag(
        node: JSDocImplementsTag,
        tagName: Identifier?,
        className: JSDocImplementsTagClass,
        comment: String?,
    ): JSDocImplementsTag

    fun updateJSDocImplementsTag(
        node: JSDocImplementsTag,
        tagName: Identifier?,
        className: JSDocImplementsTagClass,
        comment: NodeArray<JSDocComment>?,
    ): JSDocImplementsTag

    fun createJSDocAuthorTag(tagName: Identifier?): JSDocAuthorTag

    fun createJSDocAuthorTag(tagName: Identifier?, comment: String = definedExternally): JSDocAuthorTag

    fun createJSDocAuthorTag(tagName: Identifier?, comment: NodeArray<JSDocComment> = definedExternally): JSDocAuthorTag
    fun updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Identifier?, comment: String?): JSDocAuthorTag

    fun updateJSDocAuthorTag(
        node: JSDocAuthorTag,
        tagName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocAuthorTag

    fun createJSDocClassTag(tagName: Identifier?): JSDocClassTag

    fun createJSDocClassTag(tagName: Identifier?, comment: String = definedExternally): JSDocClassTag

    fun createJSDocClassTag(tagName: Identifier?, comment: NodeArray<JSDocComment> = definedExternally): JSDocClassTag
    fun updateJSDocClassTag(node: JSDocClassTag, tagName: Identifier?, comment: String?): JSDocClassTag

    fun updateJSDocClassTag(node: JSDocClassTag, tagName: Identifier?, comment: NodeArray<JSDocComment>?): JSDocClassTag
    fun createJSDocPublicTag(tagName: Identifier?): JSDocPublicTag

    fun createJSDocPublicTag(tagName: Identifier?, comment: String = definedExternally): JSDocPublicTag

    fun createJSDocPublicTag(tagName: Identifier?, comment: NodeArray<JSDocComment> = definedExternally): JSDocPublicTag
    fun updateJSDocPublicTag(node: JSDocPublicTag, tagName: Identifier?, comment: String?): JSDocPublicTag

    fun updateJSDocPublicTag(
        node: JSDocPublicTag,
        tagName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocPublicTag

    fun createJSDocPrivateTag(tagName: Identifier?): JSDocPrivateTag

    fun createJSDocPrivateTag(tagName: Identifier?, comment: String = definedExternally): JSDocPrivateTag

    fun createJSDocPrivateTag(
        tagName: Identifier?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocPrivateTag

    fun updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Identifier?, comment: String?): JSDocPrivateTag

    fun updateJSDocPrivateTag(
        node: JSDocPrivateTag,
        tagName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocPrivateTag

    fun createJSDocProtectedTag(tagName: Identifier?): JSDocProtectedTag

    fun createJSDocProtectedTag(tagName: Identifier?, comment: String = definedExternally): JSDocProtectedTag

    fun createJSDocProtectedTag(
        tagName: Identifier?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocProtectedTag

    fun updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Identifier?, comment: String?): JSDocProtectedTag

    fun updateJSDocProtectedTag(
        node: JSDocProtectedTag,
        tagName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocProtectedTag

    fun createJSDocReadonlyTag(tagName: Identifier?): JSDocReadonlyTag

    fun createJSDocReadonlyTag(tagName: Identifier?, comment: String = definedExternally): JSDocReadonlyTag

    fun createJSDocReadonlyTag(
        tagName: Identifier?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocReadonlyTag

    fun updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Identifier?, comment: String?): JSDocReadonlyTag

    fun updateJSDocReadonlyTag(
        node: JSDocReadonlyTag,
        tagName: Identifier?,
        comment: NodeArray<JSDocComment>?,
    ): JSDocReadonlyTag

    fun createJSDocUnknownTag(tagName: Identifier): JSDocUnknownTag

    fun createJSDocUnknownTag(tagName: Identifier, comment: String = definedExternally): JSDocUnknownTag

    fun createJSDocUnknownTag(
        tagName: Identifier,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocUnknownTag

    fun updateJSDocUnknownTag(node: JSDocUnknownTag, tagName: Identifier, comment: String?): JSDocUnknownTag

    fun updateJSDocUnknownTag(
        node: JSDocUnknownTag,
        tagName: Identifier,
        comment: NodeArray<JSDocComment>?,
    ): JSDocUnknownTag

    fun createJSDocDeprecatedTag(tagName: Identifier?): JSDocDeprecatedTag

    fun createJSDocDeprecatedTag(tagName: Identifier?, comment: String = definedExternally): JSDocDeprecatedTag

    fun createJSDocDeprecatedTag(
        tagName: Identifier?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocDeprecatedTag

    fun updateJSDocDeprecatedTag(node: JSDocDeprecatedTag, tagName: Identifier?): JSDocDeprecatedTag

    fun updateJSDocDeprecatedTag(
        node: JSDocDeprecatedTag,
        tagName: Identifier?,
        comment: String = definedExternally,
    ): JSDocDeprecatedTag

    fun updateJSDocDeprecatedTag(
        node: JSDocDeprecatedTag,
        tagName: Identifier?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocDeprecatedTag

    fun createJSDocOverrideTag(tagName: Identifier?): JSDocOverrideTag

    fun createJSDocOverrideTag(tagName: Identifier?, comment: String = definedExternally): JSDocOverrideTag

    fun createJSDocOverrideTag(
        tagName: Identifier?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocOverrideTag

    fun updateJSDocOverrideTag(node: JSDocOverrideTag, tagName: Identifier?): JSDocOverrideTag

    fun updateJSDocOverrideTag(
        node: JSDocOverrideTag,
        tagName: Identifier?,
        comment: String = definedExternally,
    ): JSDocOverrideTag

    fun updateJSDocOverrideTag(
        node: JSDocOverrideTag,
        tagName: Identifier?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocOverrideTag

    fun createJSDocThrowsTag(tagName: Identifier, typeExpression: JSDocTypeExpression?): JSDocThrowsTag

    fun createJSDocThrowsTag(
        tagName: Identifier,
        typeExpression: JSDocTypeExpression?,
        comment: String = definedExternally,
    ): JSDocThrowsTag

    fun createJSDocThrowsTag(
        tagName: Identifier,
        typeExpression: JSDocTypeExpression?,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocThrowsTag

    fun updateJSDocThrowsTag(
        node: JSDocThrowsTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
    ): JSDocThrowsTag

    fun updateJSDocThrowsTag(
        node: JSDocThrowsTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: String? = definedExternally,
    ): JSDocThrowsTag

    fun updateJSDocThrowsTag(
        node: JSDocThrowsTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: NodeArray<JSDocComment>? = definedExternally,
    ): JSDocThrowsTag

    fun createJSDocSatisfiesTag(tagName: Identifier?, typeExpression: JSDocTypeExpression): JSDocSatisfiesTag

    fun createJSDocSatisfiesTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: String = definedExternally,
    ): JSDocSatisfiesTag

    fun createJSDocSatisfiesTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: NodeArray<JSDocComment> = definedExternally,
    ): JSDocSatisfiesTag

    fun updateJSDocSatisfiesTag(
        node: JSDocSatisfiesTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: String?,
    ): JSDocSatisfiesTag

    fun updateJSDocSatisfiesTag(
        node: JSDocSatisfiesTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: NodeArray<JSDocComment>?,
    ): JSDocSatisfiesTag

    fun createJSDocText(text: String): JSDocText
    fun updateJSDocText(node: JSDocText, text: String): JSDocText
    fun createJSDocComment(): JSDoc

    fun createJSDocComment(
        comment: String? = definedExternally,
        tags: (js.array.ReadonlyArray<JSDocTag>)? = definedExternally,
    ): JSDoc

    fun createJSDocComment(
        comment: NodeArray<JSDocComment>? = definedExternally,
        tags: (js.array.ReadonlyArray<JSDocTag>)? = definedExternally,
    ): JSDoc

    fun updateJSDocComment(node: JSDoc, comment: String?, tags: (js.array.ReadonlyArray<JSDocTag>)?): JSDoc

    fun updateJSDocComment(
        node: JSDoc,
        comment: NodeArray<JSDocComment>?,
        tags: (js.array.ReadonlyArray<JSDocTag>)?,
    ): JSDoc

    fun createJsxElement(
        openingElement: JsxOpeningElement,
        children: js.array.ReadonlyArray<JsxChild>,
        closingElement: JsxClosingElement,
    ): JsxElement

    fun updateJsxElement(
        node: JsxElement,
        openingElement: JsxOpeningElement,
        children: js.array.ReadonlyArray<JsxChild>,
        closingElement: JsxClosingElement,
    ): JsxElement

    fun createJsxSelfClosingElement(
        tagName: JsxTagNameExpression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        attributes: JsxAttributes,
    ): JsxSelfClosingElement

    fun updateJsxSelfClosingElement(
        node: JsxSelfClosingElement,
        tagName: JsxTagNameExpression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        attributes: JsxAttributes,
    ): JsxSelfClosingElement

    fun createJsxOpeningElement(
        tagName: JsxTagNameExpression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        attributes: JsxAttributes,
    ): JsxOpeningElement

    fun updateJsxOpeningElement(
        node: JsxOpeningElement,
        tagName: JsxTagNameExpression,
        typeArguments: (js.array.ReadonlyArray<TypeNode>)?,
        attributes: JsxAttributes,
    ): JsxOpeningElement

    fun createJsxClosingElement(tagName: JsxTagNameExpression): JsxClosingElement
    fun updateJsxClosingElement(node: JsxClosingElement, tagName: JsxTagNameExpression): JsxClosingElement
    fun createJsxFragment(
        openingFragment: JsxOpeningFragment,
        children: js.array.ReadonlyArray<JsxChild>,
        closingFragment: JsxClosingFragment,
    ): JsxFragment

    fun createJsxText(text: String, containsOnlyTriviaWhiteSpaces: Boolean = definedExternally): JsxText
    fun updateJsxText(node: JsxText, text: String, containsOnlyTriviaWhiteSpaces: Boolean = definedExternally): JsxText
    fun createJsxOpeningFragment(): JsxOpeningFragment
    fun createJsxJsxClosingFragment(): JsxClosingFragment
    fun updateJsxFragment(
        node: JsxFragment,
        openingFragment: JsxOpeningFragment,
        children: js.array.ReadonlyArray<JsxChild>,
        closingFragment: JsxClosingFragment,
    ): JsxFragment

    fun createJsxAttribute(name: JsxAttributeName, initializer: JsxAttributeValue?): JsxAttribute
    fun updateJsxAttribute(node: JsxAttribute, name: JsxAttributeName, initializer: JsxAttributeValue?): JsxAttribute
    fun createJsxAttributes(properties: js.array.ReadonlyArray<JsxAttributeLike>): JsxAttributes
    fun updateJsxAttributes(node: JsxAttributes, properties: js.array.ReadonlyArray<JsxAttributeLike>): JsxAttributes
    fun createJsxSpreadAttribute(expression: Expression): JsxSpreadAttribute
    fun updateJsxSpreadAttribute(node: JsxSpreadAttribute, expression: Expression): JsxSpreadAttribute
    fun createJsxExpression(dotDotDotToken: DotDotDotToken?, expression: Expression?): JsxExpression
    fun updateJsxExpression(node: JsxExpression, expression: Expression?): JsxExpression
    fun createJsxNamespacedName(namespace: Identifier, name: Identifier): JsxNamespacedName
    fun updateJsxNamespacedName(node: JsxNamespacedName, namespace: Identifier, name: Identifier): JsxNamespacedName
    fun createCaseClause(expression: Expression, statements: js.array.ReadonlyArray<Statement>): CaseClause
    fun updateCaseClause(
        node: CaseClause,
        expression: Expression,
        statements: js.array.ReadonlyArray<Statement>,
    ): CaseClause

    fun createDefaultClause(statements: js.array.ReadonlyArray<Statement>): DefaultClause
    fun updateDefaultClause(node: DefaultClause, statements: js.array.ReadonlyArray<Statement>): DefaultClause
    fun createHeritageClause(
        token: NodeFactoryCreateHeritageClauseToken,
        types: js.array.ReadonlyArray<ExpressionWithTypeArguments>,
    ): HeritageClause

    fun updateHeritageClause(
        node: HeritageClause,
        types: js.array.ReadonlyArray<ExpressionWithTypeArguments>,
    ): HeritageClause

    fun createCatchClause(variableDeclaration: String?, block: Block): CatchClause

    fun createCatchClause(variableDeclaration: BindingName?, block: Block): CatchClause

    fun createCatchClause(variableDeclaration: VariableDeclaration?, block: Block): CatchClause
    fun updateCatchClause(node: CatchClause, variableDeclaration: VariableDeclaration?, block: Block): CatchClause
    fun createPropertyAssignment(name: String, initializer: Expression): PropertyAssignment

    fun createPropertyAssignment(name: PropertyName, initializer: Expression): PropertyAssignment
    fun updatePropertyAssignment(
        node: PropertyAssignment,
        name: PropertyName,
        initializer: Expression,
    ): PropertyAssignment

    fun createShorthandPropertyAssignment(
        name: String,
        objectAssignmentInitializer: Expression = definedExternally,
    ): ShorthandPropertyAssignment

    fun createShorthandPropertyAssignment(
        name: Identifier,
        objectAssignmentInitializer: Expression = definedExternally,
    ): ShorthandPropertyAssignment

    fun updateShorthandPropertyAssignment(
        node: ShorthandPropertyAssignment,
        name: Identifier,
        objectAssignmentInitializer: Expression?,
    ): ShorthandPropertyAssignment

    fun createSpreadAssignment(expression: Expression): SpreadAssignment
    fun updateSpreadAssignment(node: SpreadAssignment, expression: Expression): SpreadAssignment
    fun createEnumMember(name: String, initializer: Expression = definedExternally): EnumMember

    fun createEnumMember(name: PropertyName, initializer: Expression = definedExternally): EnumMember
    fun updateEnumMember(node: EnumMember, name: PropertyName, initializer: Expression?): EnumMember
    fun createSourceFile(
        statements: js.array.ReadonlyArray<Statement>,
        endOfFileToken: EndOfFileToken,
        flags: NodeFlags,
    ): SourceFile

    fun updateSourceFile(
        node: SourceFile,
        statements: js.array.ReadonlyArray<Statement>,
        isDeclarationFile: Boolean = definedExternally,
        referencedFiles: js.array.ReadonlyArray<FileReference> = definedExternally,
        typeReferences: js.array.ReadonlyArray<FileReference> = definedExternally,
        hasNoDefaultLib: Boolean = definedExternally,
        libReferences: js.array.ReadonlyArray<FileReference> = definedExternally,
    ): SourceFile

    fun createNotEmittedStatement(original: Node): NotEmittedStatement
    fun createPartiallyEmittedExpression(
        expression: Expression,
        original: Node = definedExternally,
    ): PartiallyEmittedExpression

    fun updatePartiallyEmittedExpression(
        node: PartiallyEmittedExpression,
        expression: Expression,
    ): PartiallyEmittedExpression

    fun createCommaListExpression(elements: js.array.ReadonlyArray<Expression>): CommaListExpression
    fun updateCommaListExpression(
        node: CommaListExpression,
        elements: js.array.ReadonlyArray<Expression>,
    ): CommaListExpression

    fun createBundle(sourceFiles: js.array.ReadonlyArray<SourceFile>): Bundle

    /** @deprecated*/
    fun createBundle(
        sourceFiles: js.array.ReadonlyArray<SourceFile>,
        prepends: js.array.ReadonlyArray<(NodeFactoryCreateBundlePrependsItem)> = definedExternally,
    ): Bundle

    fun updateBundle(node: Bundle, sourceFiles: js.array.ReadonlyArray<SourceFile>): Bundle

    /** @deprecated*/
    fun updateBundle(
        node: Bundle,
        sourceFiles: js.array.ReadonlyArray<SourceFile>,
        prepends: js.array.ReadonlyArray<(NodeFactoryUpdateBundlePrependsItem)> = definedExternally,
    ): Bundle

    fun createComma(left: Expression, right: Expression): BinaryExpression
    fun createAssignment(left: ObjectLiteralExpression, right: Expression): DestructuringAssignment

    fun createAssignment(left: ArrayLiteralExpression, right: Expression): DestructuringAssignment
    fun createAssignment(left: Expression, right: Expression): AssignmentExpression<EqualsToken>
    fun createLogicalOr(left: Expression, right: Expression): BinaryExpression
    fun createLogicalAnd(left: Expression, right: Expression): BinaryExpression
    fun createBitwiseOr(left: Expression, right: Expression): BinaryExpression
    fun createBitwiseXor(left: Expression, right: Expression): BinaryExpression
    fun createBitwiseAnd(left: Expression, right: Expression): BinaryExpression
    fun createStrictEquality(left: Expression, right: Expression): BinaryExpression
    fun createStrictInequality(left: Expression, right: Expression): BinaryExpression
    fun createEquality(left: Expression, right: Expression): BinaryExpression
    fun createInequality(left: Expression, right: Expression): BinaryExpression
    fun createLessThan(left: Expression, right: Expression): BinaryExpression
    fun createLessThanEquals(left: Expression, right: Expression): BinaryExpression
    fun createGreaterThan(left: Expression, right: Expression): BinaryExpression
    fun createGreaterThanEquals(left: Expression, right: Expression): BinaryExpression
    fun createLeftShift(left: Expression, right: Expression): BinaryExpression
    fun createRightShift(left: Expression, right: Expression): BinaryExpression
    fun createUnsignedRightShift(left: Expression, right: Expression): BinaryExpression
    fun createAdd(left: Expression, right: Expression): BinaryExpression
    fun createSubtract(left: Expression, right: Expression): BinaryExpression
    fun createMultiply(left: Expression, right: Expression): BinaryExpression
    fun createDivide(left: Expression, right: Expression): BinaryExpression
    fun createModulo(left: Expression, right: Expression): BinaryExpression
    fun createExponent(left: Expression, right: Expression): BinaryExpression
    fun createPrefixPlus(operand: Expression): PrefixUnaryExpression
    fun createPrefixMinus(operand: Expression): PrefixUnaryExpression
    fun createPrefixIncrement(operand: Expression): PrefixUnaryExpression
    fun createPrefixDecrement(operand: Expression): PrefixUnaryExpression
    fun createBitwiseNot(operand: Expression): PrefixUnaryExpression
    fun createLogicalNot(operand: Expression): PrefixUnaryExpression
    fun createPostfixIncrement(operand: Expression): PostfixUnaryExpression
    fun createPostfixDecrement(operand: Expression): PostfixUnaryExpression
    fun createImmediatelyInvokedFunctionExpression(statements: js.array.ReadonlyArray<Statement>): CallExpression
    fun createImmediatelyInvokedFunctionExpression(
        statements: js.array.ReadonlyArray<Statement>,
        param: ParameterDeclaration,
        paramValue: Expression,
    ): CallExpression

    fun createImmediatelyInvokedArrowFunction(statements: js.array.ReadonlyArray<Statement>): ImmediatelyInvokedArrowFunction
    fun createImmediatelyInvokedArrowFunction(
        statements: js.array.ReadonlyArray<Statement>,
        param: ParameterDeclaration,
        paramValue: Expression,
    ): ImmediatelyInvokedArrowFunction

    fun createVoidZero(): VoidExpression
    fun createExportDefault(expression: Expression): ExportAssignment
    fun createExternalModuleExport(exportName: Identifier): ExportDeclaration
    fun restoreOuterExpressions(
        outerExpression: Expression?,
        innerExpression: Expression,
        kinds: OuterExpressionKinds = definedExternally,
    ): Expression

    /**
     * Updates a node that may contain modifiers, replacing only the modifiers of the node.
     */
    fun <T : HasModifiers> replaceModifiers(node: T, modifiers: (js.array.ReadonlyArray<Modifier>)?): T

    /**
     * Updates a node that may contain modifiers, replacing only the modifiers of the node.
     */
    fun <T : HasModifiers> replaceModifiers(node: T, modifiers: ModifierFlags?): T

    /**
     * Updates a node that may contain decorators or modifiers, replacing only the decorators and modifiers of the node.
     */
    fun <T : NodeFactoryReplaceDecoratorsAndModifiersTConstraint> replaceDecoratorsAndModifiers(
        node: T,
        modifiers: (js.array.ReadonlyArray<ModifierLike>)?,
    ): T

    /**
     * Updates a node that contains a property name, replacing only the name of the node.
     */
    fun <T : NodeFactoryReplacePropertyNameTConstraint> replacePropertyName(node: T, name: Any?): T
}
