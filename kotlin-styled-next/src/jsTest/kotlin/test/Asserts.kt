package test

import web.cssom.ClassName

fun assertContains(className: ClassName, value: String) {
    kotlin.test.assertContains(className.toString(), value)
}
