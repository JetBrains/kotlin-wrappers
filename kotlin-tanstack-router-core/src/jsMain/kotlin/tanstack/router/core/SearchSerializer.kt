package tanstack.router.core

import js.objects.ReadonlyRecord

typealias SearchSerializer = (
    searchObj: ReadonlyRecord<String, *>,
) -> String
