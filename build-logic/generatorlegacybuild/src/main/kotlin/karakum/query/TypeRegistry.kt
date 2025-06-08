package karakum.query

class TypeRegistry(
    types: List<TypeBase>,
) {
    private val typeMap = types.associateBy { it.name }

    private val membersMap = types.associate {
        it.name to it.memberNames()
    }

    private fun updateOverride(
        type: TypeBase,
        parentName: String,
    ) {
        val parentMembers = when (type.name) {
            "InfiniteQueryObserver" -> setOf("bindMethods", "getOptimisticResult")
            else -> membersMap[parentName] ?: return
        }

        for (member in type.members) {
            if (member.name in parentMembers) {
                member.overridden = true
            }
        }
    }

    init {
        for (type in types) {
            val parentName = type.parentName ?: continue
            updateOverride(type, parentName)

            // val parentParentName = typeMap.getValue(parentName).parentName ?: continue
            val parentParentName = typeMap[parentName]?.parentName ?: continue
            updateOverride(type, parentParentName)
        }
    }
}

private fun TypeBase.memberNames(): Set<String> =
    members.asSequence()
        .map { it.name }
        .toSet()
