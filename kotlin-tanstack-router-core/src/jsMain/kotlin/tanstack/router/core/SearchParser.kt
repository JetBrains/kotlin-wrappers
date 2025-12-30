package tanstack.router.core

import js.objects.ReadonlyRecord

typealias SearchParser = (
    searchStr: String,
) -> ReadonlyRecord<String, *>
